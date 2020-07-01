/*
 *
 *  Certain versions of software and/or documents (“Material”) accessible here may contain branding from
 *  Hewlett-Packard Company (now HP Inc.) and Hewlett Packard Enterprise Company.  As of September 1, 2017,
 *  the Material is now offered by Micro Focus, a separately owned and operated company.  Any reference to the HP
 *  and Hewlett Packard Enterprise/HPE marks is historical in nature, and the HP and Hewlett Packard Enterprise/HPE
 *  marks are the property of their respective owners.
 * __________________________________________________________________
 * MIT License
 *
 * © Copyright 2012-2019 Micro Focus or one of its affiliates..
 *
 * The only warranties for products and services of Micro Focus and its affiliates
 * and licensors (“Micro Focus”) are set forth in the express warranty statements
 * accompanying such products and services. Nothing herein should be construed as
 * constituting an additional warranty. Micro Focus shall not be liable for technical
 * or editorial errors or omissions contained herein.
 * The information contained herein is subject to change without notice.
 * ___________________________________________________________________
 *
 */

package com.microfocus.application.automation.tools.commonResultUpload.rest;

import com.microfocus.application.automation.tools.commonResultUpload.CommonUploadLogger;
import com.microfocus.application.automation.tools.rest.RestClient;
import com.microfocus.application.automation.tools.sse.common.XPathUtils;
import com.microfocus.application.automation.tools.sse.sdk.ResourceAccessLevel;
import com.microfocus.application.automation.tools.sse.sdk.Response;
import org.apache.commons.lang.StringUtils;

import java.util.List;
import java.util.Map;

public class GetAlmEntityRequest {

    private RestClient client;
    private CommonUploadLogger logger;

    public GetAlmEntityRequest(RestClient client, CommonUploadLogger logger) {
        this.client = client;
        this.logger = logger;
    }

    public List<Map<String, String>> perform(String id, String restPrefix, String queryString) {
        String suffix = StringUtils.isEmpty(id)
                ? restPrefix
                : String.format("%s/%s", restPrefix, id);
        String url = client.buildRestRequest(suffix);
        Response response = client.httpGet(
                url,
                queryString,
                null,
                ResourceAccessLevel.PROTECTED);
        if (response.isOk() && !response.toString().equals("")) {
            List<Map<String, String>> results = XPathUtils.toEntities(response.toString());
            return results;
        } else {
            logger.error("Get entities failed from: " + url);
            logger.error(response.getFailure().toString());
            return null;
        }
    }
}
