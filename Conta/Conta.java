public abstract class Conta{

	abstract protected String Id;    //Identificador da conta.
	abstract protected double Saldo; //Representa o saldo da conta.


	abstract public String getId();  //Retorna o Id da Conta.

	abstract public void setId(String id); //Guarda o Id da Conta.

	abstract public void creditar(double valor); //Responsável por adicionar crédito a uma conta.

	abstract public void debitar(double valor); //Responsável por debitar valor de uma conta.

	abstract public double saldo(); //Responsável retornar o valor do saldo de uma conta.
}