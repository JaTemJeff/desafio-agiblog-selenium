package com.jeff.agiblog.bdd.runner;

import org.junit.platform.suite.api.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = "cucumber.glue", value = "com.jeff.agiblog.bdd")
public class RunCucumberTest {
}