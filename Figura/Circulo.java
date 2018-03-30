//IMPLEMENTADO POR BRENO ARAÚJO DE LIMA - Mat:398583 E FRANCISCO SAN DIEGO DE SOUSA CASTILHO Mat:397377.
//Classe Círculo - questão 02b e 04b Lista 03.
//Última modificação 29/03/2018 - 22:35. 

public class Circulo extends Figura{

	private double Raio; //Raio da circunferência.
	private int Cor;     //Representa a cor da figura caso ela seja colorida.
						 //O valor 0 diz que a figura é do tipo Não Colorida.

	//Construtor padrão
	public Circulo(double px, double py, double raio, int cor){
		setPx(px);     //Armazena o valor inicial de px.
		setPy(py); 	   //Armazena o valor inicial de py.
		setRaio(raio); //Armazena o valor do Raio.
		pinta(cor);    //"Pinta" a figura com a cor dada.
	}

	//Construtor vazio.
	public Circulo(){
		this(0, 0, 1, 0); //Cículo começa na origem e tem Raio = 1.
	}

	//"Pinta" a figura com a cor dada.
	public void pinta(int cor){
		this.Cor = cor;
	}

	//Verifica se a figura é colorida.
	public boolean temCor(){
		if (this.Cor != 0)
			return true;   //Figura colorida.
		
		else
			return false;  //Figura não colorida.
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

	//Retorna o valor de Px.
	public double getPx(){
		return Px;
	}

	//Armazena um valor a Py.
	public void setPy(double py){
		this.Py = py;
	}

	//Retorna o valor de Py.
	public double getPy(){
		return Py;
	}

	//Chama a função que "desenha" a figura.
	public void desenha(){
		System.out.println(toString());
	}

	//Escreve o tipo de figura.
	public String toString(){
		return "Círculo";
	}

	//Método responsável por mover a Figura no plano.
	public void mover(float dx, float dy){
		setPx(getPx() + dx);  //Move no eixo das abcissas.
		setPy(getPy() + dy);  //Move no eixo das ordenadas.
	}

	//Método responsável por calcular a área dó círculo.
	public double calculaArea(){
		double Area = Math.pow(getRaio(), 2) * 3.14;

		return Area;
	}
}