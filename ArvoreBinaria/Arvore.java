package arvore.binaria;

public class Arvore<T extends Comparable<T>> {
	public No<T> raiz;

	public void adiciona(T valor) {
		if (this.raiz == null) {
			this.raiz = new No<T>(valor);
		} else {  
			this.adiciona(this.raiz, valor);
		}
	}

	private void adiciona(No<T> no, T valor) {
		if (no.valor.compareTo(valor) < 0) {
			if (no.direita == null) {
				No<T> novo = new No<T>(valor);
				novo.pai = no;
				no.direita = novo;
			} else {
				this.adiciona(no.direita, valor);
			}
		} else {
			if (no.esquerda == null) {
				No<T> novo = new No<T>(valor);
				novo.pai = no;
				no.esquerda = novo;
			} else {
				this.adiciona(no.esquerda, valor);
			}
		}
	}
	
	public void remove(No<T> no) {
		
		if(no.esquerda != null)
			this.remove(no.esquerda);
		
		if(no.direita != null)
			this.remove(no.direita);
		
		if (no.pai == null) {
			this.raiz = null;
		
		} else {
			
			if (no.pai.esquerda == no) {
				no.pai.esquerda = null; 
				
			} else { 
				
				no.pai.direita = null;
			}
		}
	}
	
	public No<T> localizar(T valor) {
		return this.localizar(this.raiz, valor);
	}
	
	private No<T> localizar(No<T> no, T valor) {
		if (no != null) {
			if (no.getValor().equals(valor)) {
				return no;
			}
		}
		
		No<T> aux = localizar(no.getEsquerda(), valor);
		if (aux != null) {
			return aux; 
		}
		
		aux = localizar(no.getDireita(), valor);
		if (aux != null) {
			return aux; 
	   }
	
	return null;
			
   }	
   
   //PRE ORDER 
   
  // public void percorrer(No<T> no) {
	 //  if (no != null) {
		  // System.out.printf("Valor: ", no.getValor());
		   
		  // percorrer(no.getEsquerda());
		  // percorrer(no.getDireita());
		   
	   //}
		   
  // }
   
   // IN ORDER
   
  // public void percorrer(No<T> no) {
	  // if (no != null) {   
		   
		 //  percorrer(no.getEsquerda());
		   
		 //  System.out.printf("Valor: ", no.getValor());
		   
		  // percorrer(no.getDireita());
		   
	   //}
		   
  // }
   
   //PÓS ORDER 
   
   public void percorrer(No<T> no) {
	   if (no != null) {   
		   
		   percorrer(no.getEsquerda());
		   
		   percorrer(no.getDireita());
		   
		   System.out.printf("Valor: ", no.getValor());
		   
	   }
		   
   }
   
}

	
	