package com.wyy.myhealth.test;

import com.wyy.myhealth.stepcount.StepService;

import android.content.Intent;
import android.test.ServiceTestCase;

public class StepSeviceTests extends ServiceTestCase<StepService> {

	public StepSeviceTests() {
		super(StepService.class);
		// TODO Auto-generated constructor stub
	}

	public void testStartable() {
		Intent startIntent = new Intent();
		startIntent.setClass(getContext(), StepService.class);
		startService(startIntent);
	}

	
}
