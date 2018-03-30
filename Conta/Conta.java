//Francisco San Diego de Sousa Castilho  - Mát: 397377.
//Classe abstrata de Conta - Questão 01 Lista 04.
//Última modificação 30/03/2018 - 12:52.

public abstract class Conta{

	protected String Id;    //Identificador da conta.
	protected double Saldo; //Representa o saldo da conta.


	abstract public void setId(String id); //Guarda o Id da Conta.

	abstract public String getId();  //Retorna o Id da Conta.

	abstract public void creditar(double valor); //Responsável por adicionar crédito a uma conta.

	abstract public void debitar(double valor); //Responsável por debitar valor de uma conta.

	abstract public double saldo(); //Responsável retornar o valor do saldo de uma conta.
}