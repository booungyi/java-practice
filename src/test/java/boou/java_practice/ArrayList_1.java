package boou.java_practice;

import java.util.ArrayList;

public class ArrayList_1 {
    public static void main(String[] args) {
        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("사과");
        fruitList.add("바나나");
        fruitList.add("딸기");

        fruitList.size();
        fruitList.get(1);
//      fruitList.get(99);

        for (String fruit : fruitList) {
            System.out.println("fruit = " + fruit);
        }
        fruitList.set(1, "수박");// index 1의 데이터를 "수박으로 수정
//        fruitList.set(99, "수박");// 에러

        fruitList.remove("수박");
        fruitList.remove(0);
//        fruitList.remove(99); //에러

    }
}
