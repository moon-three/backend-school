package dev.seohee.jvm.oom.lotto2;

import java.util.ArrayList;
import java.util.List;

/**
 * 무한히 로또 번호를 생성하여 OOM을 발생시키는 시뮬레이터
 */
public class LottoApplication2 {
    private static final List<List<Integer>> lottoList = new ArrayList<>();

    public static void main(String[] args) {
        LottoGenerator generator = new LottoGenerator();
        while (true) {
            List<Integer> lottoNumbers = generator.generate();
            System.out.println(lottoNumbers);

            if(lottoList.size() > 100) {
                lottoList.clear();
            }

            lottoList.add(lottoNumbers); // 계속 메모리에 쌓임
        }

    }
}
