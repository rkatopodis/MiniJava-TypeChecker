package minijava;
import java.util.HashMap;

public class SymbolTable<T> extends HashMap<String, T> {
	private static final long serialVersionUID = -1087663046372564890L;

	public final SymbolTable<T> parent;
	
	public SymbolTable(SymbolTable<T> _parent) {
		parent = _parent;
	}
	
	public T get(String key) {
		T val = super.get(key);
		if(val == null && parent != null) {
			val = parent.get(key);
		}
		return val;
	}

	public T getOrDefault(String key, T def) {
		T val = this.get(key);
		if(val == null) return def;
		else return val;
	}
}
