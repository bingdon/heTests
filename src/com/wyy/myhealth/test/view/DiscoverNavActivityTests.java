package com.wyy.myhealth.test.view;

import com.wyy.myhealth.ui.navigation.DiscoverNavActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

public class DiscoverNavActivityTests extends
		ActivityInstrumentationTestCase2<DiscoverNavActivity> {

	public DiscoverNavActivityTests() {
		super(DiscoverNavActivity.class);
		// TODO Auto-generated constructor stub
	}

	public void testActivityTestCaseSetUpProperly() {
		assertNotNull("activity should be launched successfully", getActivity());
	}

	public void test() {
		DiscoverNavActivity discoverNavActivity = new DiscoverNavActivity();
		Log.i("DiscoverNavActivityTests", "DiscoverNavActivity:"
				+ discoverNavActivity);
	}

}
