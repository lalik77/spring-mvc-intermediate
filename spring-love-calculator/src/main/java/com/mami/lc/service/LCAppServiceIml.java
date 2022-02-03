package com.mami.lc.service;


import org.springframework.stereotype.Service;

@Service
public class LCAppServiceIml implements LCAppService {


  public final String LC_APP_FORMULA = "FLAME";

  @Override
  public String calculateLove(String userName, String crushName) {

    LoveType loveType;

    int lengthOfSum = (userName + crushName).length();
    int lengthOfFormula = LC_APP_FORMULA.length();

    int rem = lengthOfSum % lengthOfFormula;
   // char resultChar = LC_APP_FORMULA.charAt(rem);

    LoveType[] results = LoveType.values();
    LoveType result = results[rem];

    String calculationResult = whatBetweenUs(result);

    //return result.toString();

    return calculationResult;

  }


  private String whatBetweenUs(LoveType loveType) {

    String result = "";

    switch (loveType) {

      case FRIEND:
        result = "Friends";
        break;

      case LOVE:
        result = "Love";
        break;

      case AFFECTION:
        result = "Affection";
        break;

      case MARRIAGE:

        result = "Marriage";
        break;

      case ENEMY:
        result = "Enemy";
        break;

    }

    return result;
  }
}
