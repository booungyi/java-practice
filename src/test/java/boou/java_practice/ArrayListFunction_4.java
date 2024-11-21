package boou.java_practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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
    }

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
    
}

