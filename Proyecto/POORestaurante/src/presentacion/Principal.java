package presentacion;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import logica.Restaurante;

@SuppressWarnings("unused")
public class Principal {
	

private Restaurante restaurante;
	
	public Principal() {
		this.restaurante = new Restaurante();
	}

	public static void main(String[] args) {
		Principal principal = new Principal();
		principal.iniciar();
	}	
	private void iniciar() {
		Scanner sc = new Scanner(System.in);
		int op;
		do {
			System.out.println("***HAMBURGUESERIA***\n");
			System.out.println("Digite una opcion:\n"
					+ "0. Salir del menu\n"
					+ "1. Ingresar Tipo Pedido\n"
					+ "2. Ingresar Cajero\n"
					+ "3. Imprimir Facturas\n"
			        + "4. Imprimir Pedidos\n"
			        + "5. leer archivos\n");
			op = sc.nextInt();
			if(op == 1) {
				System.out.println("Digite numero de especialidad: ");
				System.out.println("10 = combo");
				System.out.println("20 = personalizado\n");
				int numeroespecialidad = sc.nextInt();
				System.out.println("Digite numero de eleccion:\n ");
				String nombre = sc.next();				
				this.restaurante.ingresarTipoPedido(numeroespecialidad, nombre);
			}else if(op == 2) {
				System.out.println("Digite id: ");
				int id = sc.nextInt();
				System.out.println("Digite nombre: ");
				String nombre = sc.next();				
				System.out.println("Digite apellido: ");
				String apellido = sc.next();								
				this.restaurante.ingresarCajero(id, nombre, apellido);	
			}else if(op == 3) {
					this.restaurante.imprimirFacturas();
			}else if(op == 4) {
				this.restaurante.imprimirPedidos();
			}else if(op== 5) {
				this.restaurante.leerArchivos();
			}
			}while(op != 0);
			sc.close();

  }

}