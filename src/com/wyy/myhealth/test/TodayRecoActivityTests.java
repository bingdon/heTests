package com.wyy.myhealth.test;

import com.wyy.myhealth.ui.yaoyingyang.TodayFoodRecActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

public class TodayRecoActivityTests extends ActivityInstrumentationTestCase2<TodayFoodRecActivity> {

	public TodayRecoActivityTests() {
		super(TodayFoodRecActivity.class);
		// TODO Auto-generated constructor stub
	}
	public void testActivityTestCaseSetUpProperly() {
        assertNotNull("activity should be launched successfully", getActivity());
    }

	public void test(){
		TodayFoodRecActivity todayFoodRecActivity=new TodayFoodRecActivity();
		Log.i("TodayRecoActivityTests", "TodayFoodRecActivity:"+todayFoodRecActivity);
	}
}
