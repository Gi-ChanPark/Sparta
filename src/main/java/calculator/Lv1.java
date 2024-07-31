package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> results = new ArrayList<>();
        String input;

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");
            char operator = sc.next().charAt(0);
            int result = 0;
            boolean value = true;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("나머지 연산에서 0으로 나눌 수 없습니다.");
                        value = false;
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("잘못된 연산 기호입니다.");
                    value = false;
            }

            if (value) {
                System.out.println("결과: " + result);
                results.add(result);
            }

            System.out.println("계속 계산하시겠습니까? (계속하려면 아무 키나 누르고, 종료하려면 'exit' 입력)");
            input = sc.next();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (삭제하려면 'remove' 입력)");
            input = sc.next();

            if (input.equalsIgnoreCase("remove")) {
                if (!results.isEmpty()) {
                    results.remove(0);
                    System.out.println("가장 먼저 저장된 결과가 삭제되었습니다.");
                } else {
                    System.out.println("저장된 결과가 없습니다.");
                }
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (조회하려면 'inquiry' 입력)");
            input = sc.next();

            if (input.equalsIgnoreCase("inquiry")) {
                System.out.println("저장된 연산 결과:");
                for (int res : results) {
                    System.out.println(res);
                }
            }
        }
        sc.close();
    }
}
