package ch05.sec07;

public class MultidimensionalArrayByValueListExample {

	public static void main(String[] args) {
		//2차원 배열 생성
		int[][]scores= {
				{80,90,96},
				{76,88}
		};
		
		//배열의 길이
		System.out.println("1차원 배열 길이(반의 수):"+scores.length);
		System.out.println("2차원 배열 길이(첫번쨰 반의 학생 수"+scores[0].length);
		System.out.println("2차원 배열 길이(두번째 반의 학생 수)"+scores[1].length);
		
		//첫번째 반의 세번쨰 학생의 점수 읽기
		System.out.println("score[0][2]:"+scores[0][2]);
		
		//두번째 반의 두번째 학생의 점수 읽기
		System.out.println("score[1][1]"+scores[1][1]);
		
		//첫번째 반의 평균 점수 구하기
		int classSum=0;
		for(int i=0; i<scores[0].length;i++) {
			classSum += scores[0][i];
		}
		double classAvg = (double)classSum/ scores[0].length;
		System.out.println("첫번쨰 반의 평균 점수:" +classAvg);
		
		//첫번째 반의 평균점수 구하기
		int class25um=0;
		for(int i =0; i<scores[1].length;i++) {
			class25um += scores[1][i];
		}
		double class2Avg = (double)class25um/scores[1].length;
		System.out.println("두번째 반의 평균 점수: " +class2Avg);
		
		int totalStudent = 0;
		int totalSum = 0;
		for(int i = 0; i<scores.length;i++) {
			totalStudent += scores[i].length;
			for(int k=0; k< scores[i].length; k++) {
				totalSum += scores[i][k];
			}
		}
		double totalAvg = (double) totalSum / totalStudent;
		System.out.println("전체 학생의 평균 점수: "+totalAvg);
	}

}
