package Contador;

public class Contador {

	//Atributos
	private int contador,maximo;
	//Getters
	public int getContador() {
		return contador;
	}

	public int getMaximo() {
		return maximo;
	}
	
	//Construimos un constructor para el contador
	public Contador(int contador,int maximo) {
		this.contador=contador;
		this.maximo=maximo;
	}
	
	//Construimos un metodo para resetear el contador
	public void resetearContador() {
		this.contador=0;
	}

	//Construimos un metodo para incrementar el contador
	
	public void incrementarContador() {
		//si el contador es igual al maximo lo reseteamos
		if(this.contador==this.maximo) {
			resetearContador();
		}
		this.contador++;
		System.out.println("Contador= "+this.contador);
	}
}
