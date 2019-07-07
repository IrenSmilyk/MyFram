package com.it.helpers;

import com.it.entity.User;
import com.it.entity.UserFactory;
import com.it.pages.LoginPage;

public class LoginHelper extends LoginPage {
    public void loginValidUser() {
        User user = UserFactory.getValidUser();
        log.info(String.format("Login user -%s, password -%s.", user.getLogin(), user.getPass()));
        login(user.getLogin(), user.getPass());
    }

    public void loginUser(User user) {
        log.info(String.format("Login user %s, password %s.", user.getLogin(), user.getPass()));
        login(user.getLogin(), user.getPass());
    }
}
