import java.util.ArrayList;

public class VerificadorPalavrasRepetidas {

	public String verificar(String palavra) {
		// TODO Auto-generated method stub
		
		palavra = palavra.toLowerCase();
		
		ArrayList<String> letras_repetidas = new ArrayList<String>();
			
		for (int cont = 0; cont < palavra.length(); cont++ ) {

			char letra_atual = palavra.charAt(cont);
			
			for (int cont2 = cont+1; cont2 < palavra.length(); cont2++) {
				char letra_repeticao = palavra.charAt(cont2);
				
				if (letra_atual == letra_repeticao) {				
					if (!letras_repetidas.contains(String.valueOf(letra_atual))) {
						letras_repetidas.add(String.valueOf(letra_atual));
					}
				}
			}
		}
			
		String resultado;
		
		if (letras_repetidas.size() > 0) {
			resultado = palavra + ": " + String.join(",", letras_repetidas);
		} else {
			resultado = palavra + ": none";
		}
		
		return resultado;
	}
}
