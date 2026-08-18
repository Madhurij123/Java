import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		
		Map<String, Integer> stud = new HashMap<>();
		
		stud.put("ABC", 101);
		stud.put("xyz", 98);
		stud.put("mno", 102);
		
		System.out.println(stud.keySet());
	}

}
