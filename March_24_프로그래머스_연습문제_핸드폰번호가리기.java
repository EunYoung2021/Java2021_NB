package CoddingTraining;
import java.util.Arrays;
import java.util.Scanner;
public class March_24_���α׷��ӽ�_��������_�ڵ�����ȣ������ {
	
	public static void main(String[] args) {
		/*
		 		���α׷��ӽ� ������� �������� ��ȣ�� ���� �������� ���� �� ������ ��ȭ��ȣ�� �Ϻθ� �����ϴ�.
				��ȭ��ȣ�� ���ڿ� phone_number�� �־����� ��, ��ȭ��ȣ�� �� 4�ڸ��� ������ ������ ���ڸ� ���� *���� ���� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
				
				���� ����
				s�� ���� 4 �̻�, 20������ ���ڿ��Դϴ�.
				����� ��
				phone_number	return
				"01033334444"	"*******4444"
				"027778888"	"*****8888"
		
		�ٸ� ���ڷ� ġȯ�ϴ� replace..
		tochararray
		
		1. �ڵ��� ��ȣ �Է¹ޱ�
		2. �Է¹��� ���ڿ� �迭�� �ٲٱ� -> ���..??? (charToArray ���)
		3.for���� �̿��ؼ� ���ڸ��� ������ ��� �ڸ����� *�� ġȯ���ֱ� -> ���Ῡ�ι���..�� ��� �� ������..
		4.������� answer�� ����
		*/
		
	Solution sol = new Solution();
		
	System.out.printf("�ڵ��� ��ȣ �Է� (-����)>>");
	Scanner sc = new Scanner(System.in);
	
	String phone_number = sc.next();
//	System.out.println("*ó���� ��ȭ��ȣ >> "+sol.solution(phone_number));
//	System.out.printf("�ڵ��� ��ȣ ���ڸ� >> " + phone_number.substring(7));
	System.out.println("�ڵ��� ��ȣ ������ >> "+sol.solution(phone_number));
		
	}
	static class Solution {
		public String solution(String phone_number) {
			String answer="";
			
			char[] Numarr = phone_number.toCharArray();
			
			String s_Num = "";
			
			for(int i = 0; i < Numarr.length-4; i++) {//2. *�� �ִ� ������ ���� Numarr.length >> Numarr.length-4
				Numarr[i] = '*';
//				if(i == Numarr.length-5) break;	//1. ��ȣ�� 4�ڸ��� ��쿡 ������.. *�� �ִ� ������ ���� �����ؾ��� ��
			}
			
			for(int i = 0; i< Numarr.length; i++) {
				answer += Numarr[i];
			}
			
			return answer;
			}
	}

}
// ���ڿ��� �迭�� �ٲ��ִ� toCharArray, 

