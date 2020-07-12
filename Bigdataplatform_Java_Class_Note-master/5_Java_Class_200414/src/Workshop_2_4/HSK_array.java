package Workshop_2_4;
/*
 * Q. 5명의 학생이 제출한 HSK 답안을 채점하고 그 결과를 출력하는 프로그램을 작성하여라.
 * 5명의 학생이 제출한 답안과 정답은 제시되어 있다. 
 * 접근제한자를 이용하라. 
 */


// 학생의 점수를 계산하기 위한 스코어 클래
class Student_Score{
	final static String[] strarr_Corr_Answer = {"D", "B", "D", "C", "C", "D", "A", "E", "A", "D"};
	private String[] strarr_Stu_Answer = new String[10];
	private int iScore = 0;
	
	
	public Student_Score() {} // Default Constructor
	
	public void setAnswer(String[] scr) { // Answer Setter 
		strarr_Stu_Answer = scr;
	}
	
	public String[] getAnswer() { // Answer Getter
		return strarr_Stu_Answer;
	}

	public void fnCal_Score() { // Calculate score function
		this.iScore += 1;
	}
	
	public int getScore() { // Get calculated score
		return iScore;
	}
}


// Main Class
public class HSK_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 각 학생들에 대한 객체 배열 생성 	
		Student_Score[] score_arr = new Student_Score[5];
		score_arr[0] = new Student_Score();
		score_arr[1] = new Student_Score();
		score_arr[2] = new Student_Score();
		score_arr[3] = new Student_Score();
		score_arr[4] = new Student_Score();
		
		//학생들의 점수 입
		String[] student1 = {"A", "B", "A", "C", "C", "D", "E", "F", "A", "D"};
		score_arr[0].setAnswer(student1);

		String[] student2 = {"D", "B", "A", "B", "C", "A", "E", "F", "A", "D"};
		score_arr[1].setAnswer(student2);
		
		String[] student3 = {"E", "D", "D", "A", "C", "B", "E", "E", "A", "D"};
		score_arr[2].setAnswer(student3);
		
		String[] student4 = {"C", "B", "A", "E", "D", "D", "E", "F", "A", "D"};
		score_arr[3].setAnswer(student4);
		
		String[] student5 = {"A", "B", "D", "C", "C", "D", "E", "E", "A", "D"};
		score_arr[4].setAnswer(student5);
		
		
		
		// 학생의 답과 정답 비교 로직
		// 객체 배열 For문을 먼저 실행 / 학생 1 -> 5순서
		// 객체 내 정답이 입력되어있는 String 배열 동일여부 체크 / 1번 -> 10
		for(int inx = 0; inx<score_arr.length; inx++) {
			for(int inx2 = 0; inx2<10; inx2++) {
				if(Student_Score.strarr_Corr_Answer[inx2].equals(score_arr[inx].getAnswer()[inx2])) {
					score_arr[inx].fnCal_Score();
					}		
			}
		}
		
		// 결과 출력 
		for(int inx = 0; inx<5; inx++) {
			System.out.println("The Student[" + (inx+1) + "]'s Score is " + score_arr[inx].getScore());
		}
	}

}
