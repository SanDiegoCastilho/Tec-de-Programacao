public class Multiplicacao {
	Expression l, r;

	Multiplicacao(Expression operador){
		super();
		this.l = l;
		this.r = r;
	}

	public double calcular(){
		return l.calcular() * r.calcular();
	}
}