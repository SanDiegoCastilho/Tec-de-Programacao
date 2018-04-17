public class Divisao extends Operador{
	Expression l, r;

	Divisao(Expression l, Expression r){
		super(this(l, r));
		this.l = l;
		this.r = r;
	}

	public double calcular(){
		return l.calcular() / r.calcular();
	}
}