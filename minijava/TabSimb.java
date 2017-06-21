package minijava;

import java.util.HashMap;
import java.util.Map;

public class TabSimb<T> {
  TabSimb<T> pai;
  Map<String, T> nomes =
		  new HashMap<String, T>();
  
  public TabSimb(TabSimb<T> _pai) {
	  pai = _pai;
  }
  
  public TabSimb() { pai = null; }
  
  public boolean inserir(String nome, T atrib) {
	  if(nomes.containsKey(nome))
		  return false;
	  nomes.put(nome,  atrib);
	  return true;
  }
  
  public T procurar(String nome) {
	  if(nomes.containsKey(nome))
		  return nomes.get(nome);
	  else if(pai != null)
		  return pai.procurar(nome);
	  else
		  return null;
  }
  
  public String toString() {
	  String s = "";
	  for(String nome: nomes.keySet()) {
		  s += nome + ": " + nomes.get(nome) + "\n";
	  }
	  if(pai != null)
		  s += pai;
	  return s;
  }
}
