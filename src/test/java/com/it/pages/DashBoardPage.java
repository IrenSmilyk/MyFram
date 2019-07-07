package com.it.pages;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashBoardPage extends BasePage {
    @FindBy(xpath = "//span[@class='sn_menu_title']")
    private WebElement lbEmail;
    @FindBy(xpath = "//div[@class='content clear']")
    private WebElement lbContent;

    public String getLbEmail() {
        WebDriverWait wait=new WebDriverWait(driver,10);
        //return wait.until((lbEmail)->{driver.findElement(By.)});
        return wait.until(ExpectedConditions.visibilityOf(lbEmail)).getText();
        //return lbEmail.getText();
    }
    public String getLbContent(){
        return lbContent.getText();
    }
}
