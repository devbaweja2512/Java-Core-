package pack1;

public class DemoFactorial {

	public static void main(String[] args) {
		
		System.out.println(Functions.sum(5, 5));
		
		System.out.println(Functions.factorial(5));
		// static funtions
		// default access is friendly so it can be called here
		
		Functions F = new Functions();
		
		if(F.isprime(7))
		{
			System.out.println("Prime");
		}
		else System.out.println("Non Prime");
			
			
	}

}
