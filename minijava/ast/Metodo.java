package minijava.ast;

import java.util.List;

public class Metodo {
	public String tret;
	public String nome;
	public List<Var> params;
	public List<Var> vars;
	public List<Cmd> cmds;
	public Exp ret;
	public int lin;
	
	public Metodo(String _tret, String _nome, List<Var> _params, List<Var> _vars,
			List<Cmd> _cmds, Exp _ret, int _lin) {
		tret = _tret;
		nome = _nome;
		params = _params;
		vars = _vars;
		cmds = _cmds;
		ret = _ret;
		lin = _lin;
	}

	public String toString() {
		String res = "public " + tret + " " + nome + "(";
		if(!params.isEmpty())
			res += params.get(0);
		for(int i = 1; i < params.size(); i++)
			res += ", " + params.get(i);
		res += ") {\n";
		for(Var var: vars)
			res += var + ";\n";
		for(Cmd cmd: cmds)
			res += cmd + "\n";
		res += "return " + ret + ";\n}";
		return res;
	}

	public <C, R> R accept(Visitor<C, R> vis, C ctx) {
		return vis.visit(this, ctx);
	}
}
