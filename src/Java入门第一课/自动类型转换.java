package Java入门第一课;

public class 自动类型转换 {
    public static void main(String[] args) {
        //类型转换
        //double类型兼容int类型 可以大包小，不能小包大 如double可以放int 因为double8字节，int4字节
        //char类型与int类型不兼容
        double avg1 = 78.5;
        int rise = 5;
        double avg2 = avg1 + rise;
        System.out.println("考试平均分：" + avg1);
        System.out.println("调整后的平均分：" + avg2);
    }
}
