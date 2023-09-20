package Presentacion;
import java.util.Scanner;




import parcial1POO.Peon;
import parcial1POO.Caballo;
import parcial1POO.Alfil;
import parcial1POO.Torre;
import parcial1POO.Rey;
import parcial1POO.Reyna;


public class Principal {
	
		
		private static final String Fichas = null;

		public Principal() {
			Scanner sc = new Scanner(System.in);
			int op;
			do {
				System.out.println("Digite una ficha:\n"
						+ "0. Salir\n"
						+ "1. Peon\n"
						+ "2. Alfil\n"
						+ "3. Torre\n"
						+ "4. Rey\n"
						+ "5. Reyna\n"
						+ "6. Caballo\n");
				op = sc.nextInt();
				if(op == 1) {
					System.out.println("** POSICION FICHA**");
					System.out.println("Digite Fila: ");
					int fila = sc.nextInt();
					System.out.println("Digite Columna: ");
					String columna = sc.next();				
					this.Fichas.getMovimiento(fila, columna);

				}else if(op == 2) {
					System.out.println("** POSICION FICHA**");
					System.out.println("Digite Fila: ");
					int fila = sc.nextInt();
					System.out.println("Digite Columna: ");
					String columna = sc.next();				
					this.Fichas.getMovimiento(fila, columna);

				}else if(op == 3) {
					
					System.out.println("** POSICION FICHA**");
					System.out.println("Digite Fila: ");
					int fila = sc.nextInt();
					System.out.println("Digite Columna: ");
					String columna = sc.next();				
					this.Fichas.getMovimiento(fila, columna);
			    
				}else if(op == 4) {
				   
					System.out.println("** POSICION FICHA**");
				    System.out.println("Digite Fila: ");
				    int fila = sc.nextInt();
				    System.out.println("Digite Columna: ");
				    String columna = sc.next();				
				    this.Fichas.getMovimiento(fila, columna);
		        
				}else if(op == 5) {
					
		        	System.out.println("** POSICION FICHA**");
					System.out.println("Digite Fila: ");
					int fila = sc.nextInt();
					System.out.println("Digite Columna: ");
					String columna = sc.next();				
					this.Fichas.getMovimiento(fila, columna);
		       
		        }else if(op == 5) {
					    	
		        	System.out.println("** POSICION FICHA**");
					System.out.println("Digite Fila: ");
					int fila = sc.nextInt();
					System.out.println("Digite Columna: ");
					String columna = sc.next();				
					this.Fichas.getMovimiento(fila, columna);
                    
		        }else if(op == 6) {
			    	
		        	System.out.println("** POSICION FICHA**");
					System.out.println("Digite Fila: ");
					int fila = sc.nextInt();
					System.out.println("Digite Columna: ");
					String columna = sc.next();				
					this.Fichas.getMovimiento(fila,columna);
		        }	
		        }
}
}