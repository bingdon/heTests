package com.wyy.myhealth.test;

import com.wyy.myhealth.ui.login.LoginActivity;

import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;

public class LoginActivityTest extends ActivityInstrumentationTestCase2<LoginActivity> {

	public LoginActivityTest() {
		super(LoginActivity.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setActivityIntent(Intent i) {
		// TODO Auto-generated method stub
		super.setActivityIntent(i);
	}

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
	}

	public void testActivityTestCaseSetUpProperly() {
        assertNotNull("activity should be launched successfully", getActivity());
    }
	
	
}
