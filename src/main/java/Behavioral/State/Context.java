package Behavioral.State;

class Context {

    State state;

    void setState(State state) {
        this.state = state;
    }

    State getState(State state) {
        return state;
    }
}
