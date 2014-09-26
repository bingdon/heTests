package com.wyy.myhealth.test;

import com.wyy.myhealth.ui.scan.VoiceSearceActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

public class VoiceSearchActivityTests extends
		ActivityInstrumentationTestCase2<VoiceSearceActivity> {

	public VoiceSearchActivityTests() {
		super(VoiceSearceActivity.class);
		// TODO Auto-generated constructor stub
	}

	public void testActivityTestCaseSetUpProperly() {
        assertNotNull("activity should be launched successfully", getActivity());
    }

	public void test(){
		VoiceSearceActivity voiceSearceActivity=new VoiceSearceActivity();
		Log.i("VoiceSearchActivityTests", "VoiceSearceActivity:"+voiceSearceActivity);
	}
	
}
