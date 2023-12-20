
public class ejerciciosArray2 {

	public static void main(String[] args) {
		int tabla[]={3,6,2,77,3,10,23,14,25,2};
		int suma=0;
		int suma1=0;
		
		//suma de los primeros 5 numeros
		
		for(int i=0; i<5; i++)
			suma= suma + tabla[i];
		
		System.out.println("Suma de los primeros 5 numeros: "+suma);
		
		//suma de los ultimso cincos numeros
		for(int i=5; i<tabla.length; i++)
			suma1= suma1 + tabla[i];
		
		System.out.println("Suma de los ultimos 5 numeros: "+suma1);
		
		if (suma>suma1)
			System.out.println("La suma de los primeros 5 numeros son mayor");
		else 
			if(suma<suma1)
			System.out.println("La suma de los ultimos 5 numeros son mayor");
			else
			System.out.println("Son iguales");
	}

}
