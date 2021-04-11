package aula_001;

import java.util.ArrayList;

public class ListaDeCliente {

	public static void main(String[] args) {

		ArrayList<Cliente> clientes = new ArrayList<>();
		
		clientes.add(new Cliente("Maria","999","555"));
		
		for(Cliente cliente:clientes) {
			
			System.out.println("Nome: " + cliente.getNome());
			System.out.println("RG: " + cliente.getRg());
			System.out.println("CPF: " + cliente.getCpf());
			System.out.println("===========================");
		}
		
	}

}
