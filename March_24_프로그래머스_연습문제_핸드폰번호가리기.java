package CoddingTraining;
import java.util.Arrays;
import java.util.Scanner;
public class March_24_프로그래머스_연습문제_핸드폰번호가리기 {
	
	public static void main(String[] args) {
		/*
		 		프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
				전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
				
				제한 조건
				s는 길이 4 이상, 20이하인 문자열입니다.
				입출력 예
				phone_number	return
				"01033334444"	"*******4444"
				"027778888"	"*****8888"
		
		다른 문자로 치환하는 replace..
		tochararray
		
		1. 핸드폰 번호 입력받기
		2. 입력받은 문자열 배열로 바꾸기 -> 어떻게..??? (charToArray 사용)
		3.for문을 이용해서 뒷자리를 제외한 모든 자리마다 *로 치환해주기 -> 종료여부범위..를 어떻게 할 것인지..
		4.결과값을 answer에 저장
		*/
		
	Solution sol = new Solution();
		
	System.out.printf("핸드폰 번호 입력 (-제외)>>");
	Scanner sc = new Scanner(System.in);
	
	String phone_number = sc.next();
//	System.out.println("*처리된 전화번호 >> "+sol.solution(phone_number));
//	System.out.printf("핸드폰 번호 뒷자리 >> " + phone_number.substring(7));
	System.out.println("핸드폰 번호 가리기 >> "+sol.solution(phone_number));
		
	}
	static class Solution {
		public String solution(String phone_number) {
			String answer="";
			
			char[] Numarr = phone_number.toCharArray();
			
			String s_Num = "";
			
			for(int i = 0; i < Numarr.length-4; i++) {//2. *를 넣는 범위를 수정 Numarr.length >> Numarr.length-4
				Numarr[i] = '*';
//				if(i == Numarr.length-5) break;	//1. 번호가 4자리인 경우에 오류남.. *를 넣는 범위를 새로 지정해야할 듯
			}
			
			for(int i = 0; i< Numarr.length; i++) {
				answer += Numarr[i];
			}
			
			return answer;
			}
	}

}
// 문자열을 배열로 바꿔주는 toCharArray, 

