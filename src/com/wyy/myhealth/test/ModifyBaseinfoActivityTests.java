package com.wyy.myhealth.test;

import com.wyy.myhealth.ui.personcenter.modify.ModifyBaseInfoActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

public class ModifyBaseinfoActivityTests extends
		ActivityInstrumentationTestCase2<ModifyBaseInfoActivity> {

	public ModifyBaseinfoActivityTests() {
		super(ModifyBaseInfoActivity.class);
		// TODO Auto-generated constructor stub
	}

	
	public void testActivityTestCaseSetUpProperly() {
        assertNotNull("activity should be launched successfully", getActivity());
    }

	public void test(){
		ModifyBaseInfoActivity modifyBaseInfoActivity=new ModifyBaseInfoActivity();
		Log.i("ModifyBaseinfoActivityTests", "MainActivity:"+modifyBaseInfoActivity);
	}
	
}
