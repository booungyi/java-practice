package boou.java_practice;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;
import static org.assertj.core.api.InstanceOfAssertFactories.list;

public class Codingtest_2 {
    @Test
    void name() {
//        List<Integer> l = List.of(3, 30, 45, 6, 9);
//        List<Integer> sorted = l.stream().sorted().toList();
//        List<Integer> sorted2 = l.stream().sorted(Comparator.reverseOrder()).toList();
//        System.out.println(sorted);
//        System.out.println(sorted2);
//        assertThat(Bigest(l)).isEqualTo(9645330);
    }

    //완주하지못한선수
    //participant = 마라톤에 참여한 선수
    //completion = 완주한 선수
    //runaway = 완주 못한 선수
    public String cannot(String[] participantArray, String[] completionArray) {
        List<String> participant = List.of(participantArray);
//        List<String> completion = new ArrayList<>(Arrays.asList(completionArray));
        HashMap<String, Integer> completion = new HashMap<>();
        for (String complet : completionArray) {
            if (!completion.containsKey(complet)) {
                completion.put(complet, 1);
            }
            if (completion.containsKey(complet)) {
                Integer 기존값 = completion.get(complet);
                completion.put(complet, 기존값 + 1);
            }
        }

        for (String runner : participant) {
            if (completion.containsKey(runner)) {
                Integer 기존값 = completion.get(runner);
                if (기존값 - 1 == 0) {
                    completion.remove(runner);
                } else {
                    completion.put(runner, 기존값 - 1);
                }
            } else {
                return runner;
            }
        }
        return "";
    }

//    //가장큰수
//    String Bigest(List<Integer> numbers) {
//        List<Integer> integers = List.of(6, 8, 2);
//        List<String> strings = new ArrayList<>();
//        for (Integer n : integers) {
//            strings.add(Integer.toString(n));
//        }
////        List<String> reversed = strings.stream()
////                .sorted(Comparator.reverseOrder())
////                .toList();
////        System.out.println("reversed=" + reversed);
//        strings.stream()
//                .sorted((a, b) -> {
//                    //3,30
//                    //330
//                    //303
//                    if (Integer.valueOf(a + b) > Integer.valueOf(b + a)) {
//                        return -1;
//                    } else {
//                        return 1;
//                    }
//                })
//                .toList();
//        return strings;
    }


