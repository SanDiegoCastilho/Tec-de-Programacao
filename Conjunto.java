//San Diego - 10/03/2018 - 21:26.
//Classe Conjunto, representar u conjunto como uma classe Java.

public class Conjunto{

	private int indice;
	private int tamanho;
	private int[] elementos;

	//Construtor da Classe Conjunto
	public Conjunto(int tamanho){

		this.tamanho = tamanho;
		elementos = new int[tamanho];
		indice = 0;
	}

	//Construtor de tamanho padrão.
	public Conjunto(){

		this(10);
	}

	//Função responsável por guardar um elemento no Conjunto.
	public void setElement(int n){

		//Verifica se existe espaço no conjunto e se nῶao tem elementos repetidos para inserir.
		if (!checkExistence(n) && indice < tamanho){

			elementos[indice] = n;
			indice++;
		}
	}

	//Retorna um valor específico
	public int getElement(int i){
		if (i > 0 && i < indice) {
			return elementos[i]; 
		}
	}

	//Função resposável por verificar a existência de um conjunto;
	public boolean checkExistence(int n){
		//Verifica a existencia um elemento no Conjunto.
		for (int i = 0; i < indice; i++) {
				
			if (n == getElement(i))
				return true;
		}

		return false;
	}

	//Função responsável por verificar se um conjunto é subconjunto de outro.
	public boolean checkSubset(Conjunto C){
		//Verifica se para cada inteiro do primeiro conjunto o mesmo elemento
		//pertence ao segundo conjunto e rretorna um valor correspondente.
	

		for (int i = 0; i < indice; i++) {

			if (!C.checkExistence(getElement(i))){
				return false;
			}
		}

		return true;
	}

	//Função responsável pela união de dois conjuntos.
	public Conjunto union(Conjunto C){

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
		int[] NRepetidos = new int[C.indice];
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
		for (int i = 0; i < ConjInter.tamanho; i++) {

			ConjInter.setElement(NRepetidos[i]);
		}

		return ConjInter;
	}

	//Função resposável pelo cálculo da diferença entre dois conjuntos.
	public Conjunto dif(Conjunto C){

		boolean aux = true;


		Conjunto ConjInter = inter(C);

		//Instância do Conjunto diferença.
		Conjunto ConjDif = new Conjunto(tamanho - ConjInter.tamanho);

		//Verifica se para cada elemento do conjunto atual está no conjunto intersecção.
		for (int i = 0; i < indice; i++) {
			for (int j = 0; j < ConjInter.tamanho; j++) {
			

				if (elementos[i] == ConjInter.getElement(j)) {

					aux = false;

				}
			}

			//Insere no conjunto da diferença aqueles elementos que não estão no conjunto da intersecção.
			if (aux) {
				ConjDif.setElement(getElement(i));
			}
			
			aux = true;
		}

		return ConjDif;
	}
}