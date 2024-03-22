package collection_;

import java.util.HashMap;
import java.util.Map;


public class MapMain {

	public static void main(String[] args) {

			Map<String, String> map = new HashMap<String, String>();
				
				map.put("book104", "백설공주");
				map.put("book201", "인어공주");
				map.put("book102", "백설공주");
				map.put("book301", "피오나공주");
				map.put("book101", "엄지공주");
				
				System.out.println(map.get("book104"));
				System.out.println(map.get("book201"));
				System.out.println(map.get("book301"));
				System.out.println(map.get("book102"));
				System.out.println(map.get("book101"));

		}
}


