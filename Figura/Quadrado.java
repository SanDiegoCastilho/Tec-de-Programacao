class Quadrado extends Figura{

	int origemX;
	int origemY;

	int dx;
	int dy;

	int largura;
	int altura;

	//Construtor da classe Quadrado.
	Quadrado(int origemX, int origemY, int dx, int dy){
		if (dx == dy) { //Verifica se os lados são iguais.
			
			
					
			this.origemX = origemX;
			this.origemY = origemY;

			this.largura = origemX + dx;
			this.altura  = origemY + dy;
		}
	}

	public void toString(){
		System.out.println("");
	}

	//Move  quadrado de sua origem.
	void mover(float dx, float dy){
		
	}

	//Calcula a área do quadrado;
	int calcularArea(){
		int area = dx*dy;

		return area;
	}
}