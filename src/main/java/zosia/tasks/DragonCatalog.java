package zosia.tasks;

import java.util.ArrayList;
import java.util.List;

public class DragonCatalog {
    private List<Dragon> dragons = new ArrayList<>();

    public void add(Dragon d){
        dragons.add(d);
    }

    public void remove(Dragon d){
        dragons.remove(d);
    }
}
