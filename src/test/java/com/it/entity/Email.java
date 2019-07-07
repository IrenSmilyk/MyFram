package com.it.entity;

import java.util.Objects;

public class Email {
    private String receiver;
    private String subject;
    private String text;


    public Email(String receiver, String subject, String text) {
        this.receiver = receiver;
        this.subject = subject;
        this.text = text;

    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Email)) return false;
        Email email = (Email) o;
        return receiver.equals(email.receiver) &&
                subject.equals(email.subject) &&
                text.equals(email.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(receiver, subject, text);
    }

    @Override
    public String toString() {
        return "Email{" +
                "receiver='" + receiver + '\'' +
                ", subject='" + subject + '\'' +
                ", text='" + text + '\'' +
                ", confirmation='" + '\'' +
                '}';
    }
}
