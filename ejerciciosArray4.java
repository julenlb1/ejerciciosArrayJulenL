
public class ejerciciosArray4 {
	
	static String arrayToString(int[] array) {

    return java.util.Arrays.toString(array);
	}

	public static void main(String[] args) {

		 int tabla[] = {3, 6, 2, 77, 3, 10, 23, 14};

	        // Rotacion hacia la derecha

	        rotarDerecha(tabla);

	        System.out.println("Array después de rotar a la derecha: " + arrayToString(tabla));

	       	    }
	
	    static void rotarDerecha(int[] array) {

	    // guardar ultimo valor

	        int ultimoElemento = array[array.length - 1];

	        // Mover una posicion ahcia la derecha

	        System.arraycopy(array, 0, array, 1, array.length - 1);

	        array[0] = ultimoElemento;
	    }

}