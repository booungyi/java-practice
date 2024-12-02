package boou.java_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramersPhonenumber {
    public static void main(String[] args) {

        System.out.printf("숫자를 입력해주세요 (\"끝\"입력시 종료) : ");
        Scanner scanner = new Scanner(System.in);
        List<String> Phone_book = new ArrayList<>();
        String scrapbook = scanner.nextLine();
        Phone_book.add(scrapbook);
        while (!scrapbook.equals("끝")) {
            System.out.printf("숫자를 입력해주세요 (\"끝\"입력시 종료) : ");
            scrapbook = scanner.nextLine();
            Phone_book.add(scrapbook);
            if (scrapbook.isEmpty()) {
                System.out.println("다시 입력해주세요: ");
            }
        }
        System.out.println(Phonenum(Phone_book));
    }
    public static Boolean Phonenum(List<String> phonnum) {
        boolean answer = true;
        for (String number : phonnum) {
            for (int i = 0; i < phonnum.size(); i++) {
                if (number.startsWith(phonnum.get(i)) &&
                        !phonnum.get(i).equals(number)) {     // phonnum 리스트에서 한 문자열을 포합하는 함수가 있으면
                    return !answer;
                }
            }
        }
        return answer;
    }
}




