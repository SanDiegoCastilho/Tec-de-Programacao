/* Implementado por : Breno Araújo de Lima. Mat: 398583 e Francisco San Diego de Sousa Castilho.  Mat: 397377.*/

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
				figuras[i] = new Quadrado(i+1);
			else
				figuras[i] = new Circulo();
		}

		//Colorindo algumas Figuras
		figuras[0].desenhar("Amarelo");
		figuras[1].desenhar("Verde");
		figuras[3].desenhar("Azul");


		//Imprimindo área das figuras coloridas.
		int cont = 0;
		while(cont<10) {

			if(figuras[cont].temCor){
				figuras[cont].desenhar();
				System.out.println("Área:  "+figuras[cont].calcularArea()+"m²\n\n");
			}

			cont++;
		}

	}
}
