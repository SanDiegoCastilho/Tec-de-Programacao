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

	public void creditar(double valor){
		this.Saldo += valor;
	}

	public void debitar(double valor){
		this.Saldo -= valor; 
	}

	public double saldo(){
		return Saldo;
	}
}