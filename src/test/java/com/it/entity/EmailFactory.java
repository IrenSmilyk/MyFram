package com.it.entity;

import java.util.ResourceBundle;

public class EmailFactory {
    static ResourceBundle resourceBundle;

    static {
        resourceBundle = ResourceBundle.getBundle("email");
    }
    public static Email getValidEmail() {
        return new Email(resourceBundle.getString("rec"),
                resourceBundle.getString("sub"),
                resourceBundle.getString("txt"));
    }
}
