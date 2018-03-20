abstract class Figura{

	//Origem da imagem.
	int origemX;
	int origemY;

	//Atirbutos de largura e altura.
	int dx;
	int dy;

	//Construtor da classe Figura.

	//Desenha a figura na tela.
	void desenhar();

	//Mover a figura da tela.
	void mover(float dx, float dy);

	//Calcula a área da figura.
	double calculaArea();
}