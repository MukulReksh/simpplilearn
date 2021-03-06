package day4assignment;

public class Problems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern2(5);
		
		//declare an array
		
		int[] arr = new int[5];
		/*Array is having fixed length
		 * Array index starts from zero
		 * Array is of homogenous type
		 * once we declare array length we cant change it programmatically
		 */
		
	}
	
	public static String oddOrEven(int num) {
		int ans = num & 1;
		
		return ans == 1 ? "odd" : "even";
	}
	
	public static int sumNatural(int n) {
		return n * (n + 1) / 2;
	}
	
	public static boolean primeNum(int num) {
		if(num <= 1) {
			return false;
		}
		for(int i = 2 ;i * i <= num ;i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int factors(int num) {
		int count = 0;
		for(int i = 1 ;i * i <= num ;i++) {
			if( i == num / i) {
				count++;
			}
			else if(num % i == 0) {
				count+=2;
			}
		}
		return count;
	}
	
	public static int factorial(int num) {
		int ans = 1;
		for(int i = 2;i<=num;i++) {
			ans *= i;
		}
		return ans;
	}
	
	public static void pattern1(int num) {
		String ans = "";
		
		for(int i = 1;i<=num;i++) {
			ans+="*";
			System.out.println(ans);
		}
	}
	
	public static void pattern2(int num ) {
		for(int i = 1;i<=num;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	
	

}
