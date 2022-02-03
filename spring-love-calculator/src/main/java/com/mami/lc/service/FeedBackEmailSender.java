package com.mami.lc.service;

public interface FeedBackEmailSender {

  void sendToUserConfirmation(String toUser, String name);
  void sendToAdmin(String toAdmin,String feedback,String userEmail , String name);

}
