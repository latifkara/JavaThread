package com.javaGelisme;

public class RunnableClass implements Runnable{
    private String name;

    public RunnableClass(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100 ; i++) {
            System.out.println(this.getName() + " Calisti");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
