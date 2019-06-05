package Structural.Bridge;

public class RedCircle implements DrawApi {

    @Override
    public void drawCircle(int radus, int x, int y) {
        System.out.println("Drawing color red " + "[radius:" + radus + ",x: " + x + ",y " + y+"]");
    }
}
