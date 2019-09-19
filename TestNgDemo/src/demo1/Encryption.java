package demo1;

import java.util.Base64;

public class Encryption {
	public static void main(String[] args) {
		String OrignalInput = "test input";
		String encodedString = Base64.getEncoder().encodeToString(OrignalInput.getBytes());
		System.out.println("encoded String = "+ encodedString);
		
		 byte[] DecodeString = Base64.getDecoder().decode(encodedString);
		System.out.println("decoded String = "+ DecodeString);
		
		for(byte abcd : DecodeString) {
			System.out.println("decoded byte = "+ abcd +"decoded string = " + (char)abcd);
			
		}
		System.out.println("Decoded Sreing = "+new String(DecodeString));
	}



}
