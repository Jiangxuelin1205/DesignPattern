package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends File {

    private List<File> files;

    Folder(String name) {
        super(name);
        files = new ArrayList<>();
    }



    @Override
    public void display() {
        for(File f:files){
            f.display();
        }
    }

    public void add(File file){
        files.add(file);
    }

    public void remove(File file){
        files.remove(file);
    }
}
