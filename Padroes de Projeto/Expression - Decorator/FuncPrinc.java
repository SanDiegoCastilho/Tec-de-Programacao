public class FuncPrinc{
	public static void main(String[] args){
		 Expression op1, op2, op3, op4, op5;

		 //Folhas.
		 op1 = new Operando(2);
		 op2 = new Operando(1);
		 op3 = new Operando(3);


		 op4 = new Divisao(op1, op2);
		 op5 = new Multiplicacao(op2, op3);

		 System.out.println(op4.calcular()); 
		 System.out.println(op5.calcular()); 

	}
}