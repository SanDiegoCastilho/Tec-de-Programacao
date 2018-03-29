class Quadrado extends Figura {

	public double lado;
	public String name = "Quadrado";


	Quadrado() {

		this(1);
	}
	//Construtor da classe Quadrado.
	Quadrado(double lado) {

			super();
			this.lado = lado;
			temCor = false;
	}

	public String toString() {
		return this.name;
	}

	//Desenha a Figura na Tela.
	public void desenhar() {

		System.out.println(this.toString());
		if(temCor)
			System.out.println("cor: "+cor);

	}
	//Calcula a área do quadrado;
	public double calcularArea(){

		double area = Math.pow(this.lado,2);
		return area;
	}
}
