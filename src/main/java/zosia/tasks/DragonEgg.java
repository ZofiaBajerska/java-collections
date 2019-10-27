package zosia.tasks;

import lombok.Getter;

@Getter
/**
 * Public class to represent dragon egg.
 *
 * @ Author Zofia B.
 */
public class DragonEgg {

    DragonColor color;

    /**
     * Public method to construct dragon egg from dragon.
     *
     * @param dragon The parent of new dragon.
     */

    public DragonEgg(Dragon dragon){
        color = dragon.getColor();
    }
}
