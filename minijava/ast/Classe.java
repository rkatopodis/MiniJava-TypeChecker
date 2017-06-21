package minijava.ast;

import java.util.ArrayList;
import java.util.List;

public class Classe {
	public String nome;
	public String pai;
	public List<Var> campos;
	public List<Metodo> metodos;
	public int lin;

	public List<String> ncampos = new ArrayList<>();
	public List<String> tcampos = new ArrayList<>();

	public List<String> nmetodos = new ArrayList<>();
	public List<Metodo> pmetodos = new ArrayList<>();
		
	public Classe(String _nome, List<Var> _campos, List<Metodo> _metodos, int _lin) {
		nome = _nome;
		pai = "Object";
		campos = _campos;
		metodos = _metodos;
		lin = _lin;
	}

	public Classe(String _nome, String _pai, List<Var> _campos, List<Metodo> _metodos, int _lin) {
		nome = _nome;
		pai = _pai;
		campos = _campos;
		metodos = _metodos;
		lin = _lin;
	}

	public String toString() {
		String res = "class " + nome + " extends " + pai + "{\n";
		for(Var campo: campos) {
			res += campo + ";\n";
		}
		for(Metodo metodo: metodos) {
			res += metodo + "\n";
		}
		res += "}";
		return res;
	}
			
	public <C, R> R accept(Visitor<C, R> vis, C ctx) {
		return vis.visit(this, ctx);
	}

}
