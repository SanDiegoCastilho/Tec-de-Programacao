//Francisco San Diego de Sousa Castilho  - Mát: 397377.
//Classe Conta Plus - Questão 01b Lista 04.
//Última modificação 30/03/2018 - 13:28.

public class ContaPlus extends Conta{

	//Contrutor padrão da Classe ContaExtreme.
	public ContaPlus(String Id, double valor){
		setId(Id);
		creditar(valor);
	}

	//Contrutor de Saldo vazio.
	public ContaPlus(String Id){
		this(Id, 0);
	}
	
	//Armazena o valor de Id
	public void setId(String Id){
		this.Id = Id;
	}

	//Retorna o Id da Conta
	public String getId(){
		return Id;
	}

	//Responsável por adicionar credito a uma Conta.
	public void creditar(double valor){
		if (valor >= 0) { 	//Verifica a validade do valor-crédito.
			this.Saldo += (valor + (valor * 0.005)); //Rendendo 0.5%.
		}
	}

	//Responsável por debitar um valor de uma Conta.
	public void debitar(double valor){
		if (valor <= saldo()) {  //Verifica se o valor do débito cabe no saldo.
			this.Saldo -= valor;
		}
	}

	//Retorna o saldo da Conta.
	public double saldo(){
		return Saldo;
	}

	//Retonar o Tipo, Id e Saldo da conta.
	public String toString(){
		
		String Info = "Conta XPTO Plus. " + 
					  "Id: " + getId() +
					  "Saldo: R$ " + saldo() + "";

		return Info;
	}
}