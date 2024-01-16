package resources;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.BasePage;

public class Listeners extends BasePage implements ITestListener {

	public Listeners() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		try {
			takeSnapShot(result.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestStart(ITestResult iTestResult) {
	    System.out.println("onTestStart");
	}

	@Override
	public void onTestSuccess(ITestResult iTestResult) {
	    System.out.println("onTestSuccess");
	}

	
	@Override
	public void onTestSkipped(ITestResult iTestResult) {
	    System.out.println("onTestSkipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
	    System.out.println("onTestFailedButWithinSuccessPercentage");
	}

	@Override
	public void onStart(ITestContext iTestContext) {
	    System.out.println("onTestFailedButWithinSuccessPercentage");
	}

	@Override
	public void onFinish(ITestContext iTestContext) {
	    System.out.println("onFinish");
	}

}
