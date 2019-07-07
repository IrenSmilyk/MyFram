package com.it.tests;

import com.it.App;
import com.it.entity.User;
import com.it.entity.UserFactory;
import org.testng.annotations.AfterSuite;

public abstract class BaseTest {

    User validUser = UserFactory.getValidUser();
    App app = new App();

    @AfterSuite
    public void tearDown() {
       app.common.stopApp();
    }
}
