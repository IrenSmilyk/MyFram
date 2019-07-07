package com.it;

import com.it.helpers.CommonHelper;
import com.it.helpers.DashBoardHelper;
import com.it.helpers.LoginHelper;
import com.it.helpers.SendEmailHelper;

public class App {
    public LoginHelper login;
    public DashBoardHelper dashBoard;
    public CommonHelper common;
    public SendEmailHelper sendEmail;

    public App() {
        login = new LoginHelper();
        dashBoard = new DashBoardHelper();
        common = new CommonHelper();
        sendEmail = new SendEmailHelper();
    }
}
