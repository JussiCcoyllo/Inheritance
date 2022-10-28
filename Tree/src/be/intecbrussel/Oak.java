package be.intecbrussel;

public class Oak extends Tree{
    //properties
    private int height;
    private int age;
    private String color;


    //constructor same name from class
    //no-args constructor (default)
    //constructor overloading
    public Oak(){
//        this(200, 15,"Red"); //constructor chaining
        System.out.println("constructor no args oak");
    }
    //constructor with 1 parameter
    public Oak(int height){
        this.height = height;
        System.out.println("constructor 1 args oak");
    }

    public int getHeight() {
        return height;
    }

    //encasulaption
    public void setHeight(int height) {
        if(height<200){
        this.height = height;
        } else {
            System.out.println("Not good");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Oak{" +
                "height=" + height +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    //constructor with all args
    public Oak(int height, int age, String color) {
        setHeight(height);
        this.age = age;
        this.color = color;
        System.out.println("constructor all args oak");


    }


}
