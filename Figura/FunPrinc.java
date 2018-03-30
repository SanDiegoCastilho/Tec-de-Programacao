//IMPLEMENTADO POR BRENO ARAÚJO DE LIMA - Mat:398583 E FRANCISCO SAN DIEGO DE SOUSA CASTILHO Mat:397377.
//Classe Principal - questão 03 Lista 03.
//Última modificação 30/03/2018 - 11:35.

public class FunPrinc{
	public static void main (String[] args){
		Quadrado Q1 = new Quadrado(5, 5, 10);  //Instanciando o primeiro Quadrado.
		Quadrado Q2 = new Quadrado(3, 2, 15);  //Instanciando o segunndo Quadrado.

		Circulo C1 = new Circulo(6, 3 , 14);  //Instanciando o primeiro Círculo;
		Circulo C2 = new Circulo(8, 4 , 11);  //Instanciando o segundo Círculo;

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
	}
}