//IMPLEMENTADO POR BRENO ARAÚJO DE LIMA - Mat:398583 E FRANCISCO SAN DIEGO DE SOUSA CASTILHO Mat:397377.
//Classe Principal - questão 03 Lista 03.
//Última modificação 30/03/2018 - 11:35.

public class FunPrinc{
	public static void main (String[] args){
		Quadrado Q1 = new Quadrado(5, 5, 10, 0);  //Instanciando o primeiro Quadrado.
		Quadrado Q2 = new Quadrado(3, 2, 15, 0);  //Instanciando o segunndo Quadrado.

		Circulo C1 = new Circulo(6, 3 , 14, 0);  //Instanciando o primeiro Círculo;
		Circulo C2 = new Circulo(8, 4 , 11, 0);  //Instanciando o segundo Círculo;

		//-----  TESTANDO AS CLASSES: Crculo e Quadrado -----
		System.out.println("===== TESTANDO AS CLASSES: Circulo e Quadrado - Questão 03 =====");

		System.out.println("Ponto de Origem C1: (" + C1.getPx() + ", " + C1.getPy() + ")" + " Raio: " + C1.getRaio());
		System.out.println("Ponto de Origem C2: (" + C2.getPx() + ", " + C2.getPy() + ")" + " Raio: " + C2.getRaio());


		System.out.println("Ponto de Origem Q1: (" + Q1.getPx() + ", " + Q1.getPy() + ")" + " Lado: " + Q1.getLado());
		System.out.println("Ponto de Origem Q2: (" + Q2.getPx() + ", " + Q2.getPy() + ")" + " Lado: " + Q2.getLado());

		System.out.println(" ... ");

		System.out.println("===== Movendo C1 10 unidades no eixo das abcissas e 5 no eixo das ordenadas =====");

		C1.mover(10, 5);
		System.out.println("Novo ponto de Origem C1: (" + C1.getPx() + ", " + C1.getPy() + ")" + " Raio: " + C1.getRaio());

		System.out.println("===== Desenhando as figuras =====");
		System.out.print("C1 é "); C1.desenha();
		System.out.print("Q2 é "); Q2.desenha();

		System.out.println(" ... ");

		System.out.println("===== Calculando a Área de cada figura =====");
		System.out.println("Área de C2: " + C2.calculaArea());
		System.out.println("Área de Q1: " + Q1.calculaArea());

		System.out.println(" ... ");

		System.out.println("===== TESTANDO FIGURAS COLORIDAS - QUSTÃO 05 =====");

		//Vetor de figuras de tamanho 10.
		Figura[] vetorFig = new Figura[10];

		//Instanciando 5 quadrados e 5 círculos.
		for (int i = 0; i < 10; i++) {
			if (i < 5)
				vetorFig[i] = new Quadrado(i, (i + 2), (i + 5), 0); //Cada quadrado terá cor = 0;

			else
				vetorFig[i] = new Circulo((i + 3), (i + 8), (i + 10), 0); //Cada circulo terá cor = 0;
		}

		//Pintando algumas figuras...
		vetorFig[1].pinta(3);
		vetorFig[3].pinta(100);
		vetorFig[9].pinta(66);

		//Imprimindo a área das figuras coloridas.
		for (int i = 0; i < 10; i++) {
			if (vetorFig[i].temCor()){
				System.out.println("Área da Figura " + i + " = " + vetorFig[i].calculaArea());
			}	
		}
	}
}