package calculator;

// 원의 넓이를 계산하는 클래스
// Calculator 클래스를 상속받아 원의 넓이를 계산하는 기능을 추가합니다.
public class CircleCalculator extends Calculator {
    // 원주율 상수
    private static final double PI = 3.14159;

    // 원의 넓이를 계산하는 메서드
    // 반지름을 받아 원의 넓이를 계산하고 결과를 반환합니다.
    public double calculateCircleArea(double radius) {
        double area = PI * radius * radius; // 원의 넓이 계산
        results.add(area); // 결과 저장
        return area; // 결과 반환
    }
}