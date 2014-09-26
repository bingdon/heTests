package com.wyy.myhealth.test;

import com.wyy.myhealth.bean.Comment;
import com.wyy.myhealth.ui.fooddetails.FoodNutritionActivity;

import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

public class FoodNutritionActivityTests extends
		ActivityInstrumentationTestCase2<FoodNutritionActivity> {

	public FoodNutritionActivityTests() {
		super(FoodNutritionActivity.class);
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public void setActivityIntent(Intent i) {
		// TODO Auto-generated method stub
		super.setActivityIntent(i);
		i.putExtra("comment", new Comment());
	}



	public void testActivityTestCaseSetUpProperly() {
        assertNotNull("activity should be launched successfully", getActivity());
    }

	public void test(){
		FoodNutritionActivity foodNutritionActivity=new FoodNutritionActivity();
		Log.i("FoodNutritionActivityTests", "MainActivity:"+foodNutritionActivity);
	}
	
}
