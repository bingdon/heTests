package com.wyy.myhealth.test;

import com.wyy.myhealth.ui.scan.ShareFoodActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

public class ShareFoodActivityTests extends ActivityInstrumentationTestCase2<ShareFoodActivity> {

	public ShareFoodActivityTests() {
		super(ShareFoodActivity.class);
		// TODO Auto-generated constructor stub
	}

	public void testActivityTestCaseSetUpProperly() {
        assertNotNull("activity should be launched successfully", getActivity());
    }

	public void test(){
		ShareFoodActivity shareFoodActivity=new ShareFoodActivity();
		Log.i("ShareFoodActivityTests", "ShareFoodActivity:"+shareFoodActivity);
	}
	
}
