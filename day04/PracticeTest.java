class PracticeTest{
	public static void main(String[] args){
		int a = 3;
		int x = 100;
		//switch��������:byte short char int ö������ String.
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
			System.out.println("����Ϊ����100����������������Ϊ" + sumI);
	}
}
/*
��������Ԫ��������Ԫ��������switch������switch���������if-else
*/