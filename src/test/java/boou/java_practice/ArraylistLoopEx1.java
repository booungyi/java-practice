package boou.java_practice;

import java.util.*;

public class ArraylistLoopEx1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(80);
        numbers.add(60);
        numbers.add(70);
        numbers.add(100);
        numbers.add(90);
        System.out.println("numbers = " + numbers);

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
            System.out.println(number);
        }
        System.out.println("총점 =" + sum);
        int num = sum / numbers.size();
        System.out.println("평균 = " + num);

        int bigsum = numbers.get(0);
        int smallsum = numbers.get(0);

        for (Integer number : numbers) {
            if (bigsum < number) {
                bigsum = number;
            }
            if (smallsum > number) {
                smallsum = number;
            }
        }
        //최고점수
        System.out.println(bigsum);
        //최저 점수
        System.out.println(smallsum);
        ArrayList<Integer> smallist = new ArrayList<>();
        ArrayList<Integer> biglist = new ArrayList<>();

        //평균보다 낮은점수들만 따로 넣기
        for (Integer number : numbers) {
            if (number < num) {
                smallist.add(number);
            }

            if (number > num) {
                biglist.add(number);
            }
        }
        System.out.println(smallist);
        System.out.println(biglist);

//        Collections.sort(numbers);
//        System.out.println(numbers);
        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers);
        int listget = 0;

            if (numbers.size() % 2==1) { //정렬이 홀수일때
                listget = numbers.get((numbers.size() / 2)); //numbers.size = 5 %2 =1 => 0,1,"2",3,4
            } else { //짝수일때
                int sumlist = numbers.get(numbers.size() / 2-1); //
                int sumlist2 = numbers.get(numbers.size() / 2 );
                listget = (sumlist + sumlist2) / 2;
            }
        System.out.println("중앙값인 점수" + listget);
    }
}




