package ch03.sec05;

public class InfinityNanCheck {
    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;
        double z = x / y;
        System.out.println(z + 2);
    }
}
