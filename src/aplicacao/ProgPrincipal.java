package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import model.entidade.ContaCorrente;
import model.exceptions.ExcecaoDeDominio;

public class ProgPrincipal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// LEITURA DOS DADOS DA CONTA
		
		System.out.println("Entre com os dados da Conta:");
		System.out.print("Numero da Conta: ");
		int numConta = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Titular da Conta: ");
		String titularConta = sc.nextLine();
		
		System.out.print("Saldo inicial: ");
		double saldo  = sc.nextDouble();
		
		System.out.print("Limite de saque: ");
		double limiteSaque = sc.nextDouble();
		
		// INSTANCIAR A CLASSE CONTA CORRENTE
		
		ContaCorrente cc = new ContaCorrente(numConta, titularConta, saldo, limiteSaque);
		
		// SAQUE
		
		System.out.println();
		System.out.print("SAQUE: ");
		double valor = sc.nextDouble();
		
		try {
			
			cc.saque(valor);
			System.out.println("SALDO: " + String.format("%.2f", cc.getSaldo()));		
		
		}
		catch(ExcecaoDeDominio e) {
			
			System.out.println("Erro: " + e.getMessage());
		}
		
		sc.close();

	}

}
