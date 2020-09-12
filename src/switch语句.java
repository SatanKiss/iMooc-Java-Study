public class switch语句 {
    public static void main(String[] args) {
        //char类型判断 前后一致
        char today='日';
        String _pre="早餐吃";
        switch(today){
            case '一':
            case '三':
            case '五':
                System.out.println(_pre+"包子");
                break;
            case '二':
            case '四':
            case '六':
                System.out.println(_pre+"油条");
                break;
            case '日':
                System.out.println(_pre+"主席套餐");
                break;
        }
    }
}
