public class 循环6 {
    public static void main(String[] args) {

        System.out.println("打印直角三角形");

        // 外层循环控制行数
        for (int i = 1;    i<=3;i++          ) {

            // 内层循环控制每行的*号数
            // 内层循环变量的最大值和外层循环变量的值相等
            for (int j = 1; j<=i;j++             ) {

                System.out.print("*");

            }

            // 每打印完一行后进行换行
            System.out.println();
        }
    }
}
