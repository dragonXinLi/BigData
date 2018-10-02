/*
创建一个变量并显示的格式：
数据类型 变量名称;//创建了一个变量
变量名称 = 数据值;//赋值，将右边的数据值，赋值给左边的变量

一步到位的格式：
数据类型 变量名称 = 数据值;//在创建一个变量的同时，立刻放入指定的数据值
*/
public class Demo01_02Variable{
    public static void main(String[] args) {
        int num1;
        num1 = 10;
        System.out.println(num1);
        num1 = 20;
        System.out.println(num1);

        int num2 = 25;
        System.out.println(num2);
        num2 = 35;
        System.out.println(num2);

        byte num3 = 30;//注意：右侧数值的范围不能超过左侧数据类型的取值范围
        System.out.println(num3);
        // byte num4 = 400;右侧超出了byte得数据范围，报错 -126~127(2^8)
        // System.out.println(num4);

        short num5 = 50;
        System.out.println(num5);
        // short num6 = 3000000000;错误: 过大的整数: 3000000000
        // short num6 = 3000000000L;错误: 不兼容的类型: 从long转换到short可能会有损失
        long num6 = 3000000000L;//3000...数值默认是int类型，如果超过了，需在后面加L
        System.out.println(num6);

        //错误: 不兼容的类型: 从double转换到float可能会有损失
        // float num7 = 300000000000000000000000000000000000000000000000000000000000.4444444444444444444444444444444444444444444444444;
        // float num7 = 3.14;//误: 不兼容的类型: 从double转换到float可能会有损失。默认是double类型
        float num7 = 3.14F;
        System.out.println(num7);

        double num8 = 3.14;
        System.out.println(num8);

        char zifu1 = 'A';
        System.out.println(zifu1);

        zifu1 = '中';
        System.out.println(zifu1);

        boolean var1 = true;
        System.out.println(var1);

        var1 = false;
        System.out.println(var1);

        //将一个变量的数据内容，赋值给另一个变量
        //右侧的变量名称var1已经存在，里面装的是false布尔值
        //将右侧变量里面的值false,向左交给var2变量进行存储
        boolean var2 = var1;
        System.out.println(var2);
    }
}