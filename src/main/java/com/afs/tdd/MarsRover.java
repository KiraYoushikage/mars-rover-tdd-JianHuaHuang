package com.afs.tdd;

import com.afs.tdd.enums.DirectMove;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

import static com.afs.tdd.Instructions.*;

@Data
@AllArgsConstructor
public class MarsRover implements Direction {
    private int x;
    private int y;
    private String direction;

    public void executeCommand(String command) {
        if(command.equals(MOVE)){
           move();
        } else if (command.equals(TURN_LEFT)){
            turnLeft();
        }else if(command.equals(TURN_RIGHT)){
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

    public void executeCommands(List<String> commands){
        commands.forEach(this::executeCommand);
    }
}
