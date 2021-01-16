package com.kodilla.good.patterns.challenges.service;

public class MailService implements Notifications{

    @Override
    public void inform(User user) {
        System.out.println("e-mail has been sent to: " + user.getNickName());
    }

}
