package Structural.Composite;

public class ImageFile extends File {

    ImageFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("图片文件" + super.name);
    }
}
