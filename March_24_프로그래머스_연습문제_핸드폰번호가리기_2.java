package CoddingTraining;

public class March_24_���α׷��ӽ�_��������_�ڵ�����ȣ������_2 {
	//Ŭ������!
	class Solution {
		  public String solution(String phone_number) {
		     char[] ch = phone_number.toCharArray();	//toChararray�� ���� �Է¹��� ���ڿ��� �迭�� �ٲ�.
		     for(int i = 0; i < ch.length - 4; i ++){
		         ch[i] = '*';
		     }
		     return String.valueOf(ch);
		     							//ValueOf�� ���� �Է¹��� ���� ���� ������ Number ��ü ������ ��ȯ�Ͽ� ��ȯ
		  }
		}
	
//====================================================================================================
	//���� �� �����....... �̰� �ڵ��̱���
	class Solution_2 {
		  public String solution(String phone_number) {
		    return phone_number.replaceAll(".(?=.{4})", "*");
		  }
		}
//====================================================================================================
	

	class Solution_3 {
		  public String solution(String phone_number) {
		      String answer = "";

		        for (int i = 0; i < phone_number.length() - 4; i++)
		            answer += "*";

		        answer += phone_number.substring(phone_number.length() - 4);
		        //substring���� ���ڿ� �߶󾲱�.. �Ϳ�!

		        return answer;
		  }
		}
}
