//IMPLEMENTADO POR BRENO ARAÚJO DE LIMA - Mat:398583 E FRANCISCO SAN DIEGO DE SOUSA CASTILHO Mat:397377.
//Classe Círculo - questão 02b Lista 02.
//Última modificação 29/03/2018 - 22:35; 

public class Circulo extends Figura{

	private double Raio; //Raio da circunferência.

	//Construtor padrão
	public Circulo(double px, double py, double raio){
		super(px, py);  //Conrutor da classe abstrata.
		setRaio(raio); //Armazena o valor do Raio.
	}

	//Construtor vazio.
	public Circulo(){
		this.Circulo(0, 0, 1); //Cículo começa na origem e tem Raio = 1.
	}

	//Armazena o valor do raio enviado pelo usuário.
	public void setRaio(double raio){
		if(raio > 0){
			this.Raio = raio;
		}
	}

	//Retorna o valor do Raio.
	public double getRaio(){
		return this.Raio;
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
		double Area = Math.pow(getRaio(), 2) * 3.14;

		return Area;
	}
}