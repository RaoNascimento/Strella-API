package br.com.AgendaAutonoma.agendaAutonomo.modelo;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ResumoSHA1 {
	
	public String resumirTextoDecifrado(String textoDecifrado) throws NoSuchAlgorithmException { 
	MessageDigest algorithm = MessageDigest.getInstance("SHA1");
	 StringBuilder resumoBuilder = null;
	
	 try {
		byte arrayGerado[] = algorithm.digest(textoDecifrado.getBytes("UTF-8"));
		 resumoBuilder = new StringBuilder();
		 
		 for (byte let :  arrayGerado) {
	         resumoBuilder.append(String.format("%02X", 0xFF & let));
	       }
		
		
	} catch (UnsupportedEncodingException e) {

		e.printStackTrace();
	}
	return resumoBuilder.toString();
	}

}
