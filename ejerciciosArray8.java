
public class ejerciciosArray8 {

	public static void main(String[] args) {
		int tabla[]={3,6,2,77,3,10,23,14};

		for (int i=0; i<tabla.length;i++)
			System.out.print(tabla[i]+ ", ");
		
		System.out.println(".");
		
		for (int i=tabla.length -1; i>=0; i--)
			System.out.print(tabla[i]+ ", ");
	}

}
