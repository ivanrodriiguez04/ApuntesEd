package Contador;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		boolean ok;
		 Scanner maximo = new Scanner(System.in); 
		 Contador c =new Contador(0,0);
		 System.out.println("Introduce un numero como maximo");
		 int max=maximo.nextInt();
		 do{
			 ok=true;
			
			
			
			System.out.println("-------------------------------");
			System.out.println("|  1-Incremetar el contador   |");
			System.out.println("|  2-Reniciar el contador     |");
			System.out.println("-------------------------------");
			int menu=maximo.nextInt();
			switch(menu)
			{
				case 1:
					c.incrementarContador();
					break;
				case 2:
					c.resetearContador();
					break;
					default:
						System.out.println("**ERROR** Introduce 1 o 2");
					
			}
			System.out.println("¿Quieres continuar? 1=Si 2=No");
			int continuar=maximo.nextInt();
			switch(continuar)
			{
				case 1:
					ok=true;
					break;
				case 2:
					ok=false;
					break;
					default:
						System.out.println("**ERROR** Introduce 1 o 2");
						ok=false;
					
			}
		 }while(ok);
	}

}
