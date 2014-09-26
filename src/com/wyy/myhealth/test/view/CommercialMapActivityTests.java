package com.wyy.myhealth.test.view;

import com.wyy.myhealth.ui.mapfood.CommercialMapActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

public class CommercialMapActivityTests extends
		ActivityInstrumentationTestCase2<CommercialMapActivity> {

	public CommercialMapActivityTests() {
		super(CommercialMapActivity.class);
		// TODO Auto-generated constructor stub
	}
	
	public void testActivityTestCaseSetUpProperly() {
        assertNotNull("activity should be launched successfully", getActivity());
    }

	public void test(){
		CommercialMapActivity commercialMapActivity=new CommercialMapActivity();
		Log.i("CommercialMapActivityTests", "CommercialMapActivity:"+commercialMapActivity);
	}
	
	

}
