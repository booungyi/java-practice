package boou.java_practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class ArrayListFunction_4 {

    @Test
    void test() {
        //양수 필터링
        assertThat(filterPositive(List.of(-1, 2, -3, 4, 0))).isEqualTo(List.of(2, 4));
        assertThat(filterPositive(List.of(-1, -2, -3))).isEqualTo(List.of());
        assertThat(filterPositive(List.of())).isEqualTo(List.of());
        //합격생 필터링
        assertThat(findPassedStudents(List.of(70, 85, 90, 75, 80))).isEqualTo(List.of(85, 90, 80));
        assertThat(findPassedStudents(List.of(70, 75, 79))).isEqualTo(List.of());
        assertThat(findPassedStudents(List.of(80, 85, 90))).isEqualTo(List.of(80, 85, 90));
        //중복 리스트 제거
        assertThat(removeDuplicates(List.of(1, 2, 2, 3, 4, 4, 5))).isEqualTo(List.of(1, 2, 3, 4, 5));
        assertThat(removeDuplicates(List.of(1, 1, 1, 1))).isEqualTo(List.of(1));
        assertThat(removeDuplicates(List.of())).isEqualTo(List.of());

        assertThat(나보다높은사람수(List.of(30, 40, 50, 30, 40), 35)).isEqualTo(3);

        //성적 순위 계산
        assertThat(calculateRanks(List.of(80, 90, 70, 85))).isEqualTo(List.of(3, 1, 4, 2));
        assertThat(calculateRanks(List.of(100, 100, 80))).isEqualTo(List.of(1, 1, 3));
        assertThat(calculateRanks(List.of())).isEqualTo(List.of());
        //쇼핑 카트 시뮬레이션
        assertThat(calculateTotalPrice(List.of(1000, 2000, 3000))).isEqualTo(6000);
        assertThat(calculateTotalPrice(List.of(5000))).isEqualTo(5000);
        assertThat(calculateTotalPrice(List.of())).isEqualTo(0);
        //고가 상품 필터링
        assertThat(filterExpensiveItems(List.of(1000, 2000, 3000, 4000), 2500)).isEqualTo(List.of(3000, 4000));
        assertThat(filterExpensiveItems(List.of(1000, 1500, 2000), 3000)).isEqualTo(List.of());
        assertThat(filterExpensiveItems(List.of(), 2000)).isEqualTo(List.of());
        //중북 상품 개수 계산
//        assertThat(countDuplicateItems(List.of(1000, 2000, 1000, 3000, 2000))).isEqualTo(List.of(List.of(1000, 2), List.of(2000, 2), List.of(3000, 1)));
//        assertThat(countDuplicateItems(List.of(5000))).isEqualTo(List.of(List.of(5000, 1)));
//        assertThat(countDuplicateItems(List.of())).isEqualTo(List.of());
    }
//assertThat(나보다높은사람수(List.of(30, 40, 50, 30, 40), 35)).isEqualTo(3);


    //양수 필터링
    List<Integer> filterPositive(List<Integer> number) {
        ArrayList<Integer> sum = new ArrayList<>();

        if (number.isEmpty()) {
            return sum;
        }
        for (Integer list : number) {
            if (list > 0) {
                sum.add(list);
            }
        }
        return sum;
    }

    //합격생 필터링
    ArrayList<Integer> findPassedStudents(List<Integer> numbers) {
        ArrayList<Integer> passed = new ArrayList<>();
        int passnum = 80;
        for (Integer number : numbers) {
            if (number >= passnum) {
                passed.add(number);
            }
        }
        return passed;
    }

    //리스트 중복 제거
    ArrayList<Integer> removeDuplicates(List<Integer> numbers) {
        ArrayList<Integer> List = new ArrayList<>();
        //numbers 로 리스트를 받아오면
        //list 배열에 저장하게되는데 이때 이미 List 에 저장되있는 정수와 같은 수 는 받지 않음
        for (Integer number : numbers) {
            if (!List.contains(number)) {
                List.add(number);
            }
        }
        return List;
    }

    int 나보다높은사람수(List<Integer> scores, int 기준점수) {
        ArrayList<Integer> high = new ArrayList<>();
        int rule = 기준점수; // => sum.get(sum2.get(i)) == i 는0부터 1씩 증가
        int higher = 0;      // =>
//        for (Integer score : scores) {
//            high.add(score);
//            if (high.get(high.size()-1)>기준점수) {
//                higher ++;
//            }
//        }
        for (Integer score : scores) {
            if (score > 기준점수) {
                higher++;
            }
        }
        return higher;
    }
    //성적 순위 계산
    //각 성적의 순위를 계산함
    //순위는 1 부터 시작하며 동점자는 같은 순위를 가집니다.
    //성적이 높을수록 순위가 높습니다.

    ArrayList<Integer> calculateRanks(List<Integer> numbers) {
        ArrayList<Integer> higher = new ArrayList<>();// 반환할 인티저형 List

        //조건 = number 가 들어왔을때 넘버랑 n 번째 숫자와 비교해서 high 가 몇인지
        for (Integer standardGrade : numbers) {
            int high = 0;//몇 등인지 (정확히는 내위로 몇명있는지) 확인할 정수형 변수
            for (Integer comp : numbers) {
                if (standardGrade < comp) {
                    high++;
                }
            }
            higher.add(high + 1);
//                for (int i = 0; i < sum.size(); i++) {
//                    higher.add(sum.size());
//                    if (sum.get(i) < number) {
//                        higher.add(i, high );
//                        high++;
//                    } else if (sum.get(i).equals(number)) {
//                        higher.set(i, high);
//                        high++;
//                    } else {
//                        higher.set(i, high);
//                    } //빙빙 돌아가기전에 정리좀하자
//                }
        }
        return higher;
    }

    //총 상품 가격 계산
    int calculateTotalPrice(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

    //Integer 타입의 상품가격 리스트 와 기준가격이 주어짐
    //기준 가격 이상인 상품들만 추출하여 새로운 리스트로 반환하기
    //빈 리스트가 주어질 경우 빈 리스트를 반환함
    ArrayList<Integer> filterExpensiveItems(List<Integer> numbers, int price) {
        ArrayList<Integer> sum = new ArrayList<>();
        for (Integer number : numbers) {        //number = 비교할 금액
            if (number > price) {
                sum.add(number);
            }
        }
        return sum;
    }
}

