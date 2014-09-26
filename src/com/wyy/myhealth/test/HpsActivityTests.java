package com.wyy.myhealth.test;

import com.wyy.myhealth.ui.healthbar.HealthPassActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

public class HpsActivityTests extends ActivityInstrumentationTestCase2<HealthPassActivity> {

	public HpsActivityTests() {
		super(HealthPassActivity.class);
		// TODO Auto-generated constructor stub
	}

	
	public void testActivityTestCaseSetUpProperly() {
        assertNotNull("activity should be launched successfully", getActivity());
    }
	
	public void test(){
		HealthPassActivity healthPassActivity=new HealthPassActivity();
		Log.i("HpsActivityTests", "HealthPassActivity:"+healthPassActivity);
	}
	
}
