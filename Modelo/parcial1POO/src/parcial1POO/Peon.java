package parcial1POO;

public class Peon extends Fichas{
	public Peon(int fila,int columna) {
    super(fila,columna);
}


	public int getMovimiento() {
		int f=0;
		if ((fila > 2) && (fila > 8)){
		f= 1;
		}else if (fila==2) {
			f=2;
		}else {
			f=0;
		}
		return f;
	}
}