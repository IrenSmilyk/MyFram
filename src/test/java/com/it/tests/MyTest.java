package com.it.tests;

import com.it.common.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest {

    @Test
    public void test1() {
        app.login.loginValidUser();
        Assert.assertEquals(app.dashBoard.getLbEmail(), validUser.getEmail(), "Email is not valid");
        app.sendEmail.sendValidEmail();
        Assert.assertEquals(app.dashBoard.getLbContent(), Constants.CONF,"The letter is not sent");



       /* LoginPage loginPage = new LoginPage();
        loginPage.login(validUser.getLogin(),validUser.getPass());
        DashBoardPage dashBoardPage = new DashBoardPage();*/
        //------------------------------------------------------
        /*driver.findElement(By.name("login")).sendKeys("smilykirina@i.ua");
        driver.findElement(By.name("pass")).sendKeys("Bere2809");
        driver.findElement(By.xpath("//input[@tabindex='5']")).click();
        String text = driver.findElement(By.xpath("//span[@class='sn_menu_title']")).getText();*/
        //Assert.assertEquals(text, "smilykirina@i.ua", "Email is not valid");
        //---------------------------------------------------------------------------------
        //Assert.assertEquals(dashBoardPage.getLbEmail(), validUser.getEmail(), "Email is not valid");


    }

}
