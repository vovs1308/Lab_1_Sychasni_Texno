package org.example;

public class Student extends Participant implements Solver {
    public Student(String name) {
        super(name);
    }

    @Override
    public void compete() {
        System.out.println(getName() + " решает задачи.");
        solve();
    }

    @Override
    public void solve() {
        System.out.println(getName() + " решает задачи средней сложности.");
    }
}
