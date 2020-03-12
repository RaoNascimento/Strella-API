package br.com.AgendaAutonoma.agendaAutonomo.modelo;

public class DecifradorCesar {
	static int contCasas;
	public String decifrarCesar(String textoCifrado) {
		StringBuilder strBuilder = new StringBuilder();
		
		for (char let : textoCifrado.toCharArray()) {
			contCasas++;
			if (verificaCaractere(let)) { strBuilder.append((char) (let + 3));} 
			else {
				if (let == 'z') {strBuilder.append('c');}
				if (let == 'y') {strBuilder.append('b');}
				if (let == 'x') {strBuilder.append('a');} 
				else {strBuilder.append(let);}
			}
		}
		System.out.println("" + strBuilder.toString());
		return strBuilder.toString();
	}
	
	public int contadorCasas() {
		return contCasas;
	}

	public boolean verificaCaractere(char let) {

		switch (let) {
		case '.': {
			return false;
		}
		case ',': {
			return false;
		}
		case ':': {
			return false;
		}
		case ';': {
			return false;
		}
		case '-': {
			return false;
		}
		case '_': {
			return false;
		}
		case '!': {
			return false;
		}
		case '?': {
			return false;
		}
		case 'x': {
			return false;
		}
		case 'y': {
			return false;
		}
		case 'z': {
			return false;
		}
		case '\"': {
			return false;
		}
		case ' ': {
			return false;
		}
		default:
			return true;
		}
	}
	
	public String decifrarComCasas(String textoCifrado) {
		StringBuilder strBuilder = new StringBuilder(textoCifrado);
	
		for (char let : textoCifrado.toCharArray()) {
		
			if (verificaCaractere(let)) {strBuilder.setCharAt(contCasas,(char) (let + 3));}
			else {
				if (let == 'z') {strBuilder.setCharAt(contCasas,'c');}
				if (let == 'y') {strBuilder.setCharAt(contCasas,'b');}
				if (let == 'x') {strBuilder.setCharAt(contCasas,'a');} 
				else {{strBuilder.setCharAt(contCasas,let);}
					 
				}
			}		
			contCasas++;
			}
	
		return strBuilder.toString();
		
		
	}
}

