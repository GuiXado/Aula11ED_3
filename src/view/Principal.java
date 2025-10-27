package view;

import br.gui.listagenerica.Lista;

public class Principal {

	public static void main(String[] args) throws Exception {
		Lista<Integer> listaA = new Lista<>();
		Lista<Integer> listaB = new Lista<>();
		Lista<Integer> listaI = new Lista<>();
		Lista<Integer> listaU = new Lista<>();
		
		// *vetor não usado na resolução, apenas para popular a lista.
		int[] vetorA = {3, 5, 8, 12, 9, 7, 16};
		int[] vetorB = {9, 6, 2, 3, 7};
		
		for (int i : vetorA) listaA.addLast(i);
		for (int i : vetorB) listaB.addLast(i);
		
		//Intersecção
		for (int i = 0; i < (listaA.size()); i++) {
			for (int j = 0; j < (listaB.size()); j++) {
				if (listaA.get(i) == listaB.get(j)) {
					listaI.addLast(listaA.get(i));
				}
			}
		}
		
		// Mostra a intersecção das listas A e B
		System.out.println("Intersecção das Listas: \n");
		for (int i = 0; i < listaI.size(); i++) System.out.print(listaI.get(i) + " ");
		System.out.println("\n");
		
		//União
		for (int i = 0; i < (listaA.size()); i++) {
			listaU.addLast(listaA.get(i));
		}
		for (int i = 0; i < listaB.size(); i++) {
		    boolean existe = false;

		    for (int j = 0; j < listaU.size(); j++) {
		        if (listaU.get(j).equals(listaB.get(i))) {
		            existe = true;
		            break;
		        }
		    }

		    if (!existe) {
		        listaU.addLast(listaB.get(i));
		    }
		}
	
		// Mostra a união das listas A e B
		System.out.println("União das Listas: \n");
		for (int i = 0; i < listaU.size(); i++) System.out.print(listaU.get(i) + " ");
			
	}
}
