package com.afs.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DemoTest {

    @Test
    void should__when__given_() {
        //given
        MarsRover marsRover=new MarsRover(0,0,"N");
        //when
        marsRover.executeCommand("M");
        //then
        Assertions.assertEquals(0,marsRover.getX());
        Assertions.assertEquals(1,marsRover.getY());
        Assertions.assertEquals("N",marsRover.getDirection());
    }
    
}
