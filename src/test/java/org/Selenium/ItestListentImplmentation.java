package org.Selenium;

import java.io.File;
import java.io.IOException;
import java.nio.file.spi.FileTypeDetector;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import testSuite.base;

public class ItestListentImplmentation implements ITestListener{
	WebDriver driver;
	public ItestListentImplmentation() {
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		try {
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
		File srcFile = ((TakesScreenshot)base.driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(srcFile, "D:\\Eclipse_Project_Space\\Selenium\\ScreenShot");
		File FileWithDestination = new File("D:\\\\Eclipse_Project_Space\\\\Selenium\\\\ScreenShot\\"+Math.random()+"TestFail"+".png");
			FileUtils.copyFile(srcFile, FileWithDestination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
		try {
			ITestListener.super.onTestStart(result);
			File srcFile = ((TakesScreenshot)base.driver).getScreenshotAs(OutputType.FILE);
			//FileUtils.copyFile(srcFile, "D:\\Eclipse_Project_Space\\Selenium\\ScreenShot");
			File FileWithDestination = new File("D:\\\\Eclipse_Project_Space\\\\Selenium\\\\ScreenShot\\"+Math.random()+"TestStart"+".png");
				FileUtils.copyFile(srcFile, FileWithDestination);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
@Override
public void onTestFailure(ITestResult result) {
	// TODO Auto-generated method stub
	try {
	ITestListener.super.onTestFailure(result);
	File srcFile = ((TakesScreenshot)base.driver).getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(srcFile, "D:\\Eclipse_Project_Space\\Selenium\\ScreenShot");
	File FileWithDestination = new File("D:\\\\Eclipse_Project_Space\\\\Selenium\\\\ScreenShot\\"+Math.random()+"TestFail"+".png");
		FileUtils.copyFile(srcFile, FileWithDestination);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
