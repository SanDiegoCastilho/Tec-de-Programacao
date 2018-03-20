public class Conjunto{ //classe conjunto

	int indice;
	Object[] elementos;

	//Construtor da Classe Conjunto
	public Conjunto(int tamanho){

		elementos = new Object[tamanho];
		indice = 0;
	}

	//Construtor de tamanho padrão.
	public Conjunto() {

		this(10);
	}

	//Função responsável por guardar um elemento no Conjunto.
	public void setElement(int n){

		//Verifica se existe espaço no conjunto e se nῶao tem elementos repetidos para inserir.
		if (!checkExistence(n) && indice < elementos.length){

			elementos[indice] = n;
			indice++;
		}
	}

	public void setElement(float n) {

		if (!checkExistence(n) && indice < elementos.length){

			elementos[indice] = n;
			indice++;
		}
	}

	public void setElement(String n) {

		if (!checkExistence(n) && indice < elementos.length){

			elementos[indice] = n;
			indice++;
		}
	}

	public void setElement(double n) {

		if (!checkExistence(n) && indice < elementos.length){

			elementos[indice] = n;
			indice++;
		}
	}

	public void setElement(Object n) {

		if (!checkExistence(n) && indice < elementos.length){

			elementos[indice] = n;
			indice++;
		}

	}

	public boolean checkExistence(Object n) {
		//Verifica a existencia um elemento no Conjunto.

		for (int i = 0; i < indice; i++) {
				
			if (n.equals(getElement(i)))
				return true;
		}
		return false;
	}

	public Object getElement(int i){

		if (i >= 0 && i < indice) 
			return elementos[i];
		else
			return null;
	}

	public boolean checkSubset(Conjunto C){
		//Verifica se para cada inteiro do primeiro conjunto o mesmo elemento
		//pertence ao segundo conjunto e rretorna um valor correspondente.
	

		for (int i = 0; i < indice; i++) {

			if (!C.checkExistence(getElement(i)))
				return false;
		}

		return true;
	}

	public Conjunto union(Conjunto C) {

		int aux = 0;

		//Verifica quantos elementos repetidos os conjuntos tem.
		for (int i = 0; i < indice; i++) {
			if (C.checkExistence(getElement(i))) {
				aux ++;
			}
		}

		//Istancia um Conjunto Uniῶao de tamanho proporcional.
		Conjunto ConjUnion = new Conjunto(indice + C.indice - aux);

		//Adiciona os elementos dos conjuntos no ConjuntoUnião.
		for (int i = 0; i < indice; i++) {
			ConjUnion.setElement(getElement(i));
		}

		for (int j = 0; j < C.indice; j++) {
			ConjUnion.setElement(C.getElement(j));
		}

		return ConjUnion;
	}

	//Função responsável pela intersecçῶao de dois conjuntos.
	public Conjunto inter(Conjunto C){
		//Inicializa um vetor que guardará os valores comuns aos conjuntos.
		//e uma variável que auxilia na contagem e armazenagem do tamanho dos conjuntos.
		Object[] NRepetidos = new Object[C.indice];
		int aux = 0;

		//Verifica quantos e quais os elementos comuns aos conjuntos.
		for (int i = 0; i < indice; i++) {
			if (C.checkExistence(getElement(i))){

				NRepetidos[aux] = getElement(i);
				aux++;
			}
		}

		//Istancia ConjInter.
		Conjunto ConjInter = new Conjunto(aux);

		//Preenche o ConjInter com os valores comuns aos dois conjunntos.
		for (int i = 0; i < ConjInter.elementos.length; i++) {

			ConjInter.setElement(NRepetidos[i]);
		}

		return ConjInter;
	}

	//Função resposável pelo cálculo da diferença entre dois conjuntos.
	public Conjunto dif(Conjunto C){

		boolean aux = true;


		Conjunto ConjInter = inter(C);

		//Instância do Conjunto diferença.
		Conjunto ConjDif = new Conjunto(elementos.length - ConjInter.elementos.length);

		//Verifica se para cada elemento do conjunto atual está no conjunto intersecção.
		for (int i = 0; i < indice; i++) {
			for (int j = 0; j < ConjInter.elementos.length; j++) {
			

				if (elementos[i] == ConjInter.getElement(j))
					aux = false;

				}
			

			//Insere no conjunto da diferença aqueles elementos que não estão no conjunto da intersecção.
			if (aux) {
				ConjDif.setElement(getElement(i));
			}
			
			aux = true;
		}

		return ConjDif;
	}


	public Conjunto produtoCartesiano(Conjunto C2) {

		int n = (this.elementos.length * C2.elementos.length);	//Número de pares ordenados do produto cartesiano.

		Conjunto Produto = new Conjunto(n);	// Instanciaçao do conjunto que receberá os pares ordenados.

		Conjunto Aux = new Conjunto(2);	//Conjunto para armazenar os valores temporarios de cada par ordenado.

		for(int i = 0; i < indice; i++) {	//Conjunto 1
			for(int j = 0; j < C2.indice; j++) {	//COnjunto 2

				Aux.elementos[0] = this.getElement(i);
				Aux.elementos[1] = C2.getElement(j);

				Produto.setElement(Aux.elementos);
			}
		}
		return Produto;
	}

	public void showSet() {

		for(int i = 0; i<elementos.length; i++) {

			System.out.println(elementos[i]);
		}
	}

	/*public void showSet(Conjunto Produto) {

		for(int i = 0; i < Produto.indice; i++) {

				System.out.println("("+(Produto.elementos[i]).elementos[0]+","+(Produto.elementos[i]).elementos[1]+")");
			}
	}*/

}
