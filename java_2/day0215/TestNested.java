package day0215;

/**
 *	��øŬ���� 
 * @author SIST
 */
public class TestNested {
	int insI;
	static int staI;
	
	public TestNested() {
		System.out.println("�ٱ�Ŭ������ ������");
	}
	
	public void outInsMethod() {
		System.out.println("�ٱ�Ŭ������ instance method");
	}
	
	public static void outStaMethod() {
		System.out.println("�ٱ�Ŭ������ static method");
	}
	
	/////////////////////////////////////////nested class ����///////////////////////////////////////////////////
	static class Nested{
		//class�� ���� �����ڸ� static���� ����ϳ� Ŭ���������� static���� ��������� �ʴ´�.
		static int inI;
		//�����ڴ� ���� �� ������ ��üȭ�Ͽ� ����� �������� ����� Ŭ������ �ƴϹǷ� �����ڸ� 
		//������ �ʴ´�.
			
		//instance method�� ���� �� ������ ��üȭ�Ͽ� ����ؾ��ϹǷ� ������ �ʴ´�.
		
		public static void inMethod() {
			System.out.println("���� Ŭ������ method : "+inI);
			//����Ŭ������ method������ �ٱ� Ŭ������ �ڿ��� ���� ����� �� �ִ�.
//			insI = 100; //�ν��Ͻ������� ������ ����� �� ����.
			staI = 100;
			System.out.println("�ٱ� Ŭ������ ���� : "+ staI);
			
//   		outInsMethod(); //�ν��Ͻ������� method�� ���Ұ�
			outStaMethod();
			
		}
	}
	
	/////////////////////////////////////////nested class ����///////////////////////////////////////////////////
	public static void main(String[] args) {
		//Ŭ���������ȿ� static Ŭ������ ������ �����Ͽ� ����� ����ϴ� ���̹Ƿ�, ��üȭ ���� 
		//Ŭ������.method������ ȣ���Ͽ� ���
		Nested.inMethod();
	}

}