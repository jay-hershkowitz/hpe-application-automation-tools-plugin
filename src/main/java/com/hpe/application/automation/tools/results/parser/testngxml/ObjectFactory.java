//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.13 at 09:25:36 AM CST 
//


package com.hpe.application.automation.tools.results.parser.testngxml;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TestngResults }
     * 
     */
    public TestngResults createTestngResults() {
        return new TestngResults();
    }

    /**
     * Create an instance of {@link TestngResults.Suite }
     * 
     */
    public TestngResults.Suite createTestngResultsSuite() {
        return new TestngResults.Suite();
    }

    /**
     * Create an instance of {@link TestngResults.Suite.Test }
     * 
     */
    public TestngResults.Suite.Test createTestngResultsSuiteTest() {
        return new TestngResults.Suite.Test();
    }

    /**
     * Create an instance of {@link TestngResults.Suite.Test.Class }
     * 
     */
    public TestngResults.Suite.Test.Class createTestngResultsSuiteTestClass() {
        return new TestngResults.Suite.Test.Class();
    }

    /**
     * Create an instance of {@link TestngResults.Suite.Test.Class.TestMethod }
     * 
     */
    public TestngResults.Suite.Test.Class.TestMethod createTestngResultsSuiteTestClassTestMethod() {
        return new TestngResults.Suite.Test.Class.TestMethod();
    }

    /**
     * Create an instance of {@link TestngResults.Suite.Groups }
     * 
     */
    public TestngResults.Suite.Groups createTestngResultsSuiteGroups() {
        return new TestngResults.Suite.Groups();
    }

    /**
     * Create an instance of {@link TestngResults.Suite.Groups.Group }
     * 
     */
    public TestngResults.Suite.Groups.Group createTestngResultsSuiteGroupsGroup() {
        return new TestngResults.Suite.Groups.Group();
    }

    /**
     * Create an instance of {@link NewDataSet }
     * 
     */
    public NewDataSet createNewDataSet() {
        return new NewDataSet();
    }

    /**
     * Create an instance of {@link TestngResults.Suite.Test.Class.TestMethod.Exception }
     * 
     */
    public TestngResults.Suite.Test.Class.TestMethod.Exception createTestngResultsSuiteTestClassTestMethodException() {
        return new TestngResults.Suite.Test.Class.TestMethod.Exception();
    }

    /**
     * Create an instance of {@link TestngResults.Suite.Groups.Group.Method }
     * 
     */
    public TestngResults.Suite.Groups.Group.Method createTestngResultsSuiteGroupsGroupMethod() {
        return new TestngResults.Suite.Groups.Group.Method();
    }

}