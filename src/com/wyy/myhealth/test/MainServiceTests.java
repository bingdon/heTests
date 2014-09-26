package com.wyy.myhealth.test;

import com.wyy.myhealth.service.MainService;

import android.content.Intent;
import android.os.IBinder;
import android.test.ServiceTestCase;
import android.test.suitebuilder.annotation.MediumTest;

public class MainServiceTests extends ServiceTestCase<MainService> {

	public MainServiceTests() {
		super(MainService.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
	}

	public void testStartable() {
		Intent startIntent = new Intent();
		startIntent.setClass(getContext(), MainService.class);
		startService(startIntent);
	}

	@MediumTest
	public void testBindable() {
		Intent startIntent = new Intent();
		startIntent.setClass(getContext(), MainService.class);
		IBinder service = bindService(startIntent);
	}

}
