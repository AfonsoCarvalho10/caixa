package caixa;

public class Application {

	public static void main(String[] args) {
		//TOPO
		for (int i=0; i< 9; i++) {
			System.out.print("0");
		}
		System.out.println("");
		
		
		//LATERAL
		for (int i=0; i< 9; i++) {
			System.out.print("0");
			System.out.print("       ");
			System.out.print("0");
			System.out.println("");
		}
		
		//fim
		
		for (int i=0; i< 9; i++) {
			System.out.print("0");
	}
	}
	private static void horizontal() {
		for (int i=0; i< 9; i++) {
			System.out.print("0");
		}
		System.out.print("");
	}
	
	private static void vertical() {
		for (int i=0; i< 9; i++) {
			System.out.print("0");
			System.out.print("       ");
			System.out.print("0");
			System.out.println("");
		}
		
	}
}
