package parcial1POO;


public abstract class Fichas {

			protected int fila;
			protected int columna;
			public Fichas(int fila, int columna) {
				super();
				this.fila = fila;
				this.columna = columna;
			}
			public int getFila() {
				return fila;
			}
			public void setFila(int fila) {
				this.fila = fila;
			}
			public int getColumna() {
				return columna;
			}
			public void setColumna(int columna) {
				this.columna = columna;
			}
			
			public abstract int getMovimiento();
			
	}

