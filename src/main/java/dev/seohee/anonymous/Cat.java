package dev.seohee.anonymous;

public class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("야옹");
    }

    public void name() {
        System.out.println("Cat");
    }
}
