public class Main {

	public static void main(String[] args) {

		//Instanciação de 2 Quadrados e 2 Círculos.
		Quadrado Q1 = new Quadrado(2);
		Quadrado Q2 = new Quadrado(4);

		Circulo C1 = new Circulo(5);
		Circulo C2 = new Circulo(10);


		//vetor para armazenar 10 figuras.
		Figura[] figuras = new Figura[10];

		//Instancia 5 quadrados e 5 círculos.
		for(int i = 0; i<10; i++) {

			if(i<5)
				figuras[i] = new Quadrado(2);
			else
				figuras[i] = new Circulo(2);
		}

		//Colorindo alguns quadrados.
		(figuras[0]).desenhar("amarelo");
		/*(figuras[2]).desenhar("verde");
		(figuras[4]).desenhar("azul");

		//Imprimindo area das figuras coloridas.
		/*for(int i = 0; i<10; i++) {

			if(figuras[i].getTipo() == "colorida") {
				figuras[i].desenhar();
				System.out.println("Area: "+figuras[i].calcularArea());
			}
		}*/

	}
}