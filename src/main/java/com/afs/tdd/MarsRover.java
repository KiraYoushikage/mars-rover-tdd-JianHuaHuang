package com.afs.tdd;

import com.afs.tdd.enums.DirectMove;
import com.afs.tdd.utils.DirectTurnUtils;
import lombok.AllArgsConstructor;
import lombok.Data;

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
        }
    }

    public void move(){
        DirectMove directMove=DirectMove.getMap().get(direction);
        x+=directMove.getX();
        y+=directMove.getY();
    }

    public void turnLeft(){
        //TODO 这里也可以优化，同样的思路
        direction=DirectTurnUtils.leftTurnMap.get(direction);
    }
    public void turnRight(){
        //TODO 这里也可以优化，同样的思路
        direction= DirectTurnUtils.rightTurnMap.get(direction);
    }

    public void executeCommands(List<String> commands){
        commands.forEach(this::executeCommand);
    }
}
