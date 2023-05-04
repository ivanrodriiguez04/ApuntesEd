package ClasesAbstractas;

public class Cuadrado extends Figura {

	private int base;

	// Getters & Setters
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}
	
	//Creamos un constructor para los cuadrados
	public Cuadrado(String tipo,int base) {
		super(tipo);
		this.setBase(base);
	}

	//Calculamos el area del cuadrado
	@Override
	public double area() {
		 return (double) this.base *this.base; 
		
	}


}
