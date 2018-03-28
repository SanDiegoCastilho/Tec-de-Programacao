class Quadrado extends Figura implements FiguraColorida {

	double lado;
	String name = "Quadrado";
	String cor;
	String tipo;


	Quadrado() {

		this(1);
	}
	//Construtor da classe Quadrado.
	Quadrado(double lado) {

			this.lado = lado;
			dx = 0;
			dx = 0;
			tipo = "nao-colorida";
	}

	public String toString() {
		return this.name;
	}

	//Desenha a Figura na Tela.
	public void desenhar() {

		System.out.println(this.toString());

		if(cor != null)
			System.out.println("cor: "+cor);
	}

	
	//Calcula a área do quadrado;
	public double calcularArea(){

		double area = Math.pow(this.lado,2);
		return area;
	}

	public String getTipo() {

		return this.tipo;
	}
}
