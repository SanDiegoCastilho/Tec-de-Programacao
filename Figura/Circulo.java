//IMPLEMENTADO POR BRENO ARAÚJO DE LIMA - Mat:398583 E FRANCISCO SAN DIEGO DE SOUSA CASTILHO Mat:397377.
//Classe Círculo - questão 02b Lista 02.
//Última modificação 29/03/2018 - 22:19; 

public class Circulo extends Figura{

	private double Raio; //Raio da circunferência.
	private double Px; //Representa o valor do x do ponto de origem do círculo.
	private double Py; //Representa o valor do y do ponto de origem do círculo.   

	//Construtor padrão
	public Circulo(double px, double py, double raio){
		setPx(px);
		setPy(py);
		setRaio(raio);
	}

	//Armazena o valor do raio enviado pelo usuário.
	public void setRaio(double raio){
		if(raio > 0){
			this.Raio = raio;
		}
	}

	//Armazendo um valor a Px.
	public void setPx(double px){
		this.Px = px;
	}

	//Armazena um valor a Py.
	public void setPy(double py){
		this.Py = py;
	}

	//Chama a função que "desenha" a figura.
	public void desenha(){
		System.out.println(toString());
	}

	//Escreve o tipo de figura.
	public String toString(){
		return "Círculo";
	}

	//Método responsável por mover a figura, no caso só é necessário
	//mover seu ponto de origem (px,py) que também é um dos pontos de
	//origem do raio.
	public void mover(double px, double py){
		setPx(px);
		setPy(py);
	}

	//Método responsável por calcular a área dó círculo.
	public double calculaArea(){
		double Area = Math.pow(this.Raio) * 3.14;

		return Area;
	}
}