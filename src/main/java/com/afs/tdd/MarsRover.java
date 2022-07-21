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
           move();
        }else if (command.equals("L")){
            turnLeft();
        }else if(command.equals("R")){
            turnRight();
        }
    }

    public void move(){
        DirectMove directMove=DirectMove.getMap().get(direction);
        x+=directMove.getX();
        y+=directMove.getY();
    }

    public void turnLeft(){
        //TODO 这里也可以优化，同样的思路
        if (direction.equals("N")){
            direction="W";
        }else if (direction.equals("W")){
            direction="S";
        }else if(direction.equals("S")){
            direction="E";
        }else if(direction.equals("E")){
            direction="N";
        }
    }
    public void turnRight(){
        //TODO 这里也可以优化，同样的思路
        if (direction.equals("N")){
            direction="E";
        }else if (direction.equals("E")){
            direction="S";
        }else if(direction.equals("S")){
            direction="W";
        }else if(direction.equals("W")){
            direction="N";
        }
    }
}
