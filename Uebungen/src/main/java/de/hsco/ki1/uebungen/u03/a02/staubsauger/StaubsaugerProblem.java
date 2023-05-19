package de.hsco.ki1.uebungen.u03.a02.staubsauger;

import hs.ki1.uebungen.u03.a02.Problem;
import hs.ki1.uebungen.u03.a02.State;

public class StaubsaugerProblem implements Problem<StaubsaugerProblem, StaubsaugerState> {
    @Override
    public State getInitialState() {
        return null;
    }

    @Override
    public boolean isGoalState(State state) {
        return false;
    }

    @Override
    public State[] getSuccessors(State state) {
        return new State[0];
    }

    @Override
    public int getCost(State from, String action, State to) {
        return 0;
    }

    @Override
    public State getResult(State state, String action) {
        return null;
    }
}
