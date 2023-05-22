package com.wheelpros.web.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.NetworkMode;

public class Report {
	private static ExtentReports report;
	//private static ExtentTest test;
	private static String resultPath = null;
	private static String screenShotPathToAttach = null;
	private static String screenShotPathToSave = null;
	private static int ssCount = 0;
	private static ThreadLocal<WebDriver> drivers = new ThreadLocal<WebDriver>();
	private static ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();
	
	public static void setDriver(WebDriver driver) {
		drivers.set(driver);
	}
	
	private static WebDriver getDriver() {
		return drivers.get();
	}

	public static synchronized void startReport(){
		resultPath = System.getProperty("user.dir")+"/reports/Run_"+getCurrentDateTime("yyyyMMdd")+"_"+getCurrentDateTime("HHmmss");

		if(!new File(resultPath).isDirectory()){
			new File(resultPath).mkdirs();
		}
		screenShotPathToSave = resultPath+"/ScreenShots/";
		screenShotPathToAttach = "./ScreenShots/";

		if(!new File(screenShotPathToSave).isDirectory()){
			new File(screenShotPathToSave).mkdirs();
		}

		report = new ExtentReports(resultPath+"/Suite.html", true, NetworkMode.OFFLINE);
		report.addSystemInfo("enviroment", "QA");

	}

	public static synchronized void startTest(String testCaseName, String description, String... category){
		test.set(report.startTest(testCaseName, description));
		test.get().assignCategory(category);
	}

	public static synchronized void endTest(ITestResult result){
		if(result.isSuccess())
			log(Status.PASS, "Test passed");
		else
			log(Status.FAIL, "Test is failed");
		report.endTest(test.get());
		report.flush();
	}
	
	public static synchronized void endReport(){
		report.close();
		report = null;
	}

	
	public static synchronized void log(Status status, String message){
		switch(status){
		case PASS:
			test.get().log(LogStatus.PASS, message);
			break;
		case FAIL:
			takeScreenShot(screenShotPathToSave+"SS_"+ssCount+".png");
			test.get().log(LogStatus.FAIL, message+test.get().addScreenCapture(screenShotPathToAttach+"SS_"+ssCount+".png"));
			ssCount++;
			break;
		case WARN:
			test.get().log(LogStatus.WARNING, message);
			break;
		case INFO:
			test.get().log(LogStatus.INFO, message);
			break;
		case PASS_TAKE_SCREENSHOT:
			takeScreenShot(screenShotPathToSave+"SS_"+ssCount+".png");
			test.get().log(LogStatus.PASS, message+test.get().addScreenCapture(screenShotPathToAttach+"SS_"+ssCount+".png"));
			ssCount++;
			break;
		}
	}
	
	public static void takeScreenShot(String path){
		File scrFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		try{
			FileUtils.copyFile(scrFile, new File(path));
		}catch(IOException io){
			io.printStackTrace();
		}
		
	}

	public static String getCurrentDateTime(String format){
		Calendar cal = Calendar.getInstance();

		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(cal.getTime());

	}

}

