package minijava.ast;

import java.util.HashMap;
import java.util.Map;

public class Tipo {
	public static Map<String, String> subclasseDe = new HashMap<String, String>();
	
	public static void subtipo(String t1, String t2, int linha) {
		// TODO: implementar algoritmo para verificar se t1 é subtipo de t2
		// Reflexiva, subclasse direta, transitiva
		// O mapa subclasseDe já estará preenchido com todas as relacões
		// diretas de subclasse (incluindo para classes que são subclasses
		// apenas de Object)
		throw new RuntimeException("tipo " + t1 + " não é subtipo de " + t2 + " na linha " + linha);
	}
}
