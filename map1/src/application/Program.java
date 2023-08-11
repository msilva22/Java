package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username","Maria");
		cookies.put("email","maria@gmail.com");
		cookies.put("phone","99711122");
		
		cookies.remove("email");
		
		System.out.println("Contem chave phone? " + cookies.containsKey("phone"));
		System.out.println("Número do phone: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Tamanho do Map: " + cookies.size());
		
		
		cookies.put("phone", "99771133");
		System.out.println("Todos os cookies");
		for(String key : cookies.keySet()) {
			System.out.println(key + ": " +cookies.get(key));
		}
		

	}

}
