package Java入门第一课;

public class 运算优先级 {
    public static void main(String[] args) {
        int m = 5;
        int n = 7;
        int x = (m * 8 / (n + 2)) % m;
        System.out.println("m:" + m);
        System.out.println("n:" + n);
        System.out.println("x:" + x);
        System.out.println((11 + 3 * 8) / 4 % 3);
    }
}
