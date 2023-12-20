
public class ejerciciosArray {

	public static void main(String[] args) {
		int tabla[]={3,6,2,77,3,10,23,14};
		int cantidadTres=0;
		for(int i=0; i<tabla.length;i++)
			if (tabla[i]==3)
				cantidadTres++;
				
				System.out.println("Hay: "+cantidadTres);
	}

}
