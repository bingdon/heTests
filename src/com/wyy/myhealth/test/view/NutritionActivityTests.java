package com.wyy.myhealth.test.view;

import com.wyy.myhealth.ui.navigation.NutritionNavActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

public class NutritionActivityTests extends ActivityInstrumentationTestCase2<NutritionNavActivity> {

	public NutritionActivityTests() {
		super(NutritionNavActivity.class);
		// TODO Auto-generated constructor stub
	}
	
	
	public void testActivityTestCaseSetUpProperly() {
        assertNotNull("activity should be launched successfully", getActivity());
    }

	public void test(){
		NutritionNavActivity nutritionNavActivity=new NutritionNavActivity();
		Log.i("NutritionActivityTests", "NutritionNavActivity:"+nutritionNavActivity);
	}
	

}
