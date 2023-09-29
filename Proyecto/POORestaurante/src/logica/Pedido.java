package logica;

public class Pedido {
	private int numerodeeleccion;
	private String nombre;
	private int precioVenta;
	public int getNumeroDeElccion() {
		return numerodeeleccion;
	}
	public void setNumeroDeEleccion(int numerodeeleccion) {
		this.numerodeeleccion = numerodeeleccion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getPrecioVenta() {
		return precioVenta;
	}
	
	public void setPrecioVenta(int precioVenta) {
		this.precioVenta = precioVenta;
	}
	
	public Pedido(int numerodeeleccion, String nombre, int precioVenta, float descuento) {
		this.numerodeeleccion = numerodeeleccion;
		this.nombre = nombre;
		this.precioVenta = precioVenta;

	}
}
