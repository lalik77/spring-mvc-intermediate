package com.mami.lc.validator;

import com.mami.lc.api.CommunicationDTO;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneValidatorConstraints implements ConstraintValidator<VPhone, CommunicationDTO> {

    @Override
    public void initialize(VPhone constraintAnnotation) {



    }

    @Override
    public boolean isValid(CommunicationDTO communicationDTO, ConstraintValidatorContext constraintValidatorContext) {


        if (communicationDTO.getPhone() == null) {
            return false;
        }

        //isDigitEntered(String country, String base)
       boolean isDigit = isDigitInput(communicationDTO.getPhone().getCountryCode(),
                communicationDTO.getPhone().getBaseNumber());

        if(!isDigit) {

            return false;
        }

        int lengthB = communicationDTO.getPhone().getBaseNumber().length();
        int lengthC = communicationDTO.getPhone().getCountryCode().length();
        int sum = lengthB + lengthC;

        if (sum!=10) {
            return false;
        }


        return true;
    }

    private boolean isDigitInput(String countryCode, String baseNumber) {

        return countryCode.matches("[0-9]+")
                && countryCode.matches("[0-9]+");
    }
}
