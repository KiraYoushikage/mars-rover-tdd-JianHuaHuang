package com.afs.tdd;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MarsRover {
    private int x;
    private int y;
    private String direction;

    public void executeCommand(String command) {
        if(command.equals("M")){
            if (direction.equals("N")){
                y++;
            }
        }

    }
}
