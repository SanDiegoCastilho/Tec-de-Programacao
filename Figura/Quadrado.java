//IMPLEMENTADO POR BRENO ARAÚJO DE LIMA - Mat:398583 E FRANCISCO SAN DIEGO DE SOUSA CASTILHO Mat:397377.
//Classe Quadrado - questão 02a e 04a Lista 03.
//Última modificação 30/03/2018 - 12:32. 

public class Quadrado extends Figura{

	private double Lado;  //Lado do quadrado.
	private int Cor;      //Representa a cor da figura caso ela seja colorida.
						  //O valor 0 diz que a figura é do tipo Não Colorida.	

	//Construtor padrão da classe Quadrado.
	public Quadrado(double px, double py, double lado, int cor) {
		setPx(px);    //Armazena o valor inicial de px.
		setPy(py);	  //Armazena o valor inicial de py.
		setLado(lado);//Armazena o valor inicnial de Lado.
		pinta(cor);   //"Pinta" a figura com a cor dada.
	}

	//Construtor Vazio da classe Quadrado.
	public Quadrado() {
		this(0, 0, 1, 0);
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

	//Armazena um valor para Lado.
	public void setLado(double lado){
		if (lado > 0){  //Verifica a validade da dimensão de Lado.
			this.Lado = lado;
		}
	}

	//Retorna o valor do lado do Quadrado.
	public double getLado(){
		return Lado;
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

	//Desenha a Figura na Tela.
	public void desenha() {
		System.out.println(this.toString());
	}

	// 	if(temCor)
	// 		System.out.println("cor: " + cor);
	// }

	//Escreve o tipo da figura.
	public String toString() {
		return "Quadrado";
	}

	//Método reponsável por mover a Figura no plano.
	public void mover(float dx, float dy){
		setPx(getPx() + dx);  //Move no eixo das abcissas.
		setPy(getPy() + dy);  //Move no eixo das ordenadas.
	}

	//Calcula a área do quadrado;
	public double calculaArea(){
		double Area = Math.pow(getLado() ,2);

		return Area;
	}
}