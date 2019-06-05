package Structural.Bridge;

public class GreenCircle implements DrawApi {

    @Override
    public void drawCircle(int radus, int x, int y) {
        System.out.println("Drawing color green " + "[radius:" + radus + ",x: " + x + ",y " + y+"]");
    }
}
