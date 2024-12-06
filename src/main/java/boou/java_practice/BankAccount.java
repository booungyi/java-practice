package boou.java_practice;

import java.util.Objects;

public class BankAccount {
    String accountNumber; //계좌번호
    Money balance; // 잔고
    String owner; //예금주

    //생성자
    // BankAccount 객체를 생성할 때, 계좌번호, 잔고, 예금주를 초기화합니다.
    public BankAccount(String accountNumber, Money balance, String owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    //입금
    // 이 함수는 입금하려는 금액(Money 객체)을 받아서 현재 잔고(balance)에 더한 후,
// 새로운 잔고를 balance에 저장합니다.
// balance는 Money 타입으로 선언되어 있으므로, plus 메서드를 사용하여 새로운 Money 객체를 반환받습니다.
//    balance = money.plus(balance);?

    public void deposit(Money money) {//Money 라는 매개변수의 타입 money 라는 매개변수를 받음
        // 이 함수는 Money 라는 클래스를 money 라는 변수명으로 호출해서 사용할수있음
        // ex) money.plus
        // balance 의 생성자의 따라서 받을수 있는 값이 달라지는데
        // 지금은 balance 가 int 형이라 받을수있다
//        balance = money.plus(balance);
        //그런데 다음으로 balance 라는 값 자체를 0 이하의 수가 들어갈수 없도록 제한해주는
        //money 라는 타입을 받는 변수로 바꾸고 싶으면
        //처음에 balance 변수를 만들떄 Money 타입으로 선언
        //Money balance; 이거는 Money 라는 타입의 변수를 받아서 저장할수있는 balance 변수를 선언함
        //그뒤 생성자에서 값을 받을때 Money balance 로 받음
        balance = money.plus(balance);
        //그럼 money 객체의 plus (output이 Money, intput 도 money인) 를
        //
        //
    }
    //근데 여기서 int 대신 0 이상의 값이라는 것을 보장할 수 있도록 Money 클래스를 만들면?

    //출금
/*
     이 함수는 출금하려는 금액(Money 객체)을 받아서 현재 잔고(balance)에서 빼고,
    새로운 잔고를 balance에 저장합니다.
     balance는 Money 타입이므로, minus 메서드를 사용하여 새로운 Money 객체를 반환받습니다.
*/
    public void withdraw(Money money) {
        // balance = balance - money;
        balance = balance.minus(money);
    }
}
