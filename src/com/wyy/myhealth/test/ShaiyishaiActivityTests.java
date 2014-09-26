package com.wyy.myhealth.test;

import com.wyy.myhealth.ui.shaiyishai.ShaiyishaiActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

public class ShaiyishaiActivityTests extends
		ActivityInstrumentationTestCase2<ShaiyishaiActivity> {

	public ShaiyishaiActivityTests() {
		super(ShaiyishaiActivity.class);
		// TODO Auto-generated constructor stub
	}

	public void testActivityTestCaseSetUpProperly() {
        assertNotNull("activity should be launched successfully", getActivity());
    }
	
	public void test(){
		ShaiyishaiActivity shaiyishaiActivity=new ShaiyishaiActivity();
		Log.i("ShaiyishaiActivity", "ShaiyishaiActivity:"+shaiyishaiActivity);
	}
}
