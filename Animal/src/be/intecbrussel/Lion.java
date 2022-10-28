package be.intecbrussel;

public class Lion extends Animal {

    int age;

    public void meouw(){

    }
    public void eat(){
        super.eat(); //override
        System.out.println("Lion eating");
    }

}
