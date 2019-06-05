package Structural.Composite;

public abstract class File {

    String name;
    File(String name){
        this.name=name;
    }
    public abstract void display();
}
