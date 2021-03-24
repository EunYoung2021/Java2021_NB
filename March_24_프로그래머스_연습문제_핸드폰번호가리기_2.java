package CoddingTraining;

public class March_24_프로그래머스_연습문제_핸드폰번호가리기_2 {
	//클래스만!
	class Solution {
		  public String solution(String phone_number) {
		     char[] ch = phone_number.toCharArray();	//toChararray를 통해 입력받은 문자열을 배열로 바꿈.
		     for(int i = 0; i < ch.length - 4; i ++){
		         ch[i] = '*';
		     }
		     return String.valueOf(ch);
		     							//ValueOf를 통해 입력받은 인자 값을 지정된 Number 객체 형으로 변환하여 반환
		  }
		}
	
//====================================================================================================
	//뭘까 이 사람은....... 이게 코딩이구나
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
		        //substring으로 문자열 잘라쓰기.. 와우!

		        return answer;
		  }
		}
}
