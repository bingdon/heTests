package com.wyy.myhealth.test;

import com.wyy.myhealth.ui.collect.CollectActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

public class CollectActivityTests extends
		ActivityInstrumentationTestCase2<CollectActivity> {

	public CollectActivityTests() {
		super(CollectActivity.class);
		// TODO Auto-generated constructor stub
	}

	public void testActivityTestCaseSetUpProperly() {
		assertNotNull("activity should be launched successfully", getActivity());
	}

	public void test() {
		CollectActivity collectActivity = new CollectActivity();
		Log.i("CollectActivityTests",
				"CollectActivity:" + collectActivity.getTitle());
	}

}
