package com.wyy.myhealth.test;

import com.wyy.myhealth.ui.fooddetails.FoodCommentActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

public class FoodCommentActivityTests extends
		ActivityInstrumentationTestCase2<FoodCommentActivity> {

	public FoodCommentActivityTests() {
		super(FoodCommentActivity.class);
		// TODO Auto-generated constructor stub
	}

	public void testActivityTestCaseSetUpProperly() {
        assertNotNull("activity should be launched successfully", getActivity());
    }

	public void test(){
		FoodCommentActivity foodCommentActivity=new FoodCommentActivity();
		Log.i("FoodCommentActivityTests", "FoodCommentActivity:"+foodCommentActivity);
	}
	
}
