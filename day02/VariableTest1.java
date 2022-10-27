/*
Java定义的数据类型
一、变量按照数据类型来分：
	基本数据类型：
		整型：byte\ short \ int \ long
		浮点型： float \ double 
		字符型： char
		布尔型： boolean

	引用数据类型：
		类(class)
		接口(interface)
		数组(array)

二、变量在类中声明的位置：
		成员变量 vs 局部变量
*/
class VariableTest1 {
	public static void main(String[] args) {
		//1.整型：byte(1字节=8bit) \ short(2字节) \ int (4字节)\ long(8字节)
		//①byte范围：-128~127
		byte b1 =12;
		byte b2 = -128;
		//byte b2 = -128;//编译不通过
		System.out.println(b1);
		System.out.println(b2);
		//②声明long型变量，必须以"l""L"来结尾
		//③通常定义整型变量时，使用int型。
		short s1 = 128;
		int i1 = 1234;
		long l1 = 313131313131L;
		System.out.println(l1);

		//2.浮点型：float(4字节) \ double(8字节)
		//①浮点型，表示带小数点的数值
		//②float表示数值范围比long还大

		double d1 = 123.3;
		float f1 =12.3f;
		//③定义float类型变量时，要以"f""F"来结尾。

		System.out.println(d1);
		System.out.println(f1);
		//④通常，定义浮点型变量时，使用double。

		//3.字符型：char(1个字符=2字节)
		//①定义char型变量，通常使用一对''，内部只能写一个字符。
		char c1='a';
		c1 = 'A';
		//c1 = 'AB';
		System.out.println(c1);

		char c2 = '1';
		char c3 = '中';
		char c4 = '々';
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

		//②表示方式：1.声明一个字符 2.转义字符
		char c5 = '\n';//换行符
		c5 = '\t';//制表符

		System.out.print("Hello" + c5);
		System.out.println("World");

		char c6 = '\u0043';//
		System.out.println(c6);

		//4.布尔型：boolean
		//①只能取两个值之一：true \ false
		boolean bb1 = true;
		System.out.println(bb1);
		boolean isMarried = true;
		if(isMarried){
			System.out.println("你就不能参加\"单身\"party了");

		}
		else{
			System.out.println("加油！")
		}



	}
}
