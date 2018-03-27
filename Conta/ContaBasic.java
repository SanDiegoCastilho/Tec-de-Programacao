public class ContaBasic extends Conta{
	
	public ContaBasic(String Id, double valor){
		setId(Id);
		setSaldo(valor);
	}

	public ContaBasic(String Id){
		this(Id, 0);
	}

	public String getId(){
		return Id;
	}

	public void setId(String Id){
		this.Id = Id;
	}

	//Responsável por adicionar credito a uma Conta.
	public void creditar(double valor){
		if (valor > 0) { 	//Verifica a validade do valor-crédito.
			this.Saldo += valor;
		}
	}

	//Responsável por debitar um valor de uma Conta.
	public void debitar(double valor){
		if (valor <= saldo()) {  //Verifica se o valor do débito cabe no saldo.
			this.Saldo -= valor; 
		}
	}

	public double saldo(){
		return Saldo;
	}

	public toString(){
		System.out.println("Tipo da Conta: XPTO Basic.");
		System.out.println("Id da Conta: " + getId());
		System.out.println("Saldo da Conta: " + saldo());
	}
}