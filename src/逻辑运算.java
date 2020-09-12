public class 逻辑运算 {
    public static void main(String[] args) {
        boolean a = true; // a同意
        boolean b = false; // b反对
        boolean c = false; // c反对
        boolean d = true; // d同意
        System.out.println((a&&b)+"未通过");
        System.out.println((a||d)+"通过");
        System.out.println((!a)+"未通过");
        System.out.println((c^d)+"通过");
    }
    }

