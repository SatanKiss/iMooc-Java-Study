public class 循环3 {
    public static void main(String[] args) {
        int sum = 0; // 保存不能被3整除的数之和

        // 循环变量 i 初始值为 1 ,每执行一次对变量加 1，只要小于等于 100 就重复执行循环
        for (int i = 1;i<=100              ;i++         ) {

            // 变量 i 与 3 进行求模（取余），如果不等于 0 ，则表示不能被 3 整除
            if (i % 3 != 0) {
                sum = sum + i; // 累加求和
            }
        }

        System.out.println("1到100之间不能被3整除的数之和为：" + sum);
    }
}
