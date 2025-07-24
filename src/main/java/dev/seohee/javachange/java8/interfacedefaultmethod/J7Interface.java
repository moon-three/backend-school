package dev.seohee.javachange.java8.interfacedefaultmethod;

public interface J7Interface {
    // 인터페이스에 일반 메서드만 정의되어 있다면
    // 그 구현은 각 클래스가 직접 해야 하므로 동작을 바꾸려면 전부 수정해야 한다.
    // 하지만 default 메서드는 인터페이스에 구현을 담을 수 있어서, 하나만 바꾸면 모든 구현체에 자동 반영된다.
    void printClassName();
}
