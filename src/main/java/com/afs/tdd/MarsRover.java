package com.afs.tdd;

import com.afs.tdd.enums.DirectMove;
import com.afs.tdd.utils.DirectTurnUtils;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

import static com.afs.tdd.constant.Instructions.*;

@Data
@AllArgsConstructor
public class MarsRover {
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
        }else if(command.length()>1){
            List<String> commands= Arrays.asList(command.split(""));
            executeCommands(commands);
        }
    }

    public void move(){
        DirectMove directMove=DirectMove.getMap().get(direction);
        x+=directMove.getX();
        y+=directMove.getY();
    }

    public void turnLeft(){
        direction=DirectTurnUtils.leftTurnMap.get(direction);
    }
    public void turnRight(){
        direction= DirectTurnUtils.rightTurnMap.get(direction);
    }

    public void executeCommands(List<String> commands){
        commands.forEach(this::executeCommand);
    }
}
