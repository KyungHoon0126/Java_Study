
//3개의 수 최대 공약수를 찾는 프로그램 작성

public class User_Defined_Function {

	// 사용자 정의 함수 (메소드 = 함수, 같은 의미)
	// 함수는 반환형, 함수명, 매개변수로 구성이 된다.

	public static int function(int a, int b, int c) {
		
		int min;
		
		if (a > b) 
		{
			if (b > c) 
			{
				min = c;
			} 
			else 
			{
				min = b;
			}
		} 
		else 
		{
			if (a > c) 
			{
				min = c;
			} 
			else 
			{
				min = a;
			}
		}
		
		for(int i = min; i > 0; i--)
		{
			if(a % i == 0 && b % i == 0 && c % i == 0)
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		System.out.println("(400, 300, 750)의 최대공약수 : " + function(400, 300, 750));
	}

}
