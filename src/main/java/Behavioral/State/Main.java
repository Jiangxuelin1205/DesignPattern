package Behavioral.State;

public class Main {

    public static void main(String[] args) {

        Context context = new Context();
        State start = new StartState();
        State stop = new StopState();
        start.doAction(context);
        stop.doAction(context);
    }
}
