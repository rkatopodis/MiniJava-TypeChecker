package minijava;

public class Token implements Tokens {
	public int tipo;
	public String texto;
	public int lin;
	public int col;

	public final static int EOF        = 0;
		
	public final static String[] nomes = new String[] {
		"<<EOF>>", "&&",
		"boolean", "class", "else", "==", "extends", "false",
		"id", "if", "int", "length", "main", "-", "!=", "new",
		"num", "System.out.println", "public", "return", "static",
		"String", "this", "true", "void", "while"
	};
	
	public Token(int tipo, String texto, int lin, int col) {
		this.tipo = tipo;
		this.texto = texto;
		this.lin = lin + 1;
		this.col = col + 1;
	}

	public Token(int tipo, int lin, int col) {
		this.tipo = tipo;
		this.texto = tipo < nomes.length ? nomes[tipo] :
			Character.toString((char)tipo);
		this.lin = lin + 1;
		this.col = col + 1;
	}

	@Override
	public boolean equals(Object other) {
		Token tok = (Token)other;
		return tipo == tok.tipo;
	}
	
	@Override
	public int hashCode() {
		return tipo;
	}

	@Override
	public String toString() {
		String tok = "," + lin + "," + col + ")";
		if(tipo < nomes.length && !texto.equals(nomes[tipo]))
			return "(" + nomes[tipo] + "," + texto + tok;
		else
			return "(" + texto + tok;
	}
}
