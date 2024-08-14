package test;

import java.util.Scanner;

public class Test02 {

public static void main(String[] args) {
        
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. 입력 2. 이름검색 3. 수정 4. 삭제 5. 전체 출력 6. 종료");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.println("이름:");
                    String name = scanner.nextLine();
                    System.out.println("국어 점수:");
                    int kor = scanner.nextInt();
                    System.out.println("영어 점수:");
                    int eng = scanner.nextInt();
                    System.out.println("수학 점수:");
                    int math = scanner.nextInt();
                    manager.addStudent(name, kor, eng, math);
                    break;
                case 2:
                    System.out.println("검색할 이름:");
                    name = scanner.nextLine();
                    manager.searchStudent(name);
                    break;
                case 3:
                    System.out.println("수정할 이름:");
                    name = scanner.nextLine();
                    System.out.println("새 국어 점수:");
                    kor = scanner.nextInt();
                    System.out.println("새 영어 점수:");
                    eng = scanner.nextInt();
                    System.out.println("새 수학 점수:");
                    math = scanner.nextInt();
                    manager.updateStudent(name, kor, eng, math);
                    break;
                case 4:
                    System.out.println("삭제할 이름:");
                    name = scanner.nextLine();
                    manager.deleteStudent(name);
                    break;
                case 5:
                    manager.printAllStudents();
                    break;
                case 6:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }
}

class StudentManager {
    
    private Student[] studentList = new Student[10];
    private int count = 0;
    
    public void addStudent(String name, int kor, int eng, int math) {
        if (count < studentList.length) {
            studentList[count++] = new Student(name, kor, eng, math);
            System.out.println("학생이 추가되었습니다.");
        } else {
            System.out.println("더 이상 학생을 추가할 수 없습니다.");
        }
    }
    
    public void searchStudent(String name) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (studentList[i].getName().equals(name)) {
                printStudent(studentList[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("검색된 내용이 없습니다.");
        }
    }
    
    public void updateStudent(String name, int kor, int eng, int math) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (studentList[i].getName().equals(name)) {
                studentList[i].setKorScore(kor);
                studentList[i].setEngScore(eng);
                studentList[i].setMathScore(math);
                System.out.println("학생 정보가 수정되었습니다.");
                found = true;
            }
        }
        if (!found) {
            System.out.println("검색된 내용이 없습니다.");
        }
    }
    
    public void deleteStudent(String name) { // 4. 삭제
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (studentList[i].getName().equals(name)) {
                studentList[i] = studentList[--count];
                studentList[count] = null;
                System.out.println("학생이 삭제되었습니다.");
                found = true;
            }
        }
        if (!found) {
            System.out.println("검색된 내용이 없습니다.");
        }
    }
    
    public void printAllStudents() {
        for (int i = 0; i < count; i++) {
            printStudent(studentList[i]);
        }
    }
    
    private void printStudent(Student student) {
        int total = student.getKorScore() + student.getEngScore() + student.getMathScore();
        double avg = total / 3.0;
        System.out.printf("%s %d %d %d %d %.2f\n", student.getName(), student.getKorScore(), student.getEngScore(), student.getMathScore(), total, avg);
    }
}

class Student {
    private String name;
    private int korScore;
    private int engScore;
    private int mathScore;
    
    public Student(String name, int korScore, int engScore, int mathScore) {
        this.name = name;
        this.korScore = korScore;
        this.engScore = engScore;
        this.mathScore = mathScore;
    }
    
    public String getName() {
        return name;
    }
    
    public int getKorScore() {
        return korScore;
    }
    
    public void setKorScore(int korScore) {
        this.korScore = korScore;
    }
    
    public int getEngScore() {
        return engScore;
    }
    
    public void setEngScore(int engScore) {
        this.engScore = engScore;
    }
    
    public int getMathScore() {
        return mathScore;
    }
    
    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }
}