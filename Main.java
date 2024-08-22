package entidade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Bem-Vindo ao Banco do Seduc 1");
		Scanner scn = new Scanner(System.in);
		List<Conta> lista = new ArrayList<>();
		System.out.println("Quantas contas você deseja cadastrar? ");
		int n = scn.nextInt();
		
		for(int i = 0 ; i < n ; i++) {
			System.out.println("Digite C para Conta Corrente ou P para poupança ");
			String x = scn.next();
			if(x.equals("C")) {
			
				
			System.out.println("Digite o nome do dono da conta " + i);
			String nome = scn.next();
			System.out.println("Digite o numero da conta: ");
			int numero = scn.nextInt();
			System.out.println("Digite o saldo: ");
			double saldo = scn.nextInt();
			System.out.println("Digite o limite: ");
			double limite = scn.nextInt();
			
			Conta conta = new Corrente(nome, numero, saldo, limite);
			
			lista.add(conta);
			}
			else { 
				System.out.println("Digite o nome do dono da conta " + i);
				String nome = scn.next();
				System.out.println("Digite o numero da conta: ");
				int numero = scn.nextInt();
				System.out.println("Digite o saldo: ");
				double saldo = scn.nextInt();
				
				lista.add(new Poupanca(nome, numero, saldo));
				
	  }
		for(Conta r : lista) {	
			System.out.println(r);
   }	
  }
 }
}