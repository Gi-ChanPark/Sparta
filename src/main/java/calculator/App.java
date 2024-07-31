package calculator;

import java.util.Scanner;

// App 실행 클래스
// 사용자로부터 입력을 받아 사칙연산 또는 원의 넓이 계산을 수행합니다.
// Calculator와 CircleCalculator 인스턴스를 사용하여 연산을 처리합니다.
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성
        ArithmeticCalculator calculator = new ArithmeticCalculator(); // 사칙연산 계산기 인스턴스 생성
        CircleCalculator circleCalculator = new CircleCalculator(); // 원의 넓이 계산기 인스턴스 생성

        while (true) {
            // 사용자 선택을 받는 부분
            System.out.print("사칙연산을 진행하시겠습니까? (A를 입력) 아니면 원의 넓이를 구하시겠습니까? (B를 입력): ");
            String choice = sc.nextLine().trim(); // 사용자 입력 받기

            if (choice.equalsIgnoreCase("A")) { // 사칙연산 선택
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt(); // 첫 번째 숫자 입력 받기
                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt(); // 두 번째 숫자 입력 받기
                sc.nextLine(); // 다음 줄 개행 문자 제거

                System.out.print("연산 기호를 입력하세요 (+, -, *, /, %): ");
                char operator = sc.nextLine().charAt(0); // 연산 기호 입력 받기

                try {
                    int result = calculator.calculate(num1, num2, operator); // 사칙연산 수행
                    System.out.println("결과: " + result); // 결과 출력
                } catch (ArithmeticCalculator.InvalidOperationException e) {
                    System.out.println(e.getMessage()); // 예외 메시지 출력
                }

                // 추가 기능: 계속 계산할지 종료할지 선택
                System.out.println("계속 계산하시겠습니까? (계속하려면 아무 키나 누르고, 종료하려면 'exit' 입력)");
                String input = sc.nextLine(); // 사용자 입력 받기

                if (input.equalsIgnoreCase("exit")) {
                    break; // 반복 종료
                }

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (삭제하려면 'remove' 입력)");
                input = sc.nextLine(); // 사용자 입력 받기

                if (input.equalsIgnoreCase("remove")) {
                    calculator.removeResult(); // 결과 삭제
                }

                System.out.println("연산 결과를 조회하시겠습니까? (조회하려면 'inquiry' 입력)");
                input = sc.nextLine(); // 사용자 입력 받기

                if (input.equalsIgnoreCase("inquiry")) {
                    calculator.inquiryResults(); // 저장된 결과 조회
                }

            } else if (choice.equalsIgnoreCase("B")) { // 원의 넓이 선택
                System.out.print("원의 반지름을 입력하세요: ");
                double radius = sc.nextDouble(); // 반지름 입력 받기
                sc.nextLine(); // 다음 줄 개행 문자 제거

                double area = circleCalculator.calculateCircleArea(radius); // 원의 넓이 계산
                System.out.println("원의 넓이: " + area); // 넓이 출력

                // 추가 기능: 계속 계산할지 종료할지 선택
                System.out.println("계속 계산하시겠습니까? (계속하려면 아무 키나 누르고, 종료하려면 'exit' 입력)");
                String input = sc.nextLine(); // 사용자 입력 받기

                if (input.equalsIgnoreCase("exit")) {
                    break; // 반복 종료
                }

                System.out.println("연산 결과를 삭제하시겠습니까? (삭제하려면 'remove' 입력)");
                input = sc.nextLine(); // 사용자 입력 받기

                if (input.equalsIgnoreCase("remove")) {
                    circleCalculator.removeResult(); // 결과 삭제
                }

                System.out.println("결과를 조회하시겠습니까? (조회하려면 'inquiry' 입력)");
                input = sc.nextLine(); // 사용자 입력 받기

                if (input.equalsIgnoreCase("inquiry")) {
                    circleCalculator.inquiryResults(); // 저장된 결과 조회
                }
            }
        }
        sc.close(); // Scanner 객체 닫기
    }
}
