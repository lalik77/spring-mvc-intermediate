package com.mami.lc.api;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class FeedbackDTO {

  @NotBlank(message = "* Name can't be blank")
  @Size(min = 2, message = "* Enter at least 2 symbols")
  private String name;

  @Email(message = " Email should be valid")
  private String email;

  @Size(min = 10, message = "* For a feedback , Enter at least 10 symbols")
  private String feedBackContent;

  public FeedbackDTO() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getFeedBackContent() {
    return feedBackContent;
  }

  public void setFeedBackContent(String feedBackContent) {
    this.feedBackContent = feedBackContent;
  }
}
