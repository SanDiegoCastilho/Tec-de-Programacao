/* Implementado por : Breno Araújo de Lima. Mat: 398583 e Francisco San Diego de Sousa Castilho.  Mat: 397377.*/

abstract public class Figura implements FiguraColorida {

	double dx;	// Coordenada eixo X
	double dy;	//Coordenada eixo y.
	String cor;
	boolean temCor;

	Figura() {

		this.dx = 0;
		this.dy = 0;
	}

	//Mover a figura da tela.
	public void mover(double dx, double dy) {

		this.dx = this.dx + dx;
		this.dy = this.dy + dy;

	}
	//Desenha a Figura na Tela.
	abstract public void desenhar();

	//Seta a cor da figura;
	public void desenhar(String cor) {
		this.cor = cor;
		this.temCor = true;
	}
	

	//Calcula a área da figura.
	abstract double calcularArea();
}
