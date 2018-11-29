
public class Arvore {
	
	private Elemento ele;
	private Arvore dir;
	private Arvore esq;



	public Arvore(){
		this.ele =null;
		this.dir =null;
		this.esq =null;
	}
	public Arvore(Elemento elem){
		this.ele = elem;
		this.dir = null;
		this.esq = null;
		//System.out.println("criando a arvore com o elemento "+elem.getValor());
	}
	//criando metodos de controler
	
	//verificando se a arvore esta vazia
	public boolean isEmpty(){
		return(this.ele==null);
	}
	
	public void imprimirPreOrdem(){
		if(!isEmpty()){
			System.out.print(this.ele.getValor()+" ");
			if(this.esq!=null){
				this.esq.imprimirPreOrdem();
			}
			if(this.dir!=null){
				this.dir.imprimirPreOrdem();
			}
		}
	}
	
	public void imprimirInOrdem(){
		if(!isEmpty()){
			if(this.esq!=null){
				this.esq.imprimirInOrdem();
			}
			System.out.print(this.ele.getValor()+" ");
			if(this.dir!=null){
				this.dir.imprimirInOrdem();
			}
		}
	}
	
	
	public void imprimirPosOrdem(){
		if(!isEmpty()){
			if(this.dir!=null){
				this.dir.imprimirPosOrdem();
			}
			if(this.esq!=null){
				this.esq.imprimirPosOrdem();
			}
			System.out.print(this.ele.getValor()+" ");
		}
	}
	
	
	//inserindo elementos na arvore
	public void inserir(Elemento novo){
		if(isEmpty()){
			this.ele=novo;
		}
		else{
			Arvore novaArvore = new Arvore(novo);
			if(novo.getValor()<this.ele.getValor()){
				if(this.esq==null){ //sou um no folha.
					this.esq=novaArvore;
					//System.out.println("Inserindo o elemento : "+novo.getValor()+"a esquerda de:"+this.ele.getValor());
				}
				else{
					this.esq.inserir(novo);//repassa  a responsa para a sub-arvore esquerda	
				}
				
			}
			else if(novo.getValor() > this.ele.getValor()){//insere a direita
				if(this.dir == null){
					this.dir = novaArvore;
					//System.out.println("Inserindo o elemento: "+novo.getValor()+"a direita de:"+this.ele.getValor());
				}
				else{
					this.dir.inserir(novo);
				}
			}
			
		}
	}
	
	// criando as buscas
	
	public boolean busca(int valor){
		if(isEmpty()){
			return false;
		}
		if(this.ele.getValor()==valor){
			return true;
		}
		else{
			if(valor<this.ele.getValor()){
				if(this.esq==null){
				return false;
			}
			else{
				return this.esq.busca(valor); //repassa para sub-arvore esquerda.
			}
		}
			else if(valor > this.ele.getValor()){
				if(this.dir==null);
				return false;
			}	
			else{
				return this.dir.busca(valor);
			}
		}
		

			
	}
	
	//inserindo o percurso da arvore
		
	
	//get e sets
	public Elemento getElemento() {
		return this.ele;
	}
	public void setEle(Elemento ele) {
		this.ele = ele;
	}
	public Arvore getDireita() {
		return dir;
	}
	public void setDireita(Arvore dir) {
		this.dir = dir;
	}
	public Arvore getEsquerda() {
		return esq;
	}
	public void setEsquerda(Arvore esq) {
		this.esq = esq;
	}
}