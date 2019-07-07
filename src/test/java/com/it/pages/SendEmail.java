package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SendEmail extends BasePage {
    @FindBy(xpath = "//p[@class='make_message']/a")
    private WebElement btnNewMail;
    @FindBy(xpath = "//textarea[@id='to']")
    private WebElement rece;
    @FindBy(name = "subject")
    private WebElement subj;
    @FindBy(xpath = "//textarea[@id='text']")
    private WebElement bod;
    @FindBy(name = "send")
    private WebElement btnSend;


    public void send(String recei, String sbj, String tx) {
       btnNewMail.click();
       rece.sendKeys(recei);
       subj.sendKeys(sbj);
       bod.sendKeys(tx);
       btnSend.click();
    }

}
