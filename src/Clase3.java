public class Clase3 {

	public static void main(String[] args) {
		 Codificador asd = new Codificador();
		 
		 String codificado = asd.codificar("zapallo salado", 1);
		 
		 String decodificado = asd.decodificar(codificado, 1);
		 
		 System.out.println("Codificado: " + codificado);
		 System.out.println("Decodificado: " + decodificado);
	}
 	
	public static void ejercicioA() {
		String oracion = "buenas tardes, esta soleado";
		int cantLetra = 0;
		char letraAContar = 'e';
		
		for(int i = 0; i < oracion.length(); i++) {
			if(oracion.charAt(i) == letraAContar) {
				cantLetra++;
			}
		}
		
		System.out.println("La cantidad de letra " + letraAContar + " es " + cantLetra);
	}
	
	public static void ejercicioB(int[] numeros, Boolean ascendente) { // Ordenamiento burbuja
		imprimirNumeros("Numeros: ", numeros);
		
		Boolean cambios = true;
		
		while(cambios) {
			cambios = false;
			
			for(int i = 0;  i < numeros.length - 1; i++) {
				
				if(ascendente) { // Si es ASCENDENTE
					if(numeros[i] > numeros[i + 1]) { // Si numero izquierda es MAYOR que derecha
						
						// Intercambian posiciones
						int aux = numeros[i];
						numeros[i] = numeros[i + 1];
						numeros[i + 1] = aux;
						
						cambios = true;	
						
					}
					
				} else { // Si es NO ASCENDENTE 
					if(numeros[i] < numeros[i + 1]) { // Si numero izquierda es MENOR que derecha
						
						// Intercambian posiciones
						int aux = numeros[i];
						numeros[i] = numeros[i + 1];
						numeros[i + 1] = aux;
						
						cambios = true;	
					}
				}
			}
		}
		
		imprimirNumeros("Numeros ordenados: ", numeros);
	}
	
	public static void imprimirNumeros(String texto, int[] numeros) {
		System.out.println(texto);
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]+ " ");
		}
		
		System.out.println("\n");
	}

	public static int ejercicioC(int[] numeros, int x) {
		int suma = 0;
				
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] > x) {
				suma += numeros[i];
			}
		}
		return suma;
	}
}
