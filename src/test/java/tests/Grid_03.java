package tests;

import manage.DriverManage;
import org.testng.annotations.Test;

public class Grid_03 {

    DriverManage driverManage = new DriverManage();

    @Test
    void Test01(){
        driverManage.setupChromeDriver().get("https://www.wisequarter.com");
    }

    @Test
    void Test02(){
        driverManage.setupFirefoxDriver().get("https://www.wisequarter.com");
    }

    @Test
    void Test03(){
        driverManage.setupChromeDriver().get("https://www.wisequarter.com");
    }

    @Test
    void Test04(){
        driverManage.setupFirefoxDriver().get("https://www.wisequarter.com");
    }
    @Test
    void Test05(){
        driverManage.setupChromeDriver().get("https://www.wisequarter.com");
    }

    @Test
    void Test06(){
        driverManage.setupFirefoxDriver().get("https://www.wisequarter.com");
    }

}
