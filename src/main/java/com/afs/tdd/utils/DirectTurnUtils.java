package com.afs.tdd.utils;

import java.util.HashMap;
import java.util.Map;

public class DirectTurnUtils {
    public static final Map<String,String> leftTurnMap;
    public static final Map<String,String> rightTurnMap;
    static {
        leftTurnMap=new HashMap<>();
        leftTurnMap.put("N","W");
        leftTurnMap.put("W","S");
        leftTurnMap.put("S","E");
        leftTurnMap.put("E","N");
    }
    static {
        rightTurnMap=new HashMap<>();
        rightTurnMap.put("N","E");
        rightTurnMap.put("E","S");
        rightTurnMap.put("S","W");
        rightTurnMap.put("W","N");
    }
}
