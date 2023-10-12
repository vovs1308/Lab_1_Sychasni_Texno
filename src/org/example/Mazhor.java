package org.example;

public class Mazhor extends Participant implements Runnable
{
    public Mazhor(String name) {
        super(name);
    }

    @Override
    public void compete() {
        System.out.println(getName() + " бежит.");
        run();
    }

    @Override
    public void run() {
        System.out.println(getName() + " быстро бежит!");
    }
}
