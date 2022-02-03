package com.mami.lc.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class LCAppEmailServiceImpl implements LCAppEmailService {


  private JavaMailSender javaMailSender;

  public LCAppEmailServiceImpl(JavaMailSender javaMailSender) {
    this.javaMailSender = javaMailSender;
  }

  @Override
  public void send(String userName, String to, String result) {

    SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

    simpleMailMessage.setTo(to);
    simpleMailMessage.setSubject("Love Boring Calculator Application Result");
    simpleMailMessage
        .setText("Hi" + userName + " \nThe result predicated by the boring app : " + result);

    javaMailSender.send(simpleMailMessage);


  }
}
