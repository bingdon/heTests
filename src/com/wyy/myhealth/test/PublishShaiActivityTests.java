package com.wyy.myhealth.test;

import com.wyy.myhealth.ui.healthbar.PublishMoodActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

public class PublishShaiActivityTests extends
		ActivityInstrumentationTestCase2<PublishMoodActivity> {

	public PublishShaiActivityTests() {
		super(PublishMoodActivity.class);
		// TODO Auto-generated constructor stub
	}
	public void testActivityTestCaseSetUpProperly() {
        assertNotNull("activity should be launched successfully", getActivity());
    }

	public void test(){
		PublishMoodActivity publishMoodActivity=new PublishMoodActivity();
		Log.i("PublishShaiActivityTests", "PublishMoodActivity:"+publishMoodActivity);
	}
}
