//Francisco San Diego de Sousa Castilho  - Mát: 397377.
//Classe abstrata de Conta - Questão 01 Lista 04.
//Última modificação 30/03/2018 - 12:52.

public abstract class Conta{

	protected int Id;    //Identificador da conta.
	protected double Saldo; //Representa o saldo da conta.

	
	public abstract void setId(int id); //Guarda o Id da Conta.

	public abstract int getId();  //Retorna o Id da Conta.

	public abstract void creditar(double valor); //Responsável por adicionar crédito a uma conta.

	public abstract void debitar(double valor); //Responsável por debitar valor de uma conta.

	public abstract double saldo(); //Responsável retornar o valor do saldo de uma conta.
}