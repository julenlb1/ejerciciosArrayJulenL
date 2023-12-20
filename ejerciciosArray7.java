
public class ejerciciosArray7 {

	public static void main(String[] args) {
		int tabla[]={3,6,2,77,3,10,23,14};
		
		int cantidadPares=0;
		int cantidadImpares=0;
		
		for(int i=0; i<tabla.length;i++)
			if (tabla[i]%2==0)
				cantidadPares++;
			else cantidadImpares++;
		
			System.out.println("Pares: "+cantidadPares);
			System.out.println("Impares: "+cantidadImpares);
			
			if (cantidadPares>cantidadImpares)
				System.out.println("Hay mas pares");
			else
				
			if (cantidadPares<cantidadImpares)
				System.out.println("Hay mas impares");
			else
				System.out.println("Hay la misma cantidad");
		
	}

}
