
public class ejerciciosArray6 {

public static void main(String[] args) {
		int tabla[] = new int[20]; 
		int fib=1;
		int fib1=1;
		int fib2=1;
		
		for(int i=2; i<tabla.length; i++){
		fib=fib1+fib2;
		fib2=fib1;
		fib1=fib;
		
		
		System.out.println(fib);
		
		}
	}

}