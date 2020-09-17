package Java入门第一课;

public class 赋值运算 {
    public static void main(String[] args) {
        int one = 10;
        int two = 20;
        int three = 0;
        int first = three = one + two;
        int second = three += one;
        int third = three -= one;
        int fouth = three *= one;
        int fivth = three /= one;
        int sixth = three %= one;
        System.out.println("第一次计算：" + first);

        System.out.println("第二次计算：" + second);

        System.out.println("第三次计算：" + third);

        System.out.println("第四次计算：" + fouth);

        System.out.println("第五次计算：" + fivth);

        System.out.println("第六次计算：" + sixth);
    }
}
