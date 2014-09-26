package com.wyy.myhealth.test.view;

import com.wyy.myhealth.ui.photoPager.PhotoPagerActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

public class PhotoPagerActivityTests extends
		ActivityInstrumentationTestCase2<PhotoPagerActivity> {

	public PhotoPagerActivityTests() {
		super(PhotoPagerActivity.class);
		// TODO Auto-generated constructor stub
	}

	public void testActivityTestCaseSetUpProperly() {
        assertNotNull("activity should be launched successfully", getActivity());
    }

	public void test(){
		PhotoPagerActivity photoPagerActivity=new PhotoPagerActivity();
		Log.i("PhotoPagerActivityTests", "PhotoPagerActivity:"+photoPagerActivity);
	}
	
	
}
