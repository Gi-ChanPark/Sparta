package calculator;

public class DivideOperator implements Operator {
    @Override
    public int operate(int num1, int num2) throws ArithmeticCalculator.InvalidOperationException {
        if (num2 == 0) {
            throw new ArithmeticCalculator.InvalidOperationException("나머지 연산에서 0으로 나눌 수 없습니다.");
        }
        return num1 / num2;
    }
}
