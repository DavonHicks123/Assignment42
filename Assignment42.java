
public class Assignment42 {

	public static void main(String[] args) {
		multiply(5,7);
		System.out.println(multiply(5,7));
		System.out.println(multiply(5,6));
		System.out.println(multiply(5,5));
		System.out.println(multiply(5,4));
		System.out.println(multiply(5,3));
		System.out.println(multiply(5,2));
		System.out.println(multiply(5,1));
		System.out.println(multiply(5,0));
		
	}

	private static int multiply(int a, int b) {
		if(b>0) {
		  return a+multiply(a,b-1);
	}
		return 0;
		
	}
}
