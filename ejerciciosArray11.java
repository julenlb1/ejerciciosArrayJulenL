public class ejerciciosArray11 {


	public static void main(String[] args) {

		int tabla[]={3,6,2,77,3,10,23,14};
		int contador;

		for(int i=0;i<tabla.length;i++) {
		contador=0;	

		for(int j=1;j<tabla.length;j++) {

			if (tabla[i]%j==0) {
				contador++;
			}
		}

		if(contador==2)	{

			System.out.print(tabla[i]+" ");

		}
	}
}
}