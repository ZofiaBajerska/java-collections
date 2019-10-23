package zosia.tasks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DragonCatalog {
    private List<Dragon> dragons = new ArrayList<>();

    public void add(Dragon d){
        dragons.add(d);
    }

    public void add(List<Dragon> ld)
    {
        dragons.addAll(ld);
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
        dragons.stream().sorted((o1, o2)->o1.getName().compareTo(o2.getName())).forEach(dragon -> System.out.println(dragon.getName()+" ,"+dragon.getColor()));
    }
    public String printSortedAge(){
        return dragons.stream().sorted(((o1, o2) -> o2.getAge()-o1.getAge())).findFirst().get().toString();
    }
    public int printLongestWings(){
        return dragons.stream().mapToInt(Dragon::getWidth).max().getAsInt();
    }
    public int printLongestName(){
        return dragons.stream().mapToInt(d -> d.getName().length()).max().getAsInt();
    }
    public List<Dragon> getNewColorDragonList(DragonColor color) {
        return dragons.stream().filter(o ->o.getColor()==color).collect(Collectors.toList());
    }
    public List<String> getNamesList(){
        return dragons.stream().map(Dragon::getName).collect(Collectors.toList());
    }
    public List<String> getColorsAsString(){
        return dragons.stream().map(d -> d.getColor().toString().toUpperCase()).collect(Collectors.toList());
    }
    public List<Dragon> getNaturalOrder(){
        return dragons.stream().sorted().collect(Collectors.toList());
    }
    public List<Dragon> getAgeSorted() {
        return dragons.stream().sorted(Comparator.comparingInt(Dragon::getAge)).collect(Collectors.toList());
    }
    public boolean checkIfEveryOlderThan(int age){
        return dragons.stream().allMatch(dragon -> dragon.getAge()>age);
    }
    public boolean checkIfEnyInColour(DragonColor color){
        return dragons.stream().anyMatch(dragon -> dragon.getColor()==color);
    }
    public List<DragonEgg> getAllEggs(){
        return dragons.stream().map(d -> {
            return new DragonEgg(d);
        }).collect(Collectors.toList());
    }
    public List<DragonEgg> getEggsForWidthBiggerThen(int width) {
        return dragons.stream().filter(dragon -> dragon.getWidth()>width).map(d -> {
            return new DragonEgg(d);
        }).collect(Collectors.toList());
    }
























}
