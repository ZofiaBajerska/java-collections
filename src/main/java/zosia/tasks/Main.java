package zosia.tasks;
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        DragonCatalog catalog = new DragonCatalog();
        catalog.add(new Dragon("Szczerbatek", 107, 87, DragonColor.BLACK));
        catalog.add(new Dragon("Biała Furia", 98, 76, DragonColor.WHITE));

        catalog.printAll();
        System.out.println("--------------------");
        catalog.printNames();
        System.out.println("--------------------");
        catalog.printSortedNameAndColour();

    }

}
