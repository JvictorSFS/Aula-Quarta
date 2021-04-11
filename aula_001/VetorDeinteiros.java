package aula_001;

public class VetorDeinteiros {

	public static void main(String[] args) {
		
		int[] valores = new int[5];  
		valores[0] = 100;
		valores[1] = 80;
		valores[2] = 45;
		valores[3] = 10;
		valores[4] = 1;
		
		for(int i=0; i<valores.length; i++) {
		System.out.println("valores["+i+"]: " + valores[i]);
	}
		
		String[] nome = {"andre", "francisco", "juliana", "flavia"};
		
		for(String nome1:nome) {		
		System.out.println(nome1);
		}
	}

}
