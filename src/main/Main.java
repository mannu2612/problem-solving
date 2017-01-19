package main;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Main {

	public static void main(String[] args) throws IOException {
		
		InputStream fileInput = Main.class.getResourceAsStream("/test.properties");
		Properties properties = new Properties();
		properties.load(fileInput);
		Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
		fileInput.close();
		
		for(Object key: properties.keySet()){
			String [] propertyValues = properties.get(key).toString().split(",");
			List<Integer> listOfNumbers = new ArrayList<>();
			for(String value : propertyValues){
				listOfNumbers.add(Integer.parseInt(value));
			}
			map.put(key.toString(), listOfNumbers);
		}
		Fizzbuzz fizzbuzz = new Fizzbuzz();
		fizzbuzz.print(map);
	}


}