//Francisco San Diego de Sousa Castilho  - Mát: 397377.
//Classe FunPrinc (main) - Questão 04 Lista 04.
//Última modificação 30/03/2018 - 15:45.

//Ao definirmos o comportammento dos métodos da ccclasse abstrata Conta estamos utilizando o polimorfismo do tipo INCLUSÃO.

public class FunPrinc{
	public static void main (String[] args){
			
		//Criando um sistema s.	
		Sistema s = new Sistema();

		//Criaçῶao das contas Basic, Plus e Extreme.
		s.criarContaXPTOBasic(1);
		s.criarContaXPTOPlus(2);
		s.criarContaXPTOExtreme(3);

		//Imprimindo o tipo das contas antes das operações.
		System.out.println("===== INFORMAÇÕES GERAIS (antes) =====");
		for (int i = 1; i <= 3; i++){
			System.out.println(s.info(i));
		}

		//Pula uma linha.
		System.out.println();

		//Chamando o método de Creditar paras as contas criadas.
		for(int i = 1; i <= 3; i++) s.creditar(i,1000);

		//Chamando o método de Debitar para as contas criadas.	
		for(int i = 1; i <= 3; i++) s.debitar(i,10);

		//Imprimindo o tipo das contas depois das informações.
		System.out.println("===== INFORMAÇÕES GERAIS (depois) =====");
		for (int i = 1; i <= 3; i++){
			System.out.println(s.info(i));
		}

		//Pula uma linha.
		System.out.println();

		//Todas as igualdades devem ser verdadeiras
		if (s.consultarSaldo(1) == 990){
			System.out.println("Saldo da Conta: R$ " + s.consultarSaldo(1));
		}

		if (s.consultarSaldo(2) == 995){
			System.out.println("Saldo da Conta: R$ " + s.consultarSaldo(2));
		}
		
		if (s.consultarSaldo(3) == 992.02){
			System.out.println("Saldo da Conta: R$ " + s.consultarSaldo(3));	
		}
	}
}