package com.kodilla.good.patterns.challenges.service;

public class MailService implements Notifications{

    User user;

    public MailService(User user) {
        this.user = user;
    }

    @Override
    public void inform(User user) {

    }

    public void sendEmail(User user){
        System.out.println("e-mail has been sent to: " + user.getNickName());
    }
}
