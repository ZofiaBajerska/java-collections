package zosia.tasks;

import lombok.Getter;

@Getter

public class DragonEgg {

    DragonColor color;

    public DragonEgg(Dragon dragon){
        color = dragon.getColor();
    }

    public Dragon hatch(){
        return new Dragon("", 0, 0, color);
    }
}
