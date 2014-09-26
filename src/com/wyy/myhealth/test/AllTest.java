package com.wyy.myhealth.test;

import android.test.suitebuilder.TestSuiteBuilder;


import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTest extends TestSuite {
	public static Test suite() {
		return new TestSuiteBuilder(AllTest.class)
				.includeAllPackagesUnderHere().build();
	}
}
