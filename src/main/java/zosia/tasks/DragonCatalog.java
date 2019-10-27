package zosia.tasks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Public class to store the dragons.
 */

public class DragonCatalog {
    /**
     * List of Dragons stored in the public Class.
     */
    private List<Dragon> dragons = new ArrayList<>();

    /**
     * Public method to add dragons.
     *
     * @param d Dragon to be added to dragons catalog.
     */
    public void add(Dragon d){
        dragons.add(d);
    }

    /**
     * Public method to add list of dragons.
     *
     * @param ld List od dragons to be added.
     */
    public void add(List<Dragon> ld)
    {
        dragons.addAll(ld);
    }

    /**
     * Public method to remove chosen dragon from list.
     *
     * @param d Chosen dragon to remove from the list.
     */
    public void remove(Dragon d){
        dragons.remove(d);
    }

    /**
     * Public method to print all dragons from the list.
     */
    public void printAll(){
        dragons.forEach(System.out::println);
    }

    /**
     * Public method to print all names of all dragons from the collection.
     */
    public void printNames(){
        dragons.forEach(dragon -> System.out.println(dragon.getName()));
    }

    /**
     * Public method to print all names and colours of all dragons sorted by names is alfabetic order.
     */
    public void printSortedNameAndColour(){
        dragons.stream().sorted(Comparator.comparing(Dragon::getName)).forEach(dragon -> System.out.println(dragon.getName()+" ,"+dragon.getColor()));
    }

    /**
     * Public method to get the oldest dragon by age.
     *
     * @return The oldest dragon.
     */
    public String printSortedAge(){
        return dragons.stream().min((o1, o2) -> o2.getAge() - o1.getAge()).get().toString();
    }

    /**
     * Public method to get the length of the longest dragon wings.
     *
     * @return Length of the longest wings.
     */
    public int printLongestWings(){
        return dragons.stream().mapToInt(Dragon::getWidth).max().getAsInt();
    }

    /**
     * Public method to get the length of the longest name.
     *
     * @return Length of the longest name.
     */
    public int printLongestName(){
        return dragons.stream().mapToInt(d -> d.getName().length()).max().getAsInt();
    }

    /**
     * Public method  to get the list of the dragons in with a given colour.
     *
     * @param color The given colour.
     *
     * @return List of the dragons in given colour,
     */
    public List<Dragon> getNewColorDragonList(DragonColor color) {
        return dragons.stream().filter(o ->o.getColor()==color).collect(Collectors.toList());
    }

    /**
     * Public method to get new list of the dragons name.
     *
     * @return List with only dragons names.
     */
    public List<String> getNamesList(){
        return dragons.stream().map(Dragon::getName).collect(Collectors.toList());
    }

    /**
     * Public method to get list only of the dragons colour by uppercase.
     *
     * @return List with the dragons colour in uppercase.
     */
    public List<String> getColorsAsString(){
        return dragons.stream().map(d -> d.getColor().toString().toUpperCase()).collect(Collectors.toList());
    }

    /**
     * Public method to get new dragon list in natural order.
     *
     * @return List of the dragons in natural order,
     */
    public List<Dragon> getNaturalOrder(){
        return dragons.stream().sorted().collect(Collectors.toList());
    }

    /**
     * Public method to get list of the dragons sorted by age.
     *
     * @return List of the dragons sorted by age.
     */
    public List<Dragon> getAgeSorted() {
        return dragons.stream().sorted(Comparator.comparingInt(Dragon::getAge)).collect(Collectors.toList());
    }

    /**
     * Public method to check if all dragons in the collection are older then given age.
     *
     * @param age The number to be compare with age of all dragons.
     *
     * @return Boolean - true if all dragons are older than given age.
     */
    public boolean checkIfEveryOlderThan(int age){
        return dragons.stream().allMatch(dragon -> dragon.getAge()>age);
    }

    /**
     * Public method to check if at least one dragon has the same colour as given.
     *
     * @param color The colour to be compare with colour of all dragons.
     *
     * @return Boolean - true if at least one dragon has the given colour.
     */
    public boolean checkIfEnyInColour(DragonColor color){
        return dragons.stream().anyMatch(dragon -> dragon.getColor()==color);
    }

    /**
     * Public method to get the list of all dragons eggs.
     *
     * @return List of eggs.
     */
    public List<DragonEgg> getAllEggs(){
        return dragons.stream().map(DragonEgg::new).collect(Collectors.toList());
    }

    /**
     * Public method to get collections that contains eggs of dragons with wings width longer then the given width.
     *
     * @param width The given length of wings.
     *
     * @return List of dragons from dragons with the width bigger then given.
     */
    public List<DragonEgg> getEggsForWidthBiggerThen(int width) {
        return dragons.stream().filter(dragon -> dragon.getWidth()>width).map(DragonEgg::new).collect(Collectors.toList());
    }
}