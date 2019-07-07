package com.it.helpers;

import com.it.entity.Email;
import com.it.entity.EmailFactory;
import com.it.pages.SendEmail;

public class SendEmailHelper extends SendEmail {
    public void sendValidEmail(){
        Email email= EmailFactory.getValidEmail();
        send(email.getReceiver(),email.getSubject(),email.getText());
    }
}
