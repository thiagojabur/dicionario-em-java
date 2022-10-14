package dicionario;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class Principal {

	public static void main(String[] args) {
		
		Dictionary<Integer, String> dic = new Hashtable<Integer, String>();
		dic.put(1, "Thiago");
		dic.put(2, "Arthur");
		dic.put(3, "Luanna");
		dic.put(4, "Ramon");
		dic.put(5, "Jayme");
		System.out.println("Tamanho do dicionário: " + dic.size());
		System.out.println("Valor da chave 3: " + dic.get(3));
		//Iterate over elements in dictionary
		System.out.println("Iterando usando enumeração:");
		Enumeration<String> e = dic.elements();
		while(e.hasMoreElements())
		  System.out.print(e.nextElement() + " ");
		System.out.println("\n Mostra as chaves:");
		Enumeration<Integer> ekey = dic.keys();
		while(ekey.hasMoreElements())
	          System.out.print(ekey.nextElement() + " ");
	       dic.remove(4);
	       System.out.println("\nValores após remover o elemento da chave 4: " + dic);
	       //Update value at key 3
		   dic.put(3, "Lobato");
	       System.out.println("Valor na chave 3: " + dic.get(3));
	       System.out.println("O dicionário está vazio? " + dic.isEmpty());

	}

}
