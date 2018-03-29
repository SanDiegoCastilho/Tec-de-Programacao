/* Implementado por : Breno Araújo de Lima. Mat: 398583 e Francisco San Diego de Sousa Castilho.  Mat: 397377.*/

class Circulo extends Figura {

	final double PI = 3.14;
	double raio;
	String name = "Circulo";

	Circulo() {
		this(1);
	}

	Circulo(double raio) {

		this.raio = raio;
		temCor = false;
	}

	public String toString() {
		return this.name;
	}

	public void desenhar() {
		System.out.println(this.toString());
	}

	public double calcularArea() {

		return (Math.pow(this.raio,2)*PI);
	}

}
