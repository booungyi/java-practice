package boou.java_practice;

public class LottoNumbers {
    int lottoNumber;

    public LottoNumbers(int lottoNumber) {
        if (lottoNumber<1||lottoNumber>45) {
            throw new IllegalArgumentException("ERROR");
        }
        this.lottoNumber = lottoNumber;
    }
}
