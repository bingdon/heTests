package com.wyy.myhealth.test.view;

import com.wyy.myhealth.ui.navigation.YaoNavActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

public class YaoNavActivityTests extends ActivityInstrumentationTestCase2<YaoNavActivity> {

	public YaoNavActivityTests() {
		super(YaoNavActivity.class);
		// TODO Auto-generated constructor stub
	}
	
	public void testActivityTestCaseSetUpProperly() {
        assertNotNull("activity should be launched successfully", getActivity());
    }

	public void test(){
		YaoNavActivity yaoNavActivity=new YaoNavActivity();
		Log.i("YaoNavActivityTests", "YaoNavActivity:"+yaoNavActivity);
	}
	

}
