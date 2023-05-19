package de.hsco.ki1.uebungen.u03.a02.staubsauger;

import hs.ki1.uebungen.u03.a02.State;

import java.util.List;

public class StaubsaugerState implements State {

    private int x;
    private int y;
    private boolean saugt;

    private final List<String> actions = List.of("L", "R", "S");

    public StaubsaugerState(int x, int y, boolean saugt) {
        this.x = x;
        this.y = y;
        this.saugt = saugt;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean getSaugt() {
        return saugt;
    }

    public boolean equals(Object obj) {
        if (obj instanceof StaubsaugerState) {
            StaubsaugerState state = (StaubsaugerState) obj;
            return (state.x == x && state.y == y && state.saugt == saugt);
        }
        return false;
    }

    public int hashCode() {
        return (x + y + (saugt ? 1 : 0));
    }

    public String toString() {
        return "(" + x + ", " + y + ", " + (saugt ? "saugt" : "nicht saugt") + ")";
    }
}
