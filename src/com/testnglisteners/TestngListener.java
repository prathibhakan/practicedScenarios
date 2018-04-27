package com.testnglisteners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestngListener implements ITestListener,IInvokedMethodListener{

	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("onFinish");
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("onStart");
		
	} 
	

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.println("onTestFailedButWithinSuccessPercentage");
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println("onTestFailure");
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("onTestSkipped");
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("onTestStart");
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("onTestSuccess");
		
	}

	@Override
	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
		System.out.println("afterInvocation");
		
	}

	@Override
	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		System.out.println("beforeInvocation");
		
	}

}
