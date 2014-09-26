package com.wyy.myhealth.test;

import com.wyy.myhealth.ui.fooddetails.FoodDetailsActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

public class FoodDetailsActivityTests extends
		ActivityInstrumentationTestCase2<FoodDetailsActivity> {

	public FoodDetailsActivityTests() {
		super(FoodDetailsActivity.class);
		// TODO Auto-generated constructor stub
	}

	public void testActivityTestCaseSetUpProperly() {
		assertNotNull("activity should be launched successfully", getActivity());
	}

	public void test() {
		FoodDetailsActivity foodDetailsActivity = new FoodDetailsActivity();
		Log.i("FoodDetailsActivityTests", "FoodDetailsActivity:" + foodDetailsActivity);
	}
}
