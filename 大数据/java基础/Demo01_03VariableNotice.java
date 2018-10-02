/*
使用变量的时候，有一些注意事项
1. 如果创建多个变量，那么变量之间的名称不可以重复
2. 对于float和Long类型来说，字母后缀F和L不要丢掉
3. 如果使用byte或者short类型的变量，那么右侧的数据值不能超过左侧类型的范围
4. 没有进行赋值的变量，不能直接使用；一定要赋值之后，才能使用
5. 变量使用不能超过作用域的范围[作用域：从定义变量的一行开始，一直到直接所属的大括号结束为止]
6. 可以通过一个语句来创建多个变量，但是一般情况下不推荐这么写
*/
public class Demo01_03VariableNotice
{
    public static void main(String[] args)
    {
        int num1 = 10;
        // int num1 = 20;错误: 已在方法 main(String[])中定义了变量 num1
        System.out.println(num1);

        // int num2 ;错误: 可能尚未初始化变量num2
        int num2 = 20;
        System.out.println(num2);

        
        // System.out.println(num3);错误: 找不到符号
        // int num3 = 30;

        {
            int num4 = 40;
            System.out.println(num4);
        }
        //已经超过了大括号的范围，超出了作用域，变量不能再使用了
        // System.out.println(num4);错误: 找不到符号

        //同时创建三个int变量，并且同时各自赋值
        int x = 100, y = 200, z = 300;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}