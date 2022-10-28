package be.intecbrussel;

public class Tree {

    //propertie
    private String name;

    //constructors
    public Tree() {

    }

    public Tree(String name){
        this.name = name;
        System.out.println("Super class all args Tree class");
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //own methode
    public void typeOfTree() {
        System.out.println("This is a tree");
    }
}
