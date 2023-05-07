package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerclass implements ITestListener{
	int count=1;
	public void onFinish(ITestContext context) {
		System.out.println("All test execution got Finished..!"+"\n");
	}

	public void onStart(ITestContext context) {
	System.out.println("Test execution get started :-");
	}

	public void onTestFailedWithTimeout(ITestResult result) {
	System.out.println("Test got failed due to Timeout issues..?");
	}

	public void onTestFailure(ITestResult result) {
	System.out.println("Test got failed.?..ScreenShot captured..!");	
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test got Skipped...? ");
	}

	public void onTestStart(ITestResult result) {
		System.out.println(count+")  Test is started: ");
		count++;
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("test execution is successful..!");
	}

	
}


