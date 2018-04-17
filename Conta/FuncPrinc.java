public class FuncPrinc{
	public static void main(String[] args){
		 Expressao op1, op2, op3, op4, op5;

		 //Folhas.
		 op1 = new Operando(2);
		 op4 = new Operando(1);
		 op5 = new Operando(3);


		 op2 = new Diferenca();
		 op3 = new Multiplicacao();


		 op3.adicionar(op1, op2);
		 op2.adicionar(op4, op5);

		 System.out.println(op3.calcular()); 

	}
}