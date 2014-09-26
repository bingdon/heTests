package com.wyy.myhealth.test.view;

import com.wyy.myhealth.ui.navigation.PersonalNavActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

public class PersonNavActivityTests extends ActivityInstrumentationTestCase2<PersonalNavActivity> {

	public PersonNavActivityTests() {
		super(PersonalNavActivity.class);
		// TODO Auto-generated constructor stub
	}
	
	public void testActivityTestCaseSetUpProperly() {
        assertNotNull("activity should be launched successfully", getActivity());
    }

	public void test(){
		PersonalNavActivity personalNavActivity=new PersonalNavActivity();
		Log.i("PersonNavActivityTests", "PersonalNavActivity:"+personalNavActivity);
	}
	

}
