//IMPLEMENTADO POR BRENO ARAÚJO DE LIMA - Mat:398583 E FRANCISCO SAN DIEGO DE SOUSA CASTILHO Mat:397377.
//Classe Classe Abstrata Figura - questão 01 Lista 03.
//Última modificação 30/03/2018 - 12:31;

public abstract class Figura implements FiguraColorida{

	protected double Px; //Valor de x (abcissa) do ponto de origem da figura.
	protected double Py; //Valor de y (ordenada) do ponto de origem da figura.

	// String cor;
	// boolean temCor;

	//Método responsável por mover a figura na tela.
	public abstract void mover(float dx, float dy);

	//Método resonśavel por "desenhar" a Figura na Tela.
	public abstract void desenha();

	// //Seta a cor da figura;
	// public void desenhar(String cor) {
	// 	this.cor = cor;
	// 	this.temCor = true;
	// }
	
	//Calcula a área da figura.
	abstract double calculaArea();
}
