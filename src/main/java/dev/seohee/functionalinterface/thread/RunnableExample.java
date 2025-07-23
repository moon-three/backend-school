package dev.seohee.functionalinterface.thread;

public class RunnableExample {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Hello, World");

        Thread thread = new Thread(task);
        thread.start();
    }
}
