public abstract class Operador extends Expression{
	Expression esquerda, direita;

	void adicionar(Expression e, Expression d){
		esquerda = e;
		direita = d;
	}
} 