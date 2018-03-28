class Circulo extends Figura {

	final double PI = 3.14;
	double raio;
	String name = "Circulo";
	String tipo = "nao-colorida";


	Circulo() {
		this(1);
	}

	Circulo(double raio) {

		this.raio = raio;
		dx = 0;
		dy = 0;
	}

	public String toString() {
		return this.name;
	}

	public  void desenhar() {
		System.out.println(this.toString());
	}

	public double calcularArea() {

		return (Math.pow(this.raio,2)*PI);
	}

}