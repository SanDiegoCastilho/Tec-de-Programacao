public class Operador extends Expression{
	Expression l, r;

	public Operador(Expression l, Expression r) {
		this.l = l;
		this.r = r;
	}

	public double calcular() {
		return operador.calcular();
	}
}