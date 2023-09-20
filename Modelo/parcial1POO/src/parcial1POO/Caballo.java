package parcial1POO;


	public class Caballo extends Fichas{
		public Caballo(int fila,int columna) {
	    super(fila,columna);
	}


		public int getMovimiento() {
			int f=0;
			if (((fila ==1)||(fila == 8))&&((columna ==1)||(columna == 8))) {
			f= 1;
			}else if (fila==2) {
				f=2;
			}else {
				f=0;
			}
			return f;
}
	}
