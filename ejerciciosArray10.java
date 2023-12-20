
public class ejerciciosArray10 {

	public static void main(String[] args) {
		int tabla[]={3,6,2,77,3,10,23,14};
		int division7=0;
		
		for(int i=0; i<tabla.length;i++)
			if (tabla[i]%7==0)
				division7++;
			
				System.out.println("Divisibles con 7: "+division7);
	}

}
