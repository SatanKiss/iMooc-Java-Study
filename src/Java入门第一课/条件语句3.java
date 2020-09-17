package Java入门第一课;

public class 条件语句3 {
    public static void main(String[] args) {
        int age = 25;
        if (age < 18) {
            System.out.println("童年");
        } else if (age >= 18 && age < 40) {
            System.out.println("少年");
        } else if (age >= 40 && age < 60) {
            System.out.println("中年");
        } else {
            System.out.println("老年");
        }
    }
}
