package koreait.day08;

public class MyClass1 {
	private int age;     // �ڹ��� Ư�� : ���м�(��м�)�� Ŭ������ �ʵ尪�� �ٸ� Ŭ������ ���� �������� ���ϵ��� �Ѵ�
	String name;
	public double point;
	
	// private �ʵ�� setter,getter �� �־�� �ٸ�Ŭ�������� ���� �� �� �ִ�.
	void setAge(int age) {
		if(age > 1 && age <= 150)  // age�ʵ尪�� �˻�
		this.age = age;            // age�ʵ�� ���� Ŭ���������� ����
		else
			System.out.println("�߸��� ���Դϴ�.");
	}
	
	int getAge() {
		return age;
	}
}