public class Operando extends Expression{
	int valor;

	Operando (int v){
		valor = v;
	}

	int calcular(){
		return valor;
	}

	void adicionar(Expression e, Expression d){}
}