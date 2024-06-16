package Examples;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        
        // Put elements into the map
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);
        
        // Get an element from the map
        System.out.println("Apple: " + map.get("Apple"));  // Outputs: Apple: 10 
        
        // Check if a key exists
        if (map.containsKey("Banana")) {
            System.out.println("Banana exists in the map.");
        }
        
        // Remove an element from the map
        map.remove("Cherry");
        
        // Get the size of the map
        System.out.println("Size of map: " + map.size());  // Outputs: Size of map: 2
        
        // Iterate over the map
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
