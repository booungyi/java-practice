package boou.java_practice;

import java.util.ArrayList;

public class ArrayList_2 {
    public static void main(String[] args) {
        ArrayList<String> 광역시목록 = new ArrayList<>();
        광역시목록.add("대전");
        광역시목록.add("일산");
        광역시목록.add("광주");
        광역시목록.add("울산");

        System.out.println("광역시목록 = " + 광역시목록);

        for (String city : 광역시목록) {
            System.out.println("city = " + city);
        }
        광역시목록.set(3, "전라도 광주");
        광역시목록.remove("일산");

        ArrayList<String> 광역시목록2 = new ArrayList<>();
        광역시목록2 = 광역시목록;
        광역시목록2.set(0, 광역시목록2.get(0)+"광역시");
        광역시목록2.set(1, 광역시목록2.get(1)+"광역시");
        광역시목록2.set(2, 광역시목록2.get(2)+"광역시");
        System.out.println(광역시목록2);

        for (String List : 광역시목록2) {
            System.out.println("광역시목록2 = " + List);
        }
    }
}
