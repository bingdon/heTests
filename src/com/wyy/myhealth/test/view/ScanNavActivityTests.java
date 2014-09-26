package com.wyy.myhealth.test.view;

import com.wyy.myhealth.ui.navigation.ScanNavActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

public class ScanNavActivityTests extends
		ActivityInstrumentationTestCase2<ScanNavActivity> {

	public ScanNavActivityTests() {
		super(ScanNavActivity.class);
		// TODO Auto-generated constructor stub
	}

	public void testActivityTestCaseSetUpProperly() {
		assertNotNull("activity should be launched successfully", getActivity());
	}

	public void test() {
		ScanNavActivity scanNavActivity = new ScanNavActivity();
		Log.i("ScanNavActivityTests", "ScanNavActivity:" + scanNavActivity);
	}

}
