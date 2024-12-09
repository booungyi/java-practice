package boou.java_practice;

import java.util.Objects;

public class Money {
    int value;
    //    근데 여기서 int 대신 0 이상의 값이라는 것을 보장할 수 있도록 Money 클래스를 만들면?
    // int 대신 0 이상의 값을 보장할수있어야됨 -> 포장


    // 이 생성자는 money라는 값을 받아서 value에 할당합니다. 만약 money가 음수라면 예외를 발생시킬 수 있습니다.
    public Money(int money) {
        if (money < 0) {
            //error
        }
        this.value = money;
    }

    // 이 함수는 입력받은 money를 현재 value에 더한 후 그 결과를 반환합니다.
    int plus(int money) {// 이함수를 쓰려면 input 이 money 고 output이 int 여야함
        return value += money;
    }

    //    이 함수는 Money 객체를 받아서 해당 객체의 value 값을 더하고, 새로운 Money 객체를 반환합니다.
    Money plus(Money money) {
        return new Money(value + money.value);
    }

    // 이 함수는 입력받은 money 값을 현재 value에서 빼고 그 결과를 반환합니다.
    int minus(int money) {
        return this.value -= money;
    }

    // 이 함수는 Money 객체를 받아서 해당 객체의 value 값을 빼고, 새로운 Money 객체를 반환합니다.
    Money minus(Money money) {
        return new Money(value - money.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return value == money.value;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
