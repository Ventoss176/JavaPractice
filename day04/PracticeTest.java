class PracticeTest{
	public static void main(String[] args){
		int a = 3;
		int x = 100;
		//switch数据类型:byte short char int 枚举类型 String.
		switch (a){
		case 1:
			x += 5;
			break;
		case 2:
			x += 10;
			break;
		case 3:
			x += 16;
			break;
		default:
			x += 34;
		}
		int sumI = 0;
		for(int i = 1;i <= 100;i = i + 2){
			sumI += i;
			System.out.print(i + " ");
		}
			System.out.println("以上为所以100内奇数，则奇数和为" + sumI);
	}
}
/*
可以用三元优先用三元，可以用switch优先用switch，最后考虑用if-else
*/