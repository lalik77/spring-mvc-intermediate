package com.mami.lc.validator;

import com.mami.lc.api.UserRegistrationDTO;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class UserNameValidator implements Validator {

  //check if the validator supports a given object
  @Override
  public boolean supports(Class<?> clazz) {

    return UserRegistrationDTO.class.equals(clazz);
  }


  // custom validation logic
  @Override
  public void validate(Object target, Errors errors) {

    //check if field is null
    ValidationUtils
        .rejectIfEmptyOrWhitespace(errors, "userName", "userName.empty",
            "Cannot be empty oe with white space");

    UserRegistrationDTO u = (UserRegistrationDTO) target;

    if ( !u.getUserName().contains("_") ) {

      errors.rejectValue("userName","userName.invalidString","should contain '_'");
    }

  }


}
