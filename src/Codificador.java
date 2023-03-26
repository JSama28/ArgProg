
public class Codificador {
	
	
	public String codificar(String texto, int desplazamiento) {
		String abecedario = " abcdefghijklmnñopqrstuvwxyz";
		char[] nuevoTexto = texto.toCharArray();
		
		for(int i = 0; i < nuevoTexto.length; i++) {
			Character letra = nuevoTexto[i];
			int indice = abecedario.indexOf(letra) + desplazamiento;
			
			Character nuevaLetra;
			
			if(indice > abecedario.length() - 1) {
				nuevaLetra = abecedario.charAt(0);
			} else {
				nuevaLetra = abecedario.charAt(indice);
			}
						
			nuevoTexto[i] = nuevaLetra;
		}
		
		return String.valueOf(nuevoTexto);
	}
	
	public String decodificar(String texto, int desplazamiento) {
		String abecedario = " abcdefghijklmnñopqrstuvwxyz";
		char[] nuevoTexto = texto.toCharArray();
		
		for(int i = 0; i < nuevoTexto.length; i++) {
			Character letra = nuevoTexto[i];
			int indice = abecedario.indexOf(letra) - desplazamiento;
			
			Character nuevaLetra;
			
			if(indice < 0) {
				nuevaLetra = abecedario.charAt(abecedario.length() - 1);
			} else {
				nuevaLetra = abecedario.charAt(indice);
			}
						
			nuevoTexto[i] = nuevaLetra;
		}
		
		return String.valueOf(nuevoTexto);
	}
	
}
