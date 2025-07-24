package dev.seohee.javachange.java8.interfacedefaultmethod;

public class J7Class implements J7Interface{
    @Override
    public void printClassName() {
        System.out.println(getClass().getSimpleName());
    }
}
