public class 循环5 {
    public static void main(String[] args) {
        int sum = 0; //保存累加值
        for (int i = 1;i<=10;i++){
            //如果i为奇数，结束本次循环，进行下一次循环
            if (i%2==1){
                continue;
            }
            sum = sum+i;
        }
        System.out.println("1到10之间所有偶数的和为："+sum);
    }
}
