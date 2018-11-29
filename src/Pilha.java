
public class Pilha {
	int elementos[];
	int topo;
	
	public Pilha(){
		elementos = new int[10];
		topo = -1;
		
	}
	public void push(int e){
		
		topo++;
		elementos[topo]=e;		
	}
	public int pop(){
		int e;
		e= elementos[topo];
		topo--;
		return e;
		
	}
	
	public boolean isEmpty(){
		if(topo == -1){//posição invalida pilha vazia;
			return true;
		}
		else
			return false;
		
	}
	
	public boolean isFull(){
		return (topo==9);
		
	}
	
	public int top(){
		return elementos[topo];
	}

}
