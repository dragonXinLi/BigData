/*
在给变量进行赋值的时候，如果右侧的表达式当中全都是常量，没有任何变量，
那么编译器javac将会直接将若干个常量表达式计算得到结果。
short result = 5 + 8; //等号右边全部都是常量，没有任何变量参与运算
编译之后，得到的.class 字节码文件当中相当于[直接就是]：
short result = 13;
右侧的常量结果数值，没有超过左侧范围，所以正确。

这称为“编译器的常量优化”

但是注意：一旦表达式中有变量参与，那么就不能进行这种优化了。
*/
public class Demo02_13Notice{
    public static void main(String[] args) {
        short num1 = 10;

        short a = 5;
        short b = 8;

        // short + short --> int + int -> int
        //自我思考：报错的原因是a,b都是变量，编译器在编译期间无法控制 该变量值运算后的值 是否已经大于 short类型范围，所以干脆就报错
        // short result = a + b;错误: 不兼容的类型: 从int转换到short可能会有损失
        // System.out.println(result);
        
        //右侧不用变量，而是采用常量，而且只有两个常量，没有别人。可以在编译阶段知道运算结果值是否超过范围
        short result = 5 + 8 ;
        System.out.println(result);

        //同理，编译阶段无法判断运算值是否超出范围
        // short result2 = 5 + a + 8;错误: 不兼容的类型: 从int转换到short可能会有损失
        // System.out.println(result2);
    }
}