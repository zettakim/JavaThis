package ch04.sec03;

public class SwitchValueEx {
    public static void main(String[] args) {
        String grade = "B";

        int score1 = 0;
        switch (grade) { // Java 11
            case "A":
                score1 = 100;
                break;
            case "B":
                int result = 100 - 20;
                score1 = result;
                break;
            default:
                score1 = 60;
        }
        System.out.println(score1);

        int score2 = switch (grade) { // Java12
            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;
                yield result;
            }
            default -> 60;
        };
        System.out.println(score2);
    }
}
