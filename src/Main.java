
public class Main {

	
	public static void main(String[] args) { 
//// 1. a. Utilizando la sentencia while, imprima todos los números entre 2 variables “a”
//		y “b”. Su código puede arrancar (por ejemplo):
//			int numeroInicio = 5;
//			int numeroFin = 14;
//		 Se deberían mostrar los números:5,6,7,8,9,10,11,12,13,14
		int numeroInicio = 5;
		int numeroFin = 14;
	
		while(numeroInicio <= numeroFin) {
			System.out.println(numeroInicio);
			numeroInicio = numeroInicio + 1;
		}
		
// 1. b. A lo anterior, solo muestre los números pares
		
		int numeroInicio2 = 5;
		int numeroFin2 = 14;
	
		while(numeroInicio2 <= numeroFin2) {
			if (numeroInicio2 % 2 == 0) {
				System.out.println(numeroInicio2);
			}
			numeroInicio2 = numeroInicio2 + 1;
			
		}
		
		
//1. c. A lo anterior, con una variable extra, elija si se deben mostrar los números pares o impares
		int numeroInicio3 = 5;
		int numeroFin3 = 14;
		boolean pares = false;
	
		while(numeroInicio3 <= numeroFin3) {
			
			if(pares == true) {
				if (numeroInicio3 % 2 == 0) {
					System.out.println(numeroInicio3);
				}
			} else {
				if (numeroInicio3 % 2 != 0) {
					System.out.println(numeroInicio3);
				}
			}
			
			numeroInicio3 = numeroInicio3 + 1;
		} 
		

//d. Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden
		
		int numeroInicio4 = 5;
		int numeroFin4 = 14;
	
		for(int i = numeroFin4; i >= numeroInicio4; i--) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		
		int sueldos = 0;
		// se considera nuevo menor a 5 años
		Boolean tresOMasVehiculosNuevos = false;
		int cantInmuebles = 0;
		Boolean poseeEmbarcacion = false;
		Boolean poseeAeronaveDeLujo = false;
		Boolean esTitularDeActivos = false;
		
		Boolean esPersonaIngresosAltos = false;
		
		
		if(sueldos >=  489083 || 
			tresOMasVehiculosNuevos ||
			cantInmuebles >= 3 || 
			poseeEmbarcacion || 
			poseeAeronaveDeLujo ||
			esTitularDeActivos) {
			
			esPersonaIngresosAltos = true;
			
			System.out.println("Es persona de ingresos altos.");
		} else {
			System.out.println("No es persona de ingresos altos.");
		}
	}
}
