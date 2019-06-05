package Structural.Composite;

public class TextFile extends File {


    TextFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("文本文件名为：" +super.name);
    }
}
