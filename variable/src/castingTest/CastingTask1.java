package castingTest;

public class CastingTask1 {
	public static void main(String[] args) {
//		5분
//		8.43 + 2.59를 더해서 10이 나오도록 출력하기
//		단 변수에 값을 담아서 사용하기
		double number1 = 8.43, number2 = 2.59;
		int result = 0;
		
		result = (int)number1 + (int)number2;
		System.out.printf("결과 값 : %d", result);
	}
}
