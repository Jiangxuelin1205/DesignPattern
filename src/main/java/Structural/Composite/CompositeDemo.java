package Structural.Composite;

public class CompositeDemo {

    public static void main(String[] args) {
        Folder folder = new Folder("total");
        TextFile textFile = new TextFile("a.txt");
        ImageFile imageFile = new ImageFile("b.jpg");
        Folder subFolder = new Folder("c");

        folder.add(textFile);
        folder.add(imageFile);
        folder.add(subFolder);

        TextFile t1 = new TextFile("t1.txt");
        ImageFile i1 = new ImageFile("i1.jpg");
        VideoFile v1 = new VideoFile("v1.mp3");
        subFolder.add(i1);
        subFolder.add(t1);
        subFolder.add(v1);

        folder.display();
    }
}
