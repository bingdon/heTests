package com.wyy.myhealth.test;

import com.wyy.myhealth.MainActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

	public MainActivityTest() {
		super(MainActivity.class);
		// TODO Auto-generated constructor stub
	}

	public void testActivityTestCaseSetUpProperly() {
        assertNotNull("activity should be launched successfully", getActivity());
    }

	public void test(){
		MainActivity mainActivity=new MainActivity();
		Log.i("MainActivityTest", "MainActivity:"+mainActivity);
	}
	
	@Override
	protected void runTest() throws Throwable {
		// TODO Auto-generated method stub
		super.runTest();
	}
	
	
	
}
