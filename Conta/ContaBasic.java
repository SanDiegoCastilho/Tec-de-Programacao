//Francisco San Diego de Sousa Castilho  - Mát: 397377.
//Classe Conta Basic - Questão 01a Lista 04.
//Última modificação 30/03/2018 - 15:44.

public class ContaBasic extends Conta{
	
	//Contrutor padrão da Classe ContaBasic.
	public ContaBasic(int Id, double valor){
		setId(Id);
		creditar(valor);
	}

	//Contrutor de Saldo vazio.
	public ContaBasic(int Id){
		this(Id, 0);
	}
	
	//Armazena o valor de Id
	public void setId(int Id){
		this.Id = Id;
	}

	//Retorna o Id da Conta
	public int getId(){
		return Id;
	}

	//Responsável por adicionar credito a uma Conta.
	public void creditar(double valor){
		if (valor >= 0) { 	//Verifica a validade do valor-crédito.
			this.Saldo += valor;
		}
	}

	//Responsável por debitar um valor de uma Conta.
	public void debitar(double valor){
		if (valor <= saldo()) {  //Verifica se o valor do débito cabe no saldo.
			this.Saldo -= valor; 
		}
	}

	//Retorna o valor do Saldo da conta.
	public double saldo(){
		return Saldo;
	}

	//Imprime o Tipo, Id e o Saldo da conta.
	public String toString(){
		
		String Info = "Conta XPTO Basic." + 
					  " Id: " + getId() +
					  " Saldo: " + saldo() + "";

		return Info;
	}
}