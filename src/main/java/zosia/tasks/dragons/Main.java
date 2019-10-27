package zosia.tasks.dragons;

import zosia.tasks.models.Dragon;
import zosia.tasks.models.DragonCatalog;
import zosia.tasks.models.DragonColor;

import java.util.List;

/**
 * Application Main class
 *
 * @author Zofia B.
 */
public class Main {

    /**
     *Application main method.
     *
     * @param args application command line arguments.
     */
    public static void main(String[] args) {

        DragonCatalog catalog = new DragonCatalog();
        catalog.add(new Dragon("Szczerbatek", 107, 87, DragonColor.BLACK));
        catalog.add(new Dragon("Biała Furia", 98, 76, DragonColor.WHITE));
        catalog.add(new Dragon("Czaszkochrup", 113, 56, DragonColor.GREEN));
        catalog.add(new Dragon("Wichura", 108, 112, DragonColor.BLUE));
        catalog.add(new Dragon("Sztukomięs", 87, 98, DragonColor.BROWN));
        catalog.add(new Dragon("Hakokieł", 118, 147, DragonColor.BROWN));

        catalog.printAll();
        System.out.println("--------------------");
        catalog.printNames();
        System.out.println("--------------------");
        catalog.printSortedNameAndColour();
        System.out.println("--------------------");
        System.out.println(catalog.printSortedAge());
        System.out.println("--------------------");
        System.out.println(catalog.printLongestWings());
        System.out.println("--------------------");
        System.out.println(catalog.printLongestName());
        System.out.println("--------------------");
        DragonCatalog coloured = new DragonCatalog();
        coloured.add(catalog.getNewColorDragonList(DragonColor.BROWN));
        coloured.printAll();
        System.out.println("--------------------");
        List<String> names = catalog.getNamesList();
        names.stream().forEach(System.out::println);
        System.out.println("--------------------");
        List<String> colors = catalog.getColorsAsString();
        colors.stream().forEach(System.out::println);
        System.out.println("--------------------");
        List<Dragon> naturalOrderList = catalog.getNaturalOrder();
        naturalOrderList.stream().forEach(System.out::println);
        System.out.println("--------------------");
        List<Dragon> ageSorted = catalog.getAgeSorted();
        ageSorted.stream().forEach(System.out::println);
        System.out.println("--------------------");
        System.out.println(catalog.checkIfEveryOlderThan(100));
        System.out.println("--------------------");
        System.out.println(catalog.checkIfEnyInColour(DragonColor.BROWN));
        System.out.println("--------------------");
        catalog.getAllEggs().forEach(egg -> System.out.println(egg.getColor()));
        System.out.println("--------------------");
        catalog.getEggsForWidthBiggerThen(100).forEach(egg -> System.out.println(egg.getColor()));

    }

}
