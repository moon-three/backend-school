package dev.seohee.javachange.java8.interfacedefaultmethod;

import java.time.ZonedDateTime;

public class J8Class2 implements J8Interface {
    @Override
    public String getTime() {
        return ZonedDateTime.now(java.time.ZoneId.of("Europe/Paris")).toString();
    }
}
