package com.wyy.myhealth.test;

import com.wyy.myhealth.ui.healthbar.MsgListActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

public class MsgListActivityTests extends
		ActivityInstrumentationTestCase2<MsgListActivity> {

	public MsgListActivityTests() {
		super(MsgListActivity.class);
		// TODO Auto-generated constructor stub
	}

	public void testActivityTestCaseSetUpProperly() {
		assertNotNull("activity should be launched successfully", getActivity());
	}

	public void test() {
		MsgListActivity msgListActivity = new MsgListActivity();
		Log.i("MsgListActivityTests", "MsgListActivity:" + msgListActivity);
	}
}
