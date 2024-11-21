package boou.java_practice;

import java.util.ArrayList;

public class ArrayList_3 {
    public static void main(String[] args) {
        ArrayList<String> remov = new ArrayList<>();
        remov.add("사과");
        remov.add("사과");
        remov.add("사과");
        remov.add("사과");
        remov.add("사과");
        for (String gets : remov) {
            System.out.println(gets);
        }
        remov.removeAll(remov);
        System.out.println("remov = " + remov);
    }
}
