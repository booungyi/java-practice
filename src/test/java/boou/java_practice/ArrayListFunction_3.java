package boou.java_practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.as;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.InstanceOfAssertFactories.MAP;

public class ArrayListFunction_3 {
    @DisplayName("시험 점수에 따라 합격 여부를 올바르게 판단해야 한다")
    @Test
    void test() {

        //최대값 구하기
        assertThat(findMax(List.of(3, 10, 5, 4, 7))).isEqualTo(10);
        assertThat(findMax(List.of(7))).isEqualTo(7);
        //최솟값 구하기
        assertThat(findMin(List.of(3, 10, 5, 4, 7))).isEqualTo(3);
        assertThat(findMin(List.of(7))).isEqualTo(7);
        //여러 과목 시험 합격/불합격 판단
        assertThat(isPass(List.of(60, 60))).isTrue();
        assertThat(isPass(List.of(40, 80))).isTrue();
        assertThat(isPass(List.of(39, 100, 100))).isFalse();
        assertThat(isPass(List.of(100, 0, 100))).isFalse();
        //두 수 사이의 정수
        assertThat(getIntegersBetween(1, 5)).isEqualTo(List.of(1, 2, 3, 4, 5));
        assertThat(getIntegersBetween(-3, 1)).isEqualTo(List.of(-3, -2, -1, 0, 1));
        assertThat(getIntegersBetween(3, 3)).isEqualTo(List.of(3));
        assertThat(getIntegersBetween(5, 1)).containsExactlyInAnyOrder(5, 4, 3, 2, 1);

    }

    int findMax(List<Integer> numbers) {
        int sum = 0;

        for (Integer number : numbers) {
            sum = Math.max(sum, number);
        }
        return sum;
    }

    int findMin(List<Integer> numbers) {
        int sum = 0;

        for (Integer number : numbers) {
            if (sum == 0) {
                sum = number;
            }
            sum = Math.min(sum, number);

        }
        return sum;
    }

    boolean isPass(List<Integer> numbers) {
        int sum = 0;
        int pass = 40;
        int passsum = 60;

        for (Integer number : numbers) {
            if (number < pass) {
                return false;
            }
            sum += number;

        }
        return (sum / numbers.size()) <= passsum;
    }

    // 두 정수가 주어질때 두 정수 사이의 모든 정수를 리스트에 담아  return 하는 함수
    List<Integer> getIntegersBetween(int start ,int end) {
        ArrayList<Integer> sum = new ArrayList<>();

        if (start <= end) {
            for (int i = start; i <= end; i++) {
                sum.add(i);

            }
            return sum;
        }
        else {    //start = 5 end =  1
            for (int i = start; i >= end; i--) {
                sum.add(i);
            }
        }
        return sum;
        //정수 를 담을 변수 선언
    }
}
