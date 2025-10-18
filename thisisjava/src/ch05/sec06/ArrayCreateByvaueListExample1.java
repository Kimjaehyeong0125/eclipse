package ch05.sec06;

public class ArrayCreateByvaueListExample1 {

	public static void main(String[] args) {
		// 배열 변수 선언과 배열 생성
		String[] season = {"Spring","Summer", "Fall", "Winter"};
		
		System.out.println("season[0] :" + season[0]);
		System.out.println("season[1] :" + season[1]);
		System.out.println("season[2] :" + season[2]);
		System.out.println("season[3] :" + season[3]);
	
		//인덱스 1 항목의 값 변경
		season[1]="여름";
		System.out.println("season[1]: " + season[1]);
		System.out.println();	//줄바꿈
		
		//배열 변수 선업과 배열 생성
		int[] scores= {83,90,87 };
		
		//총합과 평균 구하기
		int sum = 0;
		for(int i = 0; i<3; i++) {
			sum+= scores[i];
		}
		System.out.println("총합: " +sum);
		double avg = (double)sum / 3; //형변환 할때 변수에만 'double'을 쓰면 연산할떄 값이 반영이 안됨
		System.out.println("평균: " +avg);
	}

}
