package Aula202003;

import java.util.ArrayList;
import java.util.Scanner;

import aula_001.Cliente;

public class MenuPrincipal {

	public static void main(String[] args) {
		
		ArrayList<Cliente> clientes = new ArrayList<>();
		
		Scanner leitor = new Scanner(System.in);
		int opcao;
		
		do {
		
		System.out.println("***************");
		System.out.println("MENU PRINCIPAL");
		System.out.println("****************");
		System.out.println("1 - cadastro cliente");
		System.out.println("2 - mostra todos cliente");
		System.out.println("3 - mostrar cliente deejado");
		System.out.println("4 - alterar dados do cliente");
		System.out.println("5 - excluir cliente");
		System.out.println("6 - sair do sistema");
		
		opcao = leitor.nextInt();
		
		switch(opcao) {
			case 1:
				System.out.println("casdro cliente");
				
				System.out.println("Nome: ");
				String nome = leitor.next();
				
				System.out.println("RG: ");
				String rg = leitor.next();
				
				System.out.println("CPF: ");
				String cpf = leitor.next();
				
				Cliente  cliente = new Cliente(nome,rg,cpf);
				clientes.add(cliente);
				System.out.println("Cliente Cadastro com Sucesso");
				System.out.println();				
				break;
				
			case 2:
				System.out.println("mostra todos cliente");
				
				for(Cliente cliente1:clientes) {
					System.out.println("Nome: " + cliente1.getNome());
					System.out.println("RG: " + cliente1.getRg());
					System.out.println("CPF: " + cliente1.getCpf());
					System.out.println("============================");
				}
				
				break;
				
			case 3:
				System.out.println("digite o nome do cliente");
				String nomePesquisa = leitor.next();
				
				for(int i=0;i<clientes.size();i++) {
					
					String nomeDoVetor = clientes.get(i).getNome();
					if(nomePesquisa.equalsIgnoreCase(nomeDoVetor)) {
						System.out.println("Nome: " + clientes.get(i).getNome());
						System.out.println("RG: " + clientes.get(i).getRg());
						System.out.println("CPF: " + clientes.get(i).getCpf());
					}
					
				}
				
				break;
				
			case 4:
				System.out.println("digite o nome que deseja alterar");
				nomePesquisa = leitor.next();
				
				for(int i=0;i<clientes.size();i++) {
					
					String nomeDoVetor = clientes.get(i).getNome();
					if(nomePesquisa.equalsIgnoreCase(nomeDoVetor)) {
						System.out.println("Nome: " );
						clientes.get(i).setNome(leitor.next());
						
						System.out.println("RG: " );
						clientes.get(i).setRg(leitor.next());
						
						System.out.println("CPF: " );
						clientes.get(i).setCpf(leitor.next());
						
						System.out.println("Cliente alterado com sucesso");
					}
					
				}
				break;
				
			case 5:
				System.out.println("digite o nome que deseja excluir");
				nomePesquisa = leitor.next();
				
					for(int i=0;i<clientes.size();i++) {
					
					String nomeDoVetor = clientes.get(i).getNome();
					if(nomePesquisa.equalsIgnoreCase(nomeDoVetor)) {
						clientes.remove(i);
						
						System.out.println("cliente removido com sucesso");
						
					break;
					}
					
					}
				
				break;
			case 6:
				System.out.println("sair do sistema");
				break;
				
			default:
				System.out.println("opção invalida");
				break;
				
		}
		}while(opcao!=6);
		
		leitor.close();
	

	}

}
