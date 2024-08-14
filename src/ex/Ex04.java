package ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Student> students = new HashSet<>();

        while (true) {
            System.out.println("1: 추가, 2: 검색, 3: 수정, 4: 삭제, 5: 전체출력, 6: 탈출");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                System.out.print("이름: ");
                String name = sc.nextLine();
                System.out.print("국어 점수: ");
                int koreanScore = sc.nextInt();
                System.out.print("영어 점수: ");
                int englishScore = sc.nextInt();
                System.out.print("수학 점수: ");
                int mathScore = sc.nextInt();
                sc.nextLine();

                students.add(new Student(name, koreanScore, englishScore, mathScore));
            } else if (ch == 2) {
                System.out.print("검색할 학생 이름: ");
                String searchName = sc.nextLine();
                Student student = findStudentByName(students, searchName);
                if (student != null) {
                    int total = student.getKor() + student.getEng() + student.getMath();
                    double avg = total / 3.0;
                    System.out.println("이름: " + student.getName() + ", 국어: " + student.getKor() + ", 영어: " + student.getEng() + ", 수학: " + student.getMath() + ", 총합: " + total + ", 평균: " + avg);
                } else {
                    System.out.println("학생을 찾을 수 없습니다.");
                }
            } else if (ch == 3) {
                System.out.print("수정할 학생 이름: ");
                String searchName = sc.nextLine();
                Student student = findStudentByName(students, searchName);
                if (student != null) {
                    System.out.print("새 국어 점수: ");
                    student.setKor(sc.nextInt());
                    System.out.print("새 영어 점수: ");
                    student.setEng(sc.nextInt());
                    System.out.print("새 수학 점수: ");
                    student.setMath(sc.nextInt());
                    sc.nextLine(); // consume newline
                    System.out.println("수정 완료.");
                } else {
                    System.out.println("학생을 찾을 수 없습니다.");
                }
            } else if (ch == 4) {
                System.out.print("삭제할 학생 이름: ");
                String searchName = sc.nextLine();
                Student student = findStudentByName(students, searchName);
                if (student != null) {
                    students.remove(student);
                    System.out.println("삭제 완료.");
                } else {
                    System.out.println("학생을 찾을 수 없습니다.");
                }
            } else if (ch == 5) {
                for (Student student : students) {
                    int total = student.getKor() + student.getEng() + student.getMath();
                    double avg = total / 3.0;
                    System.out.println("이름: " + student.getName() + ", 국어: " + student.getKor() + ", 영어: " + student.getEng() + ", 수학: " + student.getMath() + ", 총합: " + total + ", 평균: " + avg);
                }
            } else if (ch == 6) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }
    }

    private static Student findStudentByName(Set<Student> students, String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }
}

class StuB {
    private String name;
    private int kor;
    private int eng;
    private int math;

    public void Student(String name, int kor, int eng, int math) {
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

    @Override
    public String toString() {
        return "이름: " + name + ", 국어: " + kor + ", 영어: " + eng + ", 수학: " + math;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return name.equals(student.getName());
    }
}
