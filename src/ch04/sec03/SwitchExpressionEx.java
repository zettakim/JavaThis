package ch04.sec03;

public class SwitchExpressionEx {
    public static void main(String[] args) {
        char grade = 'B
        ';

        switch (grade) {
            case 'a', 'A' -> {
                System.out.println("우수회원");
            }
            case 'b', 'B' -> {
                System.out.println("일반회원");
            }
            default -> {
                System.out.println("손님");
            }
        }
        switch (grade) {
            case 'a', 'A' -> System.out.println("우수회원");
            case 'b', 'B' -> System.out.println("일반회원");
            default -> System.out.println("손님");
        }

    }
}
