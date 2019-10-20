package zosia.tasks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DragonCatalog {
    private List<Dragon> dragons = new ArrayList<>();

    public void add(Dragon d){
        dragons.add(d);
    }

    public void remove(Dragon d){
        dragons.remove(d);
    }

    public void printAll(){
        dragons.stream().forEach(System.out::println);
    }

    public void printNames(){
        dragons.stream().forEach(dragon -> System.out.println(dragon.getName()));
    }
    public void printSortedNameAndColour(){
        dragons.stream().sorted((o1, o2)->o1.getName().compareTo(o2.getName())).forEach(dragon -> System.out.println(dragon.getName()+","+dragon.getColor()));
    }
}
