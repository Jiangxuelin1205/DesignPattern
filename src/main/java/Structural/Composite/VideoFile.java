package Structural.Composite;

public class VideoFile extends File {

    VideoFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("音频文件 "+super.name);
    }
}
