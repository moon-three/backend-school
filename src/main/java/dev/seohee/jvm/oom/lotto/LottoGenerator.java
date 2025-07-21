package dev.seohee.jvm.oom.lotto;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 로또 번호를 생성하는 클래스
 */
class LottoGenerator {
    public List<Integer> generate() {
        List<Integer> numbers = new ArrayList<>(); // 자동 정렬
        while (numbers.size() < 6) {
            numbers.add(ThreadLocalRandom.current().nextInt(1, 46));
        }
        return numbers;
    }
}

