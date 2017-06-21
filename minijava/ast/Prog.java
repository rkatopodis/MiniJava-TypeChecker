package minijava.ast;

import java.util.List;

public class Prog {
	public String main;
	public String args;
	public Cmd cmd;
	public List<Classe> cls;
	
	public Prog(String _main, String _args, Cmd _cmd, List<Classe> _cls) {
		main = _main;
		args = _args;
		cmd = _cmd;
		cls = _cls;
	}

	public String toString() {
		String res = "class " + main + " {\n  public static void main(String[] " + args +
				") {\n" + cmd + "\n  }\n}\n";
		for(Classe classe: cls)
			res += classe + "\n";
		return res;
	}
	
	public <C, R> R accept(Visitor<C, R> vis, C ctx) {
		return vis.visit(this, ctx);
	}
}
