package zosia.tasks;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter


public class Dragon implements Comparable {
    String name;
    int age;
    int width;
    DragonColor color;


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


}
