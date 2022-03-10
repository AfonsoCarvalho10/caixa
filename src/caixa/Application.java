package caixa;

public class Application {

	public static void main(String[] args) {
		int linhas = 9;
		int colunas = 9;
		
		//TOPO
		horizontal(colunas);
		
		
		//LATERAL
		vertical(linhas,colunas);
		
		//fim
		horizontal(colunas);
		
	}
	private static void horizontal(int colunas) {
		for (int i=0; i< 9; i++) {
			System.out.print("0");
		}
		System.out.print("");
	}
	
	private static void vertical(int linhas, int colunas) {
		for (int i=0; i< 9; i++) {
			System.out.print("0");
			for(int x=0; x<colunas -2; x++)
			{
				System.out.print(" ");
			}
			System.out.print("0");
			System.out.println("");
		}
		
	}

	}


