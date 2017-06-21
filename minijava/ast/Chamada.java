package minijava.ast;

import java.util.List;

public class Chamada implements Exp {
	public Exp obj;
	public String nome;
	public List<Exp> args;
	public int lin;
	
	public Chamada(Exp _obj, String _nome, List<Exp> _args, int _lin) {
		obj = _obj;
		nome = _nome;
		args = _args;
		lin = _lin;
	}

	public String toString() {
		String res = obj + "." + nome + "(";
		if(!args.isEmpty())
			res += args.get(0);
		for(int i = 1; i < args.size() ; i++)
			res += ", " + args.get(i);
		res += ")";
		return res;
	}

	@Override
	public <C, R> R accept(Visitor<C, R> vis, C ctx) {
		return vis.visit(this, ctx);
	}
}
