/* 
* A primeira seção da especificação vai até o primeiro %%,
* e consiste de código Java que é copiado ao pé da letra
*
*/

package minijava;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

%%

/*
* A segunda seção vai até o próximo %%, e são diversos parâmetros
* de configuração, além de código Java copiado para o corpo da
* classe do analisador léxico
*
*/

%class Scanner          // nome da classe do analisador
%public                 // classe deve ser pública
%line                   // guarde número da linha em yyline
%column                 // guarde número da coluna em yycolumn
%function nextToken     // nome do método que vai fornecer um token
%type Token             // classe usado para tokens

// Código Java entre %{ e %} é copiado pro corpo da classe
// do analisador
%{ 

	public Scanner() { }

	public void input(String input) {
	    // inicializa entrada pro analisador
		yyreset(new StringReader(input));
	}
	
	public List<Token> tokens() throws IOException {
		List<Token> tokens = new ArrayList<Token>();
		Token tok = nextToken();
		while(tok.tipo != Token.EOF) {
			tokens.add(tok);
			tok = nextToken();
		}
		tokens.add(tok);
		return tokens;
	}

%}

%%

/*
* A última seção contém as regras léxicas, cada regra é um
* par com uma expressão regular e um trecho de código Java
* entre { e }.
*
*/

// Espaços são ignorados
[ \r\n\t\f]    { }

"//"[^\n]*     { }

"/*"~"*/"      { }

// Exemplo de regra
boolean      { return new Token(Token.BOOLEAN, yyline, yycolumn); }

class      { return new Token(Token.CLASS, yyline, yycolumn); }
extends      { return new Token(Token.EXTENDS, yyline, yycolumn); }
public      { return new Token(Token.PUBLIC, yyline, yycolumn); }
static      { return new Token(Token.STATIC, yyline, yycolumn); }
void      { return new Token(Token.VOID, yyline, yycolumn); }
main      { return new Token(Token.MAIN, yyline, yycolumn); }
String      { return new Token(Token.STRING, yyline, yycolumn); }
return      { return new Token(Token.RETURN, yyline, yycolumn); }
int      { return new Token(Token.INT, yyline, yycolumn); }
if      { return new Token(Token.IF, yyline, yycolumn); }
else      { return new Token(Token.ELSE, yyline, yycolumn); }
while      { return new Token(Token.WHILE, yyline, yycolumn); }
System[.]out[.]println      { return new Token(Token.PRINTLN, yyline, yycolumn); }
length      { return new Token(Token.LENGTH, yyline, yycolumn); }
true      { return new Token(Token.TRUE, yyline, yycolumn); }
false      { return new Token(Token.FALSE, yyline, yycolumn); }
this      { return new Token(Token.THIS, yyline, yycolumn); }
new      { return new Token(Token.NEW, yyline, yycolumn); }
null      { return new Token(Token.NULL, yyline, yycolumn); }

"=="      { return new Token(Token.EQ, yyline, yycolumn); }
"!="      { return new Token(Token.NEQ, yyline, yycolumn); }
"&&"      { return new Token(Token.AND, yyline, yycolumn); }

"(" | ")" | "[" | "]" | "{" | "}" | ";" | "." | 
"=" | "<" | "+" | "-" | "*" | "," |
 "/" | "!"  { return new Token(yytext().charAt(0), yyline, yycolumn); }

// Identificadores e numerais devem ser retornados com
// return new Token(Token.ID, yytext(), yyline, yycolumn)
// e return new Token(Token.NUM, yytext(), yyline, yycolumn)

[a-zA-Z][a-zA-Z0-9_]* { return new Token(Token.ID, yytext(), yyline, yycolumn); }
[0-9]+ { return new Token(Token.NUM, yytext(), yyline, yycolumn); }

// Regra para EOF
<<EOF>>      { return new Token(Token.EOF, yyline, yycolumn); }

// Erros léxicos 
.            { throw new RuntimeException("erro léxico, linha: " + 
               (yyline+1) + ", coluna : " + (yycolumn+1) + ", char: " + 
               yytext()); }

