package aula_001;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Cliente[] clientes = new Cliente[5];	
		
		clientes[0] = new Cliente("Andre","123","567");
		clientes[1] = new Cliente("Bruna","153","587");
		clientes[2] = new Cliente("rticado","623","560");
		clientes[3] = new Cliente("Cladia","823","067");
		clientes[4] = new Cliente("Joal","023","507");
		
		for(Cliente cliente:clientes){
			
			System.out.println("Nome: " + cliente.getNome());
			System.out.println("RG: " + cliente.getRg());
			System.out.println("CPF: " + cliente.getCpf());
			System.out.println("===========================");
			
		}
				

	}

}
