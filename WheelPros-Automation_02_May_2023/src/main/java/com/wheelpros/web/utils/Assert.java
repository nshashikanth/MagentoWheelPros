package com.wheelpros.web.utils;


public class Assert {

	public static void assertTrue(ValidationType vType, String message, boolean condition){
		try{
			org.testng.Assert.assertTrue(condition);
			report(vType, null, message);
		}catch(AssertionError ae){
			report(vType, ae, message);
		}
	}
	
	
	public static void assertFalse(ValidationType vType, String message, boolean condition){
		try{
			org.testng.Assert.assertFalse(condition);
			report(vType, null, message);
		}catch(AssertionError ae){
			report(vType, ae, message);
		}
	}
	
	
	
	


	
	public static void assertEquals(ValidationType vType, String message, Object object, Object object2){
		try{
			org.testng.Assert.assertEquals(object, object2);
			report(vType, null, message);
		}catch(AssertionError ae){
			report(vType, ae, message);
		}
	}
	
	
	public static void assertEqualsString(ValidationType vType, String message, Object object, Object object2){
		try{
			org.testng.Assert.assertEquals(object, object2);
			report(vType, null, message);
		}catch(AssertionError ae){
			report(vType, ae, message);
		}
	}
	
	
	private static void report(ValidationType vType, AssertionError ae, String message){
		if(ae==null){
			switch(vType){
			case HardAssert:
			case SoftAssert:
				Report.log(Status.PASS, message);
				break;
			case HardAssertAndTakeScreenShot:
			case SoftAssertAndTakeScreenShot:
				Report.log(Status.PASS_TAKE_SCREENSHOT, message);
				break;
			}
		}else{
			switch(vType){
			case HardAssert:
			case HardAssertAndTakeScreenShot:
				Report.log(Status.FAIL, message);
				throw ae;
			case SoftAssert:
			case SoftAssertAndTakeScreenShot:
				Report.log(Status.FAIL, message);
				break;
			}
		}
		
	}







	


	
}
