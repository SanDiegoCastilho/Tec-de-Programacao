abstract public class Figura {

	double dx;
	double dy;

	//Mover a figura da tela.
	public void mover(float dx, float dy) {

		this.dx = this.dx + dx;
		this.dy = this.dy + dy;

	}
	//Desenha a Figura na Tela.
	abstract public void desenhar();

	abstract public void desenhar(String cor);
	//Calcula a área da figura.
	abstract double calcularArea();
}
