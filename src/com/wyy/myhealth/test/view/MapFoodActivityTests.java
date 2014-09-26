package com.wyy.myhealth.test.view;

import com.wyy.myhealth.ui.mapfood.MapFoodsActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

public class MapFoodActivityTests extends ActivityInstrumentationTestCase2<MapFoodsActivity> {

	public MapFoodActivityTests() {
		super(MapFoodsActivity.class);
		// TODO Auto-generated constructor stub
	}

	public void testActivityTestCaseSetUpProperly() {
        assertNotNull("activity should be launched successfully", getActivity());
    }

	public void test(){
		MapFoodsActivity mapFoodsActivity=new MapFoodsActivity();
		Log.i("MapFoodActivityTests", "MainActivity:"+mapFoodsActivity);
	}
	
}
