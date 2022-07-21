package com.afs.tdd.enums;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

public enum DirectMove {


    N("N",0,1),
    E("E",1,0),
    S("S",0,-1),
    W("W",-1,0);

    String direction;
    int x;
    int y;

    public static final Map<String,DirectMove> map;
    static {
        map=new HashMap<>();
        map.put(N.direction,N);
        map.put(W.direction,W);
        map.put(E.direction,E);
        map.put(S.direction,S);
    }
    DirectMove(String direction, int x, int y) {
        this.direction=direction;
        this.x=x;
        this.y=y;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static Map<String, DirectMove> getMap() {
        return map;
    }
}
