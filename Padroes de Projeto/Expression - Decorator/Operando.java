public class Operando extends Expression{
	double valor;

	Operando (double v){
		valor = v;
	}

	public double calcular(){
		return valor;
	}
}