package parcial1POO;

	public class Alfil extends Fichas{
		public Alfil(int fila,int columna) {
	    super(fila,columna);
	}


		public int getMovimiento() {
			int f=0;
			if ((fila == 1|| fila == 8 )&&(columna == 1 || columna == 8)) {
			f= 7;
			}else if (((fila>1|| fila < 8 )&& (columna == 1 || columna == 8))||((columna>1|| columna < 8 )&& (fila == 1 || fila == 8))) {
				f=7;
			}else {
				f=0;
			}
			return f;
}
	}
