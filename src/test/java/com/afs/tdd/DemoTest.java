package com.afs.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.afs.tdd.constant.Instructions.*;

class DemoTest {

    @Test
    void should_goto_0_1_N_when_command_M_given_0_0_N() {
        //given
        MarsRover marsRover=new MarsRover(0,0,"N");
        //when
        marsRover.executeCommand("M");
        //then
        Assertions.assertEquals(0,marsRover.getX());
        Assertions.assertEquals(1,marsRover.getY());
        Assertions.assertEquals("N",marsRover.getDirection());
    }
    @Test
    void should_goto_1_0_E_when_command_M_given_0_0_E() {
        //given
        MarsRover marsRover=new MarsRover(0,0,"E");
        //when
        marsRover.executeCommand("M");
        //then
        Assertions.assertEquals(1,marsRover.getX());
        Assertions.assertEquals(0,marsRover.getY());
        Assertions.assertEquals("E",marsRover.getDirection());
    }
    @Test
    void should_goto_0_negative_1_E_when_command_M_given_0_0_S() {
        //given
        MarsRover marsRover=new MarsRover(0,0,"S");
        //when
        marsRover.executeCommand("M");
        //then
        Assertions.assertEquals(0,marsRover.getX());
        Assertions.assertEquals(-1,marsRover.getY());
        Assertions.assertEquals("S",marsRover.getDirection());
    }

    @Test
    void should_goto_negative_1_0_W_when_command_M_given_0_0_W() {
        //given
        MarsRover marsRover=new MarsRover(0,0,"W");
        //when
        marsRover.executeCommand("M");
        //then
        Assertions.assertEquals(-1,marsRover.getX());
        Assertions.assertEquals(0,marsRover.getY());
        Assertions.assertEquals("W",marsRover.getDirection());
    }

    @Test
    void should_goto_0_0_W_when_command_L_given_0_0_N() {
        //given
        MarsRover marsRover=new MarsRover(0,0,"N");
        //when
        marsRover.executeCommand("L");
        //then
        Assertions.assertEquals(0,marsRover.getX());
        Assertions.assertEquals(0,marsRover.getY());
        Assertions.assertEquals("W",marsRover.getDirection());
    }

    @Test
    void should_goto_0_0_S_when_command_L_given_0_0_W() {
        //given
        MarsRover marsRover=new MarsRover(0,0,"W");
        //when
        marsRover.executeCommand("L");
        //then
        Assertions.assertEquals(0,marsRover.getX());
        Assertions.assertEquals(0,marsRover.getY());
        Assertions.assertEquals("S",marsRover.getDirection());
    }
    @Test
    void should_goto_0_0_E_when_command_L_given_0_0_S() {
        //given
        MarsRover marsRover=new MarsRover(0,0,"S");
        //when
        marsRover.executeCommand("L");
        //then
        Assertions.assertEquals(0,marsRover.getX());
        Assertions.assertEquals(0,marsRover.getY());
        Assertions.assertEquals("E",marsRover.getDirection());
    }
    @Test
    void should_goto_0_0_N_when_command_L_given_0_0_E() {
        //given
        MarsRover marsRover=new MarsRover(0,0,"E");
        //when
        marsRover.executeCommand("L");
        //then
        Assertions.assertEquals(0,marsRover.getX());
        Assertions.assertEquals(0,marsRover.getY());
        Assertions.assertEquals("N",marsRover.getDirection());
    }

    @Test
    void should_goto_0_0_E_when_command_R_given_0_0_N() {
        //given
        MarsRover marsRover=new MarsRover(0,0,"N");
        //when
        marsRover.executeCommand("R");
        //then
        Assertions.assertEquals(0,marsRover.getX());
        Assertions.assertEquals(0,marsRover.getY());
        Assertions.assertEquals("E",marsRover.getDirection());
    }

    @Test
    void should_goto_0_0_S_when_command_R_given_0_0_E() {
        //given
        MarsRover marsRover=new MarsRover(0,0,"E");
        //when
        marsRover.executeCommand("R");
        //then
        Assertions.assertEquals(0,marsRover.getX());
        Assertions.assertEquals(0,marsRover.getY());
        Assertions.assertEquals("S",marsRover.getDirection());
    }

    @Test
    void should_goto_0_0_W_when_command_R_given_0_0_S() {
        //given
        MarsRover marsRover=new MarsRover(0,0,"S");
        //when
        marsRover.executeCommand("R");
        //then
        Assertions.assertEquals(0,marsRover.getX());
        Assertions.assertEquals(0,marsRover.getY());
        Assertions.assertEquals("W",marsRover.getDirection());
    }

    @Test
    void should_goto_0_0_N_when_command_R_given_0_0_W() {
        //given
        MarsRover marsRover=new MarsRover(1,1,"W");
        //when
        marsRover.executeCommand("R");
        //then
        Assertions.assertEquals(1,marsRover.getX());
        Assertions.assertEquals(1,marsRover.getY());
        Assertions.assertEquals("N",marsRover.getDirection());
    }

    @Test
    void should_goto_0_1_S_when_command_List_given_0_0_N() {
        //given
        MarsRover marsRover=new MarsRover(0,0,"N");
        List<String> commands=Arrays.asList(MOVE,TURN_LEFT,MOVE,TURN_RIGHT,MOVE,TURN_RIGHT,MOVE,TURN_RIGHT,MOVE);
        //when
        marsRover.executeCommands(commands);
        //then
        Assertions.assertEquals(0,marsRover.getX());
        Assertions.assertEquals(1,marsRover.getY());
        Assertions.assertEquals("S",marsRover.getDirection());
    }
}
