//Francisco San Diego de Sousa Castilho  - Mát: 397377.
//Classe Conta Extreme - Questão 01c Lista 04.
//Última modificação 30/03/2018 - 13:08.

public class ContaExtreme extends Conta{

	//Contrutor padrão da Classe ContaExtreme.
	public ContaExtreme(int Id, double valor){
		setId(Id);
		creditar(valor);
	}

	//Contrutor de Saldo vazio.
	public ContaExtreme(int Id){
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
			this.Saldo += (valor + (valor * 0.002)); //Rendendo 0.2%.
		}
	}

	//Responsável por debitar um valor de uma Conta.
	public void debitar(double valor){
		if (valor <= saldo()) {  //Verifica se o valor do débito cabe no saldo.
			this.Saldo -= (valor -(valor * 0.002));  //Restítuido 0.2% 
		}
	}

	//Retorna o saldo da Conta.
	public double saldo(){
		return Saldo;
	}

	//Retonar o Tipo, Id e Saldo da conta.
	public String toString(){
		
		String Info = "Conta XPTO Extreme. " + 
					  " Id: " + getId() +
					  " Saldo: R$ " + saldo() + " ";

		return Info;
	}	
}