//Francisco San Diego de Sousa Castilho  - Mát: 397377.
//Classe Sistema - Questão 03 Lista 04.
//Última modificação 30/03/2018 - 15:42.

public class Sistema{

	Conta[] vetorContas; //Vetor de Contas.

	//Contrutor padrão de Sistema.
	public Sistema(int tamanho){
		vetorContas = new Conta[tamanho]; //Instância do vetor de Contas do tamanho específicado.
	}

	//Construtor vazio de Sistema.
	public Sistema(){
		this(4);  //Innicializa o vetor com tamanho 3.
	}

	//Cria uma Conta do tipo XTPO Basic na posição indicada.
	public void criarContaXPTOBasic(int pos){
		if (pos >= 0 && pos < vetorContas.length){
			vetorContas[pos] = new ContaBasic(pos);  //Cria uma Conta Basic com o Id = pos e Saldo = 0.
		}
	}

	//Cria uma Conta do tipo XPTO Plus na posição indicada.
	public void criarContaXPTOPlus(int pos){
		if (pos >= 0 && pos < vetorContas.length){
			vetorContas[pos] = new ContaPlus(pos);  //Cria uma Conta Plus com Id = pos e Saldo = 0.
		}
	}

	//Cria uma Conta do tipo XPTO Extreme na posição indicada.
	public void criarContaXPTOExtreme(int pos){
		if (pos >= 0 && pos < vetorContas.length){
			vetorContas[pos] = new ContaExtreme(pos);  //Cria uma Conta Extreme com Id = pos e Saldo = 0.
		}
	}

	//Credita na Conta indicada (pos) o valor informado (valor).
	public void creditar(int pos, double valor){
		if (pos >= 0 && pos < vetorContas.length){
			vetorContas[pos].creditar(valor);  //Chama o método creditar da conta em questão. 
		}
	}

	//Debita da Conta indicada (pos) o valor informado (valor).
	public void debitar(int pos, double valor){
		if (pos >= 0 && pos < vetorContas.length){
			vetorContas[pos].debitar(valor);
		}
	}

	//Consulta o saldo da Conta informada (pos);
	public double consultarSaldo(int pos){
		return vetorContas[pos].saldo();  //Retorna o valor do saldo da posição pos.
	}

	//Retorna o Tipo, Id e Saldo da Conta na posição informada.
	public String info(int pos){
		if (pos >= 0 && pos < vetorContas.length)
			return vetorContas[pos].toString();

		else
			return null;
	} 
}