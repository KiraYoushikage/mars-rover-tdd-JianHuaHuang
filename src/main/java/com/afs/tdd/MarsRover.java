package com.afs.tdd;

import com.afs.tdd.enums.DirectMove;
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
            DirectMove directMove=DirectMove.getMap().get(direction);
            x+=directMove.getX();
            y+=directMove.getY();
        }

    }
}
