package ex;

import java.util.Scanner;

public class StuManagerMain {
    public static void main(String[] args) {
        
        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);
        //1.입력 2.이름검색 3.수정 4.삭제 5.전체출력 6.탈출
        while (true) {
            System.out.println("1: 입력, 2: 이름검색, 3: 수정, 4: 삭제, 5: 전체출력, 6: 탈출");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                System.out.print("이름: ");
                String name = sc.nextLine();
                System.out.print("국어 점수: ");
                int kor = sc.nextInt();
                System.out.print("영어 점수: ");
                int eng = sc.nextInt();
                System.out.print("수학 점수: ");
                int math = sc.nextInt();
                sc.nextLine();

                manager.addStudent(name, kor, eng, math);

            } else if (ch == 2) {
                System.out.print("찾을 이름: ");
                String name = sc.nextLine();
                manager.searchStudent(name);

            } else if (ch == 3) {
                System.out.print("수정할 이름 입력: ");
                String name = sc.nextLine();
                System.out.print("새 국어 점수: ");
                int kor = sc.nextInt();
                System.out.print("새 영어 점수: ");
                int eng = sc.nextInt();
                System.out.print("새 수학 점수: ");
                int math = sc.nextInt();
                sc.nextLine();

                manager.editStudent(name, kor, eng, math);

            } else if (ch == 4) {
                System.out.print("삭제할 이름 입력: ");
                String name = sc.nextLine();
                manager.deleteStudent(name);

            } else if (ch == 5) {
                manager.displayAllStudents();

            } else if (ch == 6) {
                break;
            }
        }
    }
}

class StudentManager {
    private Student[] studentList = new Student[10];
    private int studentCount = 0;

    public void addStudent(String name, int kor, int eng, int math) {
        if (studentCount < studentList.length) {
            studentList[studentCount] = new Student(name, kor, eng, math);
            studentCount++;
        } else {
            System.out.println("리스트에 자리가 없습니다.");
        }
    }

    public void searchStudent(String name) {
        boolean found = false;
        for (int i = 0; i < studentCount; i++) {
            if (studentList[i].getName().equals(name)) {
                studentList[i].display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("이름을 찾을 수 없습니다 다시한번 입력해주세요 " + name);
        }
    }

    public void editStudent(String name, int kor, int eng, int math) {
        boolean found = false;
        for (int i = 0; i < studentCount; i++) {
            if (studentList[i].getName().equals(name)) {
                studentList[i].setKor(kor);
                studentList[i].setEng(eng);
                studentList[i].setMath(math);
                System.out.println("기록이 업데이트 되었습니다.");
                found = true;
            }
        }
        if (!found) {
            System.out.println("이름을 찾을 수 없습니다 " + name);
        }
    }

    public void deleteStudent(String name) {
        boolean found = false;
        for (int i = 0; i < studentCount; i++) {
            if (studentList[i].getName().equals(name)) {
                studentList[i] = studentList[studentCount - 1];
                studentList[studentCount - 1] = null;
                studentCount--;
                System.out.println("기록이 삭제되었습니다.");
                found = true;
            }
        }
        if (!found) {
            System.out.println("이름을 찾을 수 없습니다 " + name);
        }
    }

    public void displayAllStudents() {
        for (int i = 0; i < studentCount; i++) {
            studentList[i].display();
        }
    }
}

class Student {
    private String name;
    private int kor;
    private int eng;
    private int math;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getTotalScore() {
        return kor + eng + math;
    }

    public double getAverageScore() {
        return getTotalScore() / 3.0;
    }

    public void display() {
        System.out.printf("%s: 국어: %d, 영어: %d, 수학: %d, 총합: %d, 평균: %.2f%n",
                name, kor, eng, math, getTotalScore(), getAverageScore());
    }
}