public class Quadrado extends Figura{

	private double Dx;
	private double Dy;

	//Construtor da classe Quadrado.
	Quadrado(double dx, double dy){
		if (dx == dy) { //Verifica se os lados são iguais.

			setDx(dx);
			setDy(dy);
		}
	}

	//Retorna o valor de Dx.
	public double getDx(){
		return this.Dx;
	}

	//Armazena um valor em Dx.
	public void setDx(double dx){
		this.Dx = dx;
	}

	//Retorna o valor  de Dy.
	public double getDy(){
		return this.Dy;
	}

	//Armazena um valor em Dy.
	public void setDy(double dy){
		this.Dy = dy;
	}

	public void desenha(){
		System.out.println(toString());
	}

	public String toString(){
		return "Quadrado";
	}

	//Move  quadrado de sua origem.
	public void mover(float dx, float dy){
		this.Dx += dx;
		this.Dy += dy;
	}

	//Calcula a área do quadrado;
	public double calculaArea(){
		double area = Dx * Dy;

		return area;
	}
}