package day0118;
/**
���� ����ȯ<br>
���� �ش� �࿡���� �Ͻ������� �ٸ� ������ �����ؾ��� �� ���<br>
(��ȯ�ҵ�������)��
*/
class Casting {
	public static void main(String[] args) {

		char c='A';
		int unicode=(int)c;
		System.out.println(c+"�� Unicode�� "+unicode);

		float f = (float)2021.01;//�Ǽ� literal�� �״�� �ΰ� �Ҵ��� �� ���� float���� ����
		System.out.println(f);

		int i = (int)f;//�Ǽ������� ���������� �Ҵ�� �� ����. (int)�� �־������
		System.out.println("��������ȯ �� �� : "+i+", ���� �� : "+f);

		double d =1.11111111111111;
		f=(float)d; //���ս�
		System.out.println(f);

		///casting error ����///

		/*
		String s = "2021" ;
		int temp=(int)s; //�ּҸ� ������ ������ �� ����(���������� �⺻������ ���� �� �Ѵ�)
		System.out.println(s);
		*/
		 
		/*
		boolean b=false;
		int tenp =b; //boolean�� �ٸ� ������ ������ �� ����.
		System.out.println(b);
		*/

		byte num1=10;
		byte num2=20;
		byte result=(byte) (num1+num2);

		System.out.println(num1+"+"+num2+"="+result);

	}//main
}//class