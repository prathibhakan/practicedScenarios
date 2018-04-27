package FailedTestCases;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class FailedTCScript {

	public static void main(String[] args) {
	
		TestNG runner=new TestNG();
	    List<String> suiteList=new ArrayList<String>();
	    suiteList.add("C:\\Users\\tm\\git\\prathibha\\Prathibha-new\\test-output\\SmokeSuite\\testng-failed.xml");
		runner.setTestSuites(suiteList);
	    runner.run();
	}
}
