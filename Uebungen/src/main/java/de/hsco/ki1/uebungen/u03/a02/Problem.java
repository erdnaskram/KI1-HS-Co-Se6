package de.hsco.ki1.uebungen.u03.a02;

public interface Problem<P extends Problem<P,S>, s extends State<P>> {
    public State getInitialState();
    public boolean isGoalState(State state);
    public State[] getSuccessors(State state);
    public int getCost(State from, String action, State to);

    public State getResult(State state, String action);
}
