/*
自动类型转换！=强制类型转换，后者是编译器自动补上强制类型(byte)...
对于byte/short/char 三种类型来说，如果右侧赋值的数值没有超过范围，
那么javac编译器会将自动隐含的为我们补上一个(byte)(short)(char)

1. 如果没哟超过左侧的范围，编译器补上强转
2. 如果右侧超过了左侧的范围，那么直接编译器报错
*/
public class Demo02_12Notice{
    public static void main(String[] args) {

        //右侧确实是一个Int数字，但是没有超过左侧的范围，就是挣钱的
        //int->byte，不是自动类型转换
        byte num1 = /*(byte)*/30 ;
        System.out.println(num1);

        // byte num2 = 128;错误: 不兼容的类型: 从int转换到byte可能会有损失
        // System.out.println(num2);

        //int-> char ,没有超过范围
        //编译器将会自动补上一个隐含的(char)
        char zifu = 65;
        System.out.println(zifu);
    }
}