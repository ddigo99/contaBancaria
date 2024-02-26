package conta;

import java.util.Scanner;

import conta.model.Conta;
import conta.model.ContaCorrente;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Conta conta1 = new ContaCorrente(123, 12345, "Usuario", 10000f, 100);

		boolean iniciando = true;
		
		while (iniciando) {
			System.out.println("========== BANCO DO FUTURO ==========");
			System.out.println("Selecione uma das opções abaixo para continuar:");
			System.out.println("Digite 1 para visualizar informações sobre sua conta");
			System.out.println("Digite 2 para atualizar conta");
			System.out.println("Digite 3 para Sacar");
			System.out.println("Digite 4 para depositar");
			System.out.print("O que deseja fazer?  ");
			String userInput = leia.nextLine();
			
			System.out.println();
			
			switch (userInput) {
			case "1":
				conta1.visualizar();
				System.out.println("Aperte [ENTER] para continuar.");
				break;
				
			case "2":
				System.out.println("Digite o número da Agência: ");
				conta1.setAgencia(leia.nextInt());
				System.out.println("Digite o número da Conta: ");
				conta1.setConta(leia.nextInt());
				System.out.println("Digite o tipo da conta (1 - Corrente, 2 - Poupança)");
				conta1.setTipo(leia.nextInt());
				leia.nextLine();
				System.out.println("Qual o nome do Titular? ");
				conta1.setTitular(leia.nextLine());
				System.out.println("Digite o valor da Conta: ");
				conta1.setSaldo(leia.nextFloat());
				break;
				
			case "3":
				System.out.println("Digite um valor:");
				float valorSaque = leia.nextFloat();
				
				if (conta1.sacar(valorSaque)) {
					System.out.printf("Saque efetuado com sucesso. Novo saldo é de R$%.2f", conta1.getSaldo());
				} else {
					System.err.println("Você não tem saldo suficiente. Tente outro valor!");
				}
				break;
				
			case "4":
				System.out.println("Digite um valor");
				float valorDeposito = leia.nextFloat();
				
				conta1.depositar(valorDeposito);
				System.out.printf("O valor de R$%.2f foi adicionado à sua conta. Seu saldo agora é de R$%.2f", valorDeposito, conta1.getSaldo());
				System.out.println();
				break;
				
			default:
				System.err.println("Opção inválida!");
			}
			
			if (leia.hasNextLine()) leia.nextLine();
			
			System.out.println();
		}
		
	}

}
