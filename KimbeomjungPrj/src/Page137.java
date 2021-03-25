
public class Page137 {

	public static void main(String[] args) {
		int a;
		a = 10;

		a++;
		System.out.println("a : " + a);
		System.out.println("a++ ==> " + a++); // 후위 연산자는 나중에 연산 

		System.out.println("a : " + a);
		System.out.println("a++ : " + ++a);
		a--;
		System.out.println("a-- ==> " + a);

		a += 5;
		System.out.println("a +=5 ==> " + a);

		a -= 5;
		System.out.println("a-=5 ==> " + a);

		a *= 5;
		System.out.println("a*=5 ==> " + a);

		a /= 5;
		System.out.println("a/=5 ==> " + a);

		a %= 5;
		System.out.println("a%=5 ==> " + a);
	
		
	}

}
