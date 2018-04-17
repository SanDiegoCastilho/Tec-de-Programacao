public class Divisao extends Operador{
	int calcular(){
		return esquerda.calcular() / direita.calcular();
	}
}