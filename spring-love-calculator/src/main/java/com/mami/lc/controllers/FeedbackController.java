package com.mami.lc.controllers;

import com.mami.lc.api.FeedbackDTO;
import com.mami.lc.service.FeedBackEmailSender;
import java.util.logging.Logger;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FeedbackController {

  private static Logger logger;

  private FeedBackEmailSender feedBackEmailSender;

  public FeedbackController(FeedBackEmailSender feedBackEmailSender) {
    this.feedBackEmailSender = feedBackEmailSender;
  }

  @RequestMapping("/feedback")
  public String showFeedback(FeedbackDTO feedbackDTO, Model model) {

    model.addAttribute("feedback", feedbackDTO);

    return "feedback-page";

  }


  @RequestMapping("/process-feedback")
  public String processFeedback(@Valid @ModelAttribute("feedback") FeedbackDTO feedbackDTO,
      BindingResult result) {

    logger = Logger.getLogger(FeedbackController.class.getName());

    if (result.hasErrors()) {

      logger.info("Validation errors");
      return "feedback-page";
    }

    logger.info(feedbackDTO.getName() + ",  " + feedbackDTO.getEmail() + "," + feedbackDTO
        .getFeedBackContent());

    //TODO: Send email to user -> feedback sent successfully , and send the feedback to admin

    try {
      feedBackEmailSender.sendToUserConfirmation(feedbackDTO.getEmail(), feedbackDTO.getName());

    } catch (Exception e) {

      logger.info("Error during sending message to User");
    }

    try {
      feedBackEmailSender.sendToAdmin("algru81@gmail.com", feedbackDTO.getFeedBackContent(),
          feedbackDTO.getEmail(), feedbackDTO.getName());
    } catch (Exception e) {

      logger.info("Error during sending message to Admin");

    }
    return "fb-sent-success-page";
  }
}
