package calculator;

import java.util.ArrayList;
import java.util.List;

// 이 클래스는 연산 결과를 저장하고, 결과를 삭제하거나 조회하는 기능을 제공합니다.
// 사칙연산과 원의 넓이 계산기 등 다양한 계산기 클래스가 이 클래스를 상속받아 사용할 수 있습니다.
public abstract class Calculator {
    // 결과를 저장하는 List, 연산 결과는 Double 타입으로 저장
    protected List<Double> results;

    // 생성자
    // 결과를 저장하기 위한 ArrayList를 초기화합니다.
    public Calculator() {
        this.results = new ArrayList<>();
    }

    // 가장 먼저 저장된 결과를 삭제하는 메서드
    // 리스트가 비어있지 않으면, 가장 먼저 저장된 결과를 삭제합니다.
    // 리스트가 비어있는 경우, 삭제할 결과가 없다는 메시지를 출력합니다.
    public void removeResult() {
        if (!results.isEmpty()) {
            results.remove(0); // 가장 먼저 저장된 결과 삭제
            System.out.println("가장 먼저 저장된 결과가 삭제되었습니다.");
        } else {
            System.out.println("저장된 결과가 없습니다."); // 결과가 없을 때 메시지 출력
        }
    }

    // 저장된 연산 결과를 조회하는 메서드
    // 리스트에 저장된 모든 결과를 출력합니다.
    public void inquiryResults() {
        System.out.println("저장된 결과:");
        for (double result : results) {
            System.out.println(result); // 결과 출력
        }
    }
}
