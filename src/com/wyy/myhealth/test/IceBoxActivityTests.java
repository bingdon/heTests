package com.wyy.myhealth.test;

import com.wyy.myhealth.ui.icebox.IceBoxActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

public class IceBoxActivityTests extends ActivityInstrumentationTestCase2<IceBoxActivity> {

	public IceBoxActivityTests() {
		super(IceBoxActivity.class);
		// TODO Auto-generated constructor stub
	}

	public void testActivityTestCaseSetUpProperly() {
        assertNotNull("activity should be launched successfully", getActivity());
    }

	public void test(){
		IceBoxActivity iceBoxActivity=new IceBoxActivity();
		Log.i("IceBoxActivityTests", "IceBoxActivity:"+iceBoxActivity);
	}
	
}
