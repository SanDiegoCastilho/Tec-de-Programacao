//San Diego - 20/03/2018 - 18:40.
//Função principal - testes da classe Conjunto.
public class FunPrinc {
	public static void main(String[] args) {

		Conjunto CInteiros = new Conjunto(10); //dez primeiros números naturais.
		Conjunto CPares = new Conjunto(5); //cinco primeiros números pares.
		Conjunto CImpares = new Conjunto(5); //cinco primeiros números ímpares.
		Conjunto CPrimos = new Conjunto(10); //dez primeiros números primos.

		//Preechendo conjunto CInteiros.
		for (int i = 0; i < 10; i++) {
			CInteiros.setElement(i);
		}

		//Imprimindo resultado.
		System.out.println("--- Conjunto dos dez primeiros inteiros ---");
		for (int i = 0; i < CInteiros.indice; i++) {
			System.out.println(CInteiros.elementos[i]);
		}


		//Preenchendo conjunto CPares.
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				CPares.setElement(i);
			}
		}

		//Imprimindo resultado.
		System.out.println("--- Conjunto dos 5 primeiros inteiros pares ---");
		for (int i = 0; i < CPares.indice; i++) {
			System.out.println(CPares.elementos[i]);
		}


		//Preenchendo conjunto CImpares.
		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0) {
				CImpares.setElement(i);
			}
		}

		//Imprimindo resultado.
		System.out.println("--- Conjunto dos cinco primeiros inteiros ímpares ---");
		for (int i = 0; i < CImpares.indice; i++) {
			System.out.println(CImpares.elementos[i]);
		}


		//Preenchendo conjunto CPrimos.
		for (int i = 0; i < 30; i++) {
			if (i == 2 || i == 3 || i == 5 || i == 7 || i == 11 || i == 13 || i == 17 || i == 19 || i == 23 || i == 27) {
				CPrimos.setElement(i);
			}
		}

		//Imprimindo resultado.
		System.out.println("--- Conjunto dos dez primeiros inteiros primos---");
		for (int i = 0; i < CPrimos.indice; i++) {
			System.out.println(CPrimos.elementos[i]);
		}


		// A - Verificar se CPrimos é conjunto de sim mesmo.
		if (CPrimos.checkSubset(CPrimos)) {
			System.out.println("CPrimos é subconjunto de si memsmo.");

		}else{
			System.out.println("CPrimos não é conjunto de si mesmo.");
		}

		// B - A pertinência dos conjuntos CPares, CImpares e CPrimos no conjunto CInteiros.
		if (CPares.checkSubset(CInteiros)) {
			System.out.println("CPares é subconjunto de CInteiros.");

		}else{
			System.out.println("CPares não é conjunto de CInteiros.");
		}

		if (CImpares.checkSubset(CInteiros)) {
			System.out.println("CImpares é subconjunto de CInteiros.");

		}else{
			System.out.println("CImpares não é conjunto de CInteiros.");
		}

		if (CPrimos.checkSubset(CInteiros)) {
			System.out.println("CPrimos é subconjunto de CInteiros.");

		}else{
			System.out.println("CPrimos não é conjunto de CInteiros.");
		}


		// C - União de CPares e CImpares é igual a CInteiros.
		Conjunto ConjUni = CPares.union(CImpares);
		boolean  aux = true; 

		for (int i = 0; i < ConjUni.elementos.length; i++) {
			if (!CInteiros.checkExistence(ConjUni.elementos[i])) {
				aux = false;
			}
		}

		if (aux) {
			System.out.println("CImpares + CPares == CInteiros");

		}else{
			System.out.println("CImpares + CPares != CInteiros");

		}

		// D - Intersecção dos conjuntos CInteiros e CPares é vazia.
		Conjunto ConjInt = CInteiros.inter(CPares);

		if (ConjInt.elementos.length > 0) {
			System.out.println("CInteiros intersecção CPares != Vazio");

		}else{
			System.out.println("CInteiros intersecção CPares == Vazio");

		}


		// E - Diferença entre CInteiros e CPares.
		Conjunto ConDif = CInteiros.dif(CPares);

		System.out.println("Elementos do conjunto diferença de CInteiros e CPares");
		for (int i = 0; i < ConDif.elementos.length; i++) {
			System.out.println(ConDif.elementos[i]);
		}

		//Produto Cartesiano Teste1 x Teste2.

		Conjunto teste1 = new Conjunto(4);
		Conjunto teste2 = new Conjunto(2);

		teste1.setElement(1);
		teste1.setElement(2);
		teste1.setElement("Bom dia!");
		teste1.setElement(4);
		teste2.setElement(5);
		teste2.setElement(6);


		System.out.println("=========Teste do Produto Cartesiano==========");

		Conjunto[] teste3 = new Conjunto[teste1.elementos.length*teste2.elementos.length];
		teste3 = teste1.produtoCartesiano(teste2);

		int contador = 0;

		for(int i=0;i<8;i++) {

			System.out.println("("+teste3[contador].getElement(0)+","+teste3[contador].getElement(1)+")");
			contador++;
		}


		//----------- Testando a Lei de De Morgan -----------

		//Passo 01 - Guardar o valor de Complementar A U B:

		Conjunto CUniverso = new Conjunto(50);

		//Preechendo o Conjunto universo com os primeiros 50 inteiros;
		for (int i = 0; i < 50; i++) {
			CUniverso.setElement(i);
		}

		Conjunto A = new Conjunto(11);

		//Preenchendo o Conjunto A com os 11 primeiros valores multiplos de 3.
		for (int j = 0; j < 33; j += 3) {
			A.setElement(j);
		}

		Conjunto B = new Conjunto(7);

		//Preenchendo o Conjunto B com os 7 primeiros valores multiplos de 4.
		for (int k = 0; k < 28; k += 4) {
			B.setElement(k);
		}

		//Conjunto A U B;
		Conjunto CUnionAB = A.union(B);

		//Criando o Conjunto complementar de A U B;
		Conjunto CCompUnionAB = CUniverso.dif(CUnionAB);

		//Passo 02 - Guardar o valor de Complementar A U Complementar B:

		//Conjunto Complementar de A.
		Conjunto CCompA = CUniverso.dif(A);

		//Conjunto Complementar de B.
		Conjunto CCompB = CUniverso.dif(B);

		//Conjunto União dos Complementares de A e B.
		Conjunto CUnionCompAB = CCompA.inter(CCompB);


		//Passo 3 - Checar a igualdade dos dois conjuntos: CCompUnionAB e CUnionCompAB.

		aux = false; //Reutilizando variável dos testes anteriores.

		if (CUnionCompAB.checkSubset(CCompUnionAB) && CCompUnionAB.checkSubset(CUnionCompAB)){
			aux = true;
		}

		if (aux) {
			System.out.println("Lei de De Morgan vale.");

		}else{
			System.out.println("Lei de De Morgan NÃO vale.");
		}




			Conjunto lero = new Conjunto(3);

			for(int i = 0; i < 3; i++) {
				lero.setElement(i);			
	
			}


			lero.printarPartes();

	}
}
