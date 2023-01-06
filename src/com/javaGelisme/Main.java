package com.javaGelisme;

public class Main {

    public static void main(String[] args) {
	    /*SimpleThread thread1 = new SimpleThread();
        SimpleThread thread2 = new SimpleThread();

        thread1.start();
        thread2.start();*/

        RunnableClass run1 = new RunnableClass("one");
        RunnableClass run2 = new RunnableClass("two");
        RunnableClass run3 = new RunnableClass("three");

        Thread thread1 = new Thread(run1);
        Thread thread2 = new Thread(run2);
        Thread thread3 = new Thread(run3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
