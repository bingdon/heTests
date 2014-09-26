package com.wyy.myhealth.test;

import com.wyy.myhealth.HealthReActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

public class HealthReActivityTests extends ActivityInstrumentationTestCase2<HealthReActivity> {

	public HealthReActivityTests() {
		super(HealthReActivity.class);
		// TODO Auto-generated constructor stub
	}

	
	public void testActivityTestCaseSetUpProperly() {
        assertNotNull("activity should be launched successfully", getActivity());
    }
	
	public void test(){
		HealthReActivity healthReActivity=new HealthReActivity();
		Log.i("HealthReActivityTests", "HealthReActivity:"+healthReActivity);
	}
	
}
