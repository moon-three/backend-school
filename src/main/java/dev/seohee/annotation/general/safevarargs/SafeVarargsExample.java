package dev.seohee.annotation.general.safevarargs;

public class SafeVarargsExample {
    @SafeVarargs
    // 제네릭 가변인자 사용에서 발생할 수 있는 heap pollution 경고를 억제하기 위한 어노테이션
    public static <T> void printMessage(T... messages) {
        for(T message : messages) {
            System.out.println(message);
        }
    }
}
