public class Multiplicacao extends Operador{
	int calcular(){
		return esquerda.calcular() * direita.calcular();
	}
}