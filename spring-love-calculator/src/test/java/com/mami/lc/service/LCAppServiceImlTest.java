package com.mami.lc.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LCAppServiceImlTest {

  @Test
  public void calculateLoveTest() {

    //arrange
    String userName = "Alex";
    String crushName = "Helene";
    LCAppServiceIml lcAppServiceIml = new LCAppServiceIml();

    //act
    String result = lcAppServiceIml.calculateLove(userName, crushName);
    //assert

    assertEquals("Friends",result);

  }

}