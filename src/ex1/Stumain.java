package ex1;

import java.util.List;

public class Stumain {

	public static void main(String[] args) {
		Stumain studentScoreService = new Stumain();
        List<StuSc> list = studentScoreService.getStudentScores();
        
        for (StuSc li : list) {
            System.out.println("이름: " + li.getName());
            System.out.println("수학점수: " + li.getKorScore());
            System.out.println("영어점수: " + li.getEngScore());
            System.out.println("수학점수: " + li.getMathScore());
            System.out.println();
        }
	}

	    public void StudentScoreService() {
	    	StudentScoreDAO studentScoreDAO = new StudentScoreDAO();
	    }
	    
	    public List<StuSc> getStudentScores() {
	        return StudentScoreDAO.getStudentScores();
	    	// 앤 뭐지?
	}
}
