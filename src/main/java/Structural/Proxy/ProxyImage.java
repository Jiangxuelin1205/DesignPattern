package Structural.Proxy;

public class ProxyImage implements Image {

    private RealImage image;
    private String filename;

    ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (image == null) {
            image = new RealImage(filename);
        }
        image.display();
    }
}
