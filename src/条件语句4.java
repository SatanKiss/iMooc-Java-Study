public class 条件语句4 {
    public static void main(String[] args) {
        int score = 90;
        String sex = "女";
        if(score>80){
            if(sex=="女"){
                System.out.println("进入女子组决赛");
            }else{
                System.out.println("性别不符");
            }
        }else{
            System.out.println("预赛成绩不符");
        }
    }
}
