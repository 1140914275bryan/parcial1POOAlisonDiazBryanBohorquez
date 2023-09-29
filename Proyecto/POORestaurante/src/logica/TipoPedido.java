package logica;

import java.util.ArrayList;

public class TipoPedido {

	private int numeroespecialidad;
	private String nombre;
	private ArrayList<Pedido> pedidos;
	
	public int getId() {
		return numeroespecialidad;
	}
	public void setId(int numeroespecialidad) {
		this.numeroespecialidad = numeroespecialidad;
	}
	
	public int getNumeroespecialidad() {
		return numeroespecialidad;
	}
	public void setNumeroespecialidad(int numeroespecialidad) {
		this.numeroespecialidad = numeroespecialidad;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	public TipoPedido(int numeroespecialidad, String nombre) {
		this.numeroespecialidad = numeroespecialidad;
		this.nombre = nombre;
		this.pedidos = new ArrayList<Pedido>();
	}
	public void ingresarPedido(int numerodeeleccion, String nombre2, int precioVenta) {
		Pedido pedido = new Pedido(numerodeeleccion, nombre,precioVenta, precioVenta);
		this.pedidos.add(pedido);		
	}	
	
}
