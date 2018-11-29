
public class AppArvore {
	
	public static void main(String args []){
		Arvore arvore = new Arvore(new Elemento(10));
		arvore.inserir(new Elemento(1));
		arvore.inserir(new Elemento(5));
		arvore.inserir(new Elemento(8));
		arvore.inserir(new Elemento(15));
		arvore.inserir(new Elemento(12));
		arvore.inserir(new Elemento(18));
		arvore.imprimirPreOrdem();
		System.out.println(" ");
		arvore.imprimirInOrdem();
		System.out.println(" ");
		arvore.imprimirPosOrdem();
		
	
		
	}

}
