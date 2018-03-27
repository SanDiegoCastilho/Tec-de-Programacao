public abstract class Conta{

	abstract protected String Id;    //Identificador da conta.
	abstract public String Tipo;  //Identifica do tipo da conta: (Basic, Plus, Extreme).
	abstract protected double Saldo; //Representa o saldo da conta.

	abstract Conta(String id, String tipo, double valor); //Construtor da classe Conta.

	abstract String getId();  //Retorna o Id da Conta.

	abstract void setId(String id); //Guarda o Id da Conta.

	abstract String getTipo(); //Retorna o Tipo da Conta.

	abstract void setTipo(String tipo); //Guarda o Tipo da Conta.

	abstract void creditar(double valor); //Responsável por adicionar crédito a uma conta.

	abstract void debitar(double valor); //Responsável por debitar valor de uma conta.

	abstract double saldo(); //Responsável retornar o valor do saldo de uma conta.
}