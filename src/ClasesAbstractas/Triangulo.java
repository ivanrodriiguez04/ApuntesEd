package ClasesAbstractas;

public class Triangulo extends Figura{
 
	private int base,altura;

	//Getters & Setters
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	//Creamos un constructor para el triangulo
	public Triangulo(String tipo,int base,int altura) {
		super(tipo);
		this.setBase(base);
		this.setAltura(altura);
	}
	
	 @Override 
	    public double area() {
	         return (double) this.base * this.altura / 2; 
	    }
}
