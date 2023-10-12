package org.example;

public class Rabotyaga extends Participant implements Runnable {
    public Rabotyaga(String name) {
        super(name);
    }

    @Override
    public void compete() {
        System.out.println(getName() + " бежит.");
        run();
    }

    @Override
    public void run() {
        System.out.println(getName() + " бежит немного медленнее.");
    }
}
