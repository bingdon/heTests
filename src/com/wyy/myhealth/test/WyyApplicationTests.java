package com.wyy.myhealth.test;

import com.wyy.myhealth.app.WyyApplication;
import com.wyy.myhealth.bean.PersonalInfo;

import android.test.ApplicationTestCase;
import android.util.Log;
import android.widget.Toast;

public class WyyApplicationTests extends ApplicationTestCase<WyyApplication> {
	PersonalInfo personalInfo;
	public WyyApplicationTests() {
		super(WyyApplication.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		personalInfo=WyyApplication.getInfo();
		Log.i("WyyApplicationTests", "PersonalInfo:"+personalInfo+"Head:"+WyyApplication.getHeaderImaList());
		Toast.makeText(getContext(), "≤‚ ‘≥…π¶", Toast.LENGTH_LONG).show();
	}

	public void testSimpleCreate() {
		createApplication();
	}

}
