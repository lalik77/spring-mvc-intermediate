package com.mami.lc.validator;

import com.mami.lc.api.UserRegistrationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class EmailValidator implements Validator {

  @Override
  public boolean supports(Class<?> clazz) {
    return UserRegistrationDTO.class.equals(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {

    ValidationUtils.rejectIfEmptyOrWhitespace(errors, "communicationDTO.email",
        "communicationDTO.email.notEmpty");

    // email ending with selenium.com

    UserRegistrationDTO u = (UserRegistrationDTO) target;

   if ( !u.getCommunicationDTO().getEmail().endsWith("selenium.com") ) {
     errors.rejectValue("communicationDTO.email","email.invalidDomain");
   }


  }



}
