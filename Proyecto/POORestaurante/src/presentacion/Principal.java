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
					+ "0. Salir\n"
					+ "1. Ingresar Tipo Pedido\n"
					+ "2. Ingresar Cajero\n"
					+ "3. Imprimir Facturas\n"
			        + "4. Imprimir Pedidos\n"
			        + "5. leer archivos\n");
			op = sc.nextInt();
			if(op == 4) {
				this.restaurante.imprimirPedidos();
			}else if(op== 5) {
				this.restaurante.leerArchivos();
			}
			}while(op != 0);
			sc.close();

  }

}