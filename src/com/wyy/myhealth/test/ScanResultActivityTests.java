package com.wyy.myhealth.test;

import com.wyy.myhealth.ui.scan.ScanResultActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

public class ScanResultActivityTests extends
		ActivityInstrumentationTestCase2<ScanResultActivity> {

	public ScanResultActivityTests() {
		super(ScanResultActivity.class);
		// TODO Auto-generated constructor stub
	}

	public void testActivityTestCaseSetUpProperly() {
        assertNotNull("activity should be launched successfully", getActivity());
    }

	public void test(){
		ScanResultActivity scanResultActivity=new ScanResultActivity();
		Log.i("ScanResultActivityTests", "ScanResultActivity:"+scanResultActivity);
	}
	
}
