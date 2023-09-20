package parcial1POO;


	public class Rey extends Fichas{
		public Rey(int fila,int columna) {
	    super(fila,columna);
	}
        

		public int getMovimiento() {
			int f=0;
			if (((fila ==1)||(fila == 8))&&((columna ==1)||(columna == 8))) {
			f=1;
			}else if (((fila>1|| fila < 8 )&& (columna == 1 || columna == 8))||((columna>1|| columna < 8 )&& (fila == 1 || fila == 8))) {
				f=5;
			}else {
				f=8;
			}
			return f;
}
	}
