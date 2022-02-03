package com.mami.lc.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class FeedBackEmailSenderImpl implements FeedBackEmailSender {

  private JavaMailSender javaMailSender;
  private static final String CONFIRMATION = "Your feedback has "
      + "been delivered with success! \n " + "\n\n LCApp Team";

  public FeedBackEmailSenderImpl(JavaMailSender javaMailSender) {
    this.javaMailSender = javaMailSender;
  }

  @Override
  public void sendToUserConfirmation(String toUser, String name) {

    SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
    simpleMailMessage.setTo(toUser);
    simpleMailMessage.setSubject("Love Calculator Confirmation");
    simpleMailMessage.setText("Hi, " + name + "\n\n" +  CONFIRMATION);

        javaMailSender.send(simpleMailMessage);
  }

  @Override
  public void sendToAdmin(String toAdmin, String feedback, String userEmail, String name) {

    SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
    simpleMailMessage.setTo(toAdmin);
    simpleMailMessage.setSubject("Love Calculator Feedback");
    String message = "Message : " + feedback + "\nFrom (name) : " + name + "\nEmail : " + userEmail;
    simpleMailMessage.setText(message);

    javaMailSender.send(simpleMailMessage);

  }
}
