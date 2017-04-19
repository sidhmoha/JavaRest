
public class Factorial {

	static int factorial(int n){
		if (n==0)
		{
			return 1;
		}
		else 
		{
			return(n*factorial(n-1));
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fact=1;
		fact=factorial(4);
		System.out.println("Factorial of 4 is : "+ fact);
		
	}

}
