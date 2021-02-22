
public class Palindromo {

	public boolean ehPalindromo(String palavra) throws Exception {
//		throw new Exception("Você precisa implementar o código.");
		StringBuilder palavra_reversa = new StringBuilder(palavra).reverse();
	    
        if (palavra.equalsIgnoreCase(palavra_reversa.toString())) {
        	return true;
        } else {
    		return false;
        }
	}

}