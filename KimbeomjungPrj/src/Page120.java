
public class Page120 {

	public static void main(String[] args) {
	String str1 = "IT CookBook 입니다";
	String str2 = "10";
	String str3 = "20";
	
	str1 = "JAVA 입니다. ";
	
	System.out.println("str1 : " + str1);
	System.out.println("합계의 결과는 : " + str2 + str3);

	int num1 = Integer.parseInt(str2); // 숫자로 변수 변환
	int num2 = Integer.parseInt(str3);
	System.out.println("더하기 결과 : " + (num1 + num2));
	}

}
