class VariableTest4 {
	public static void main(String[] args) {
		//1.编码情况：
		long l = 123123;
		System.out.println(l);
		//编译失败：过大的整数
		//long l1 = 213123213213213123123123;
		long l1 = 213123213213213123123123L;

		//**************************************
		//编译失败
		//float f1 = 12.3;

		//2.编码情况2：
		//整型常量，默认类型为int型
		//浮点型常量，默认类型为double型
		byte b = 12;
		//byte b1 = b +1;//编译失败
		int b1 = b + 1;
	}
	
}
