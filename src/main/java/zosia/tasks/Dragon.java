package zosia.tasks;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter

/**
 * Public class to represent dragon with name, age, width and colour from enum.
 *
 * @Author Zofia B.
 */

public class Dragon implements Comparable {
    String name;
    int age;
    int width;
    DragonColor color;

    /**
     * Public constructor for Dragon class to get dragon.
     *
     * @param name Name given to new created dragon.
     *
     * @param age Age given to new created dragon.
     *
     * @param width Width given to new created dragon.
     *
     * @param color Colour given to new created dragon.
     */
    public Dragon(String name, int age, int width, DragonColor color ){
        this.name = name;
        this.age = age;
        this.width = width;
        this.color = color;
    }

    /**
     * Method to compare two dragons to sorted them by colour, age, width, name.
     *
     * @param o Object to be compered to the dragon.
     *
     * @return Resault of compering dragons, if 0 dragon are equal if -1 less then or 1 if greater then the dragons we compared.
     */
    @Override
    public int compareTo(@NotNull Object o) {
        Dragon d = (Dragon)o;
        int comp = color.compareTo(d.getColor());
        if (comp != 0) {
            return comp;
        }
        comp = age-d.getAge();
        if (comp != 0) {
            return comp;
        }
        comp = width-d.getWidth();
        if (comp != 0) {
            return comp;
        }
        comp = name.compareTo(d.getName());
        if (comp != 0) {
            return comp;
        }
        return 0;
    }

    /**
     * Public method witch returns dragon with all the information like: name, age, width, colour.
     *
     * @return Dragon with all the information like: name, age, width, colour.
     */
    @Override
    public String toString(){
        return name+ ", " + age + ", " + width + ", " + color ;
    }
}
