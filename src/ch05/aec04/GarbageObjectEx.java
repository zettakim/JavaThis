package ch05.aec04;

public class GarbageObjectEx {
    public static void main(String[] args) {
        String hobby = "여행";
        hobby = null;

        String kind1 = "자동차";
        String kind2 = kind1;
        kind1 = null;
        System.out.println(kind2);
    }
}
