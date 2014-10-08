package com.wyy.myhealth.test;

import com.wyy.myhealth.MainActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.MediumTest;
import android.util.Log;
import android.view.KeyEvent;

public class MainActivityTest extends
		ActivityInstrumentationTestCase2<MainActivity> {

	public MainActivityTest() {
		super(MainActivity.class);
		// TODO Auto-generated constructor stub
	}

	public void testActivityTestCaseSetUpProperly() {
		assertNotNull("activity should be launched successfully", getActivity());
		// final Instrumentation instrumentation=getInstrumentation();
		// new Thread() {
		// public void run() {
		// Instrumentation instrumentation = getInstrumentation();
		// for (int i = 0; i < 50; i++) {
		// for (int j = 0; j < 3; j++) {
		// instrumentation
		// .sendKeyDownUpSync(KeyEvent.KEYCODE_DPAD_LEFT);
		// try {
		// Thread.sleep(5000);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		// instrumentation
		// .sendKeyDownUpSync(KeyEvent.KEYCODE_DPAD_RIGHT);
		// }
		//
		// }
		//
		// };
		// }.start();

	}

	@MediumTest
	public void testGoingRightFromLeftButtonJumpsOverCenterToRight() {
		new Thread() {
			public void run() {
				for (int i = 0; i < 50; i++) {
					for (int j = 0; j < 3; j++) {
						sendKeys(KeyEvent.KEYCODE_DPAD_RIGHT);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

					for (int j = 0; j < 3; j++) {
						sendKeys(KeyEvent.KEYCODE_DPAD_LEFT);
						sendKeys(KeyEvent.KEYCODE_MENU);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

				}

			};
		}.start();

	}

	public void testGoingRightFromLeftButtonJumpsOverCenterToLeft() {
		for (int i = 0; i < 50; i++) {
			for (int j = 0; j < 3; j++) {
				sendKeys(KeyEvent.KEYCODE_DPAD_RIGHT);
			}

			for (int j = 0; j < 3; j++) {
				sendKeys(KeyEvent.KEYCODE_DPAD_LEFT);
			}

		}
	}

	public void test() {
		MainActivity mainActivity = new MainActivity();
		Log.i("MainActivityTest", "MainActivity:" + mainActivity);

	}

	@Override
	protected void runTest() throws Throwable {
		// TODO Auto-generated method stub
		super.runTest();
	}

}
