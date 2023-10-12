package org.example;

public class Botanik extends Participant implements Solver {
    public Botanik(String name) {
        super(name);
    }

    @Override
    public void compete() {
        System.out.println(getName() + " решает задачи.");
        solve();
    }

    @Override
    public void solve() {
        System.out.println(getName() + " решает задачи очень быстро!");
    }
}