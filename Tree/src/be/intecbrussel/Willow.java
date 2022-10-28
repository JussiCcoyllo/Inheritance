package be.intecbrussel;

public class Willow extends Tree {

    private int width;
    private int numberOfLeaves;


    public Willow(){
//        this(10,10);
        System.out.println("Will class no args");
    }

    public Willow(int width, int numberOfLeaves) {
        super();
        this.width = width;
        this.numberOfLeaves = numberOfLeaves;
        System.out.println("Willow two args");
    }

//    public Willow(String name, int width, int numberOfLeaves) {
//        super(name);
//        this.width = width;
//        this.numberOfLeaves = numberOfLeaves;
//    }
}
