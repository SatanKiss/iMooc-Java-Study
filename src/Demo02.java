import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        int classNum = 3 ;
        int stuNum=4;
        int sum = 0;
        double avg = 0;
        for (int i = 1;i<=classNum;i++){
            System.out.println("***请输入第"+ i + "个班级的成绩***");
            sum = 0;
            for (int j=1;j<=stuNum;j++){
                System.out.print("请输入第"+j+"个学员的成绩：");
                int score = new Scanner(System.in).nextInt();
                System.out.println("学员成绩："+score);
                sum = sum +score;
            }
            avg = sum / stuNum;
            System.out.println("第"+i+"个班级的学生的平均分："+avg);
        }
    }
}
