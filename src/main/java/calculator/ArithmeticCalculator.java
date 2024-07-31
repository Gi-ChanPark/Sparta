package calculator;

// ArithmeticCalculator 클래스는 Calculator 클래스를 상속받아 사칙연산을 수행합니다.
public class ArithmeticCalculator extends Calculator {

    // 사용자 정의 예외 클래스
    // 잘못된 연산 기호가 입력되었거나 연산에 문제가 있을 때 예외를 던집니다.
    public static class InvalidOperationException extends Exception {
        // 생성자
        // 예외 발생 시 메시지를 설정합니다.
        public InvalidOperationException(String message) {
            super(message);
        }
    }

    // 사칙연산을 수행하는 메서드
    // 두 숫자와 연산 기호를 받아서 해당 연산을 수행합니다.
    // 연산 기호가 잘못되었거나 나누기/나머지 연산에서 분모가 0인 경우 예외를 던집니다.
    public int calculate(int num1, int num2, char operator) throws InvalidOperationException {
        int result; // 연산 결과를 저장할 변수

        // 연산 기호에 따라 수행할 연산을 결정합니다.
        switch (operator) {
            case '+': // 덧셈
                result = num1 + num2;
                break;
            case '-': // 뺄셈
                result = num1 - num2;
                break;
            case '*': // 곱셈
                result = num1 * num2;
                break;
            case '/': // 나눗셈
                // 분모가 0인 경우 예외를 던집니다.
                if (num2 == 0) {
                    throw new InvalidOperationException("나눗셈 연산에서 0으로 나눌 수 없습니다.");
                }
                result = num1 / num2;
                break;
            case '%': // 나머지 연산
                // 분모가 0인 경우 예외를 던집니다.
                if (num2 == 0) {
                    throw new InvalidOperationException("나머지 연산에서 0으로 나눌 수 없습니다.");
                }
                result = num1 % num2;
                break;
            default: // 잘못된 연산 기호
                throw new InvalidOperationException("잘못된 연산 기호입니다.");
        }

        // 계산 결과를 double 타입으로 변환하여 results 리스트에 저장합니다.
        results.add((double) result);

        // 계산된 결과를 반환합니다.
        return result;
    }
}
