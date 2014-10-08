package com.wyy.myhealth.test.view;

import com.wyy.myhealth.ui.navigation.ShareFoodNavActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

public class ShareNavActivityTests extends
		ActivityInstrumentationTestCase2<ShareFoodNavActivity> {

	public ShareNavActivityTests() {
		super(ShareFoodNavActivity.class);
		// TODO Auto-generated constructor stub
	}

	public void testActivityTestCaseSetUpProperly() {
		assertNotNull("activity should be launched successfully", getActivity());
	}

	public void test() {
		ShareFoodNavActivity shareFoodNavActivity = new ShareFoodNavActivity();
		Log.i("ShareNavActivityTests", "ShareFoodNavActivity:"
				+ shareFoodNavActivity);
	}

}
