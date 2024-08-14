package ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library02 library = new Library02();
        
        while (true) { //1: 회원, 2: 비회원, 3: exit
            System.out.println("1: 회원, 2: 비회원, 3: 나가기 ");
            int ch = sc.nextInt();
            sc.nextLine();

            User02 user;
            if (ch == 1) {
                user = new Member02(sc); //회원 쪽으로 이동
            } else if (ch == 2) {
                user = new NonMember02(sc); //비회원 쪽으로 이동
            } else if (ch == 3) {
                System.out.println("이용해주셔서 감사합니다.");
                break;
            } else {
                System.out.println("번호를 잘못 입력하셨습니다 다시 선택해주세요");
                continue;
            }

            while (true) { //1: 대출, 2: 반납, 3: 정보조회, 4: 책 리스트 전체 출력, 5: 대출연장, 6: exit
                System.out.println("1: 대출, 2: 반납, 3: 정보 조회, 4: 책 조회, 5: 대출연장, 6: 뒤로가기");
                int ac = sc.nextInt();
                sc.nextLine();

                if (ac == 1) {
                    user.borrowBook(library);
                } else if (ac == 2) {
                    user.returnBook();
                } else if (ac == 3) {
                    user.viewInfo();
                } else if (ac == 4) {
                    library.printAllBooks();
                } else if (ac == 5) {
                    user.extendBorrowPeriod();
                } else if (ac == 6) {
                    break;
                } else {
                    System.out.println("번호를 잘못 입력하셨습니다 다시 선택해주세요");
                }
            }
        }
        sc.close();
    }
}

class Book02 {
    private String title; // 책 제목
    private String type;  //책 종류: 철학, 종교, 과학, 예술, 언어, 문학, 역사 등등

    public Book02(String title, String type) {
        this.title = title;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }
}

class Library02 {
    private List<Book02> books;

    public Library02() {//책 분류기호: 철학, 종교, 과학, 예술, 언어, 문학, 역사 등등
        books = new ArrayList<>(); //ArratList 리스트 사이즈 10 //14칸으로 늘릴까?
        books.add(new Book02("안다는 것의 예술","철학"));
        books.add(new Book02("행복의 조건","철학"));
        books.add(new Book02("바라는것이 없으면 괴로울 일이 없다","종교"));
        books.add(new Book02("위대한 예언자들","종교"));
        books.add(new Book02("1만 년의 폭발: 문명은 어떻게 인류 진화를 가속화시켰는가","과학"));
        books.add(new Book02("노화, 두려워할 필요는 없다","과학"));
        books.add(new Book02("방구석 미술관","예술"));
        books.add(new Book02("예술이란 무엇인가","예술"));
        books.add(new Book02("한국어 형태론 연구","언어"));
        books.add(new Book02("쏘왓? : 미국식 영어 공부의 진실","언어"));
        books.add(new Book02("위대한 개츠비","문학"));
        books.add(new Book02("파운데이션","문학"));
        books.add(new Book02("사피엔스","역사"));
        books.add(new Book02("총, 균, 쇠","역사"));
      
    }

    public List<Book02> getBooks() {
        return books;
    }

    public void printAllBooks() {
        for (Book02 book : books) {
            System.out.println("제목: " + book.getTitle() + "  분류: " + book.getType());
        }
    }
}

abstract class User02 {
    protected Scanner sc;
    protected String name;
    protected List<Book02> borrowedBooks;
    protected int borrowLimit;

    public User02(Scanner sc) {
        this.sc = sc;
        System.out.println("이름을 입력해주세요: ");
        this.name = sc.nextLine();
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Library02 library) {
        if (borrowedBooks.size() < borrowLimit) {
            System.out.println("대출할 책을 선택해주세요: ");
            library.printAllBooks();
            String bookTitle = sc.nextLine();
            for (Book02 book : library.getBooks()) {
                if (book.getTitle().equalsIgnoreCase(bookTitle)) {
                    borrowedBooks.add(book);
                    System.out.println("대출 완료: " + bookTitle);
                    return;
                }
            }
            System.out.println("책을 찾을 수 없습니다.");
        } else {
            System.out.println("대출 한도 초과");
        }
    }

    public void returnBook() {
        System.out.println("반납할 책을 입력해주세요: ");
        String bookTitle = sc.nextLine();
        for (Book02 book : borrowedBooks) {
            if (book.getTitle().equalsIgnoreCase(bookTitle)) {
                borrowedBooks.remove(book);
                System.out.println("반납 완료: " + bookTitle);
                return;
            }
        }
        System.out.println("대출 내역에 없는 책입니다.");
    }

    public void viewInfo() { //1. 대출 중인 책 리스트 나열
        System.out.println("이름: " + name);
        System.out.println("대출 중인 책들:");
        for (Book02 book : borrowedBooks) {
            System.out.println("제목: " + book.getTitle() + ", 분류: " + book.getType());
        }
    }

    public abstract void extendBorrowPeriod(); // 대출 연장
}

class Member02 extends User02 { //회원

    public Member02(Scanner sc) {
        super(sc);
        this.borrowLimit = 5; //최대 대출 권수 5권
    }

    @Override
    public void extendBorrowPeriod() { //회원이 대출 기간 연장할 떄
        System.out.println("대출 기간이 연장되었습니다.");
    }
}

class NonMember02 extends User02 { //비회원

    public NonMember02(Scanner sc) {
        super(sc);
        this.borrowLimit = 3; //최대 대출 권수 3권
    }

    @Override
    public void extendBorrowPeriod() { //비회원이 대출 기간 연장할 때
        System.out.println("비회원은 대출 기간을 연장할 수 없습니다.");
    }
}
