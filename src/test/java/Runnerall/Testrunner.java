package Runnerall;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentCucumberFormatter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features ={"C:\\Users\\karsh\\eclipse-workspace\\Simple\\src\\test\\resources\\ferrari"},glue="Stepall", monochrome = true, plugin= {"pretty", "html:test-output","com.cucumber.listener.ExtentCucumberFormatter"},tags ={"@java"},dryRun = false)
public class Testrunner extends AbstractTestNGCucumberTests{
	

	
@BeforeClass
public static void setup()  {
    // Initiates the extent report and generates the output in the output/Run_<unique timestamp>/report.html file by default.
	SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
	Date curDate = new Date();
	String strDate = sdf.format(curDate);
	String fileName = System.getProperty("user.dir")+"\\target\\Extent_Reports\\" + strDate+".html";
	File newFile = new File(fileName);
	
	ExtentCucumberFormatter.initiateExtentCucumberFormatter(newFile,false);
	
	//static report name
	//ExtentCucumberFormatter.initiateExtentCucumberFormatter(new File("F:\\cucumber-testing-master\\ExtenReports\\extentreports.html"),false);
    // Loads the extent config xml to customize on the report.
    ExtentCucumberFormatter.loadConfig(new File("src/test/resources/extent-config.xml"));

    // User can add the system information as follows
    ExtentCucumberFormatter.addSystemInfo("Browser Name", "Chrome");
    ExtentCucumberFormatter.addSystemInfo("Browser version", "v74.0");
    ExtentCucumberFormatter.addSystemInfo("Selenium version", "v3.5.1.4");

    // Also you can add system information using a hash map
    Map systemInfo = new HashMap();
    systemInfo.put("Cucumber version", "v1.2.3");
    systemInfo.put("Extent Cucumber Reporter version", "v1.1.0");
    ExtentCucumberFormatter.addSystemInfo(systemInfo);
}
}

