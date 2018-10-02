public class Demo03_06IfElseIfMax
{
    public static void main(String[] args) {
        int num = 100;
        if (num >= 90 && num <= 100 )
        {
            System.out.println("优秀");
        }else if (num >= 80 && num < 90)
        {
            System.out.println("中等");
        }else if (num >= 70 && num < 80)
        {
            System.out.println("良好");
        }else if(num >= 60 && num < 70)
        {
            System.out.println("及格");
        }else if (num >=0 && num < 60)
        {
            System.out.println("不及格");
        }else 
        {
            System.out.println("属于不合理");
        }

        int a = 20 , b = 30 ;
        int max  = a > b ? a : b ;
        System.out.println(max);
    }
}