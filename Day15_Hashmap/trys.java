package Day15_HashMap;


import java.util.ArrayList;
import java.util.HashMap;

public class trys {
    public static void main(String[] args) {
        // Create an ArrayList of HashMaps (key: Integer, value: String)
        ArrayList<HashMap<Integer, String>> list = new ArrayList<>();

        // First HashMap
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Apple");
        map1.put(2, "Banana");

        // Second HashMap
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(3, "Carrot");
        map2.put(4, "Dragonfruit");

        // Add both maps to the list
        list.add(map1);
        list.add(map2);

        // Loop through the list and print each map's entries
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Map " + (i + 1) + ":");
            HashMap<Integer, String> map = list.get(i);
            for (Integer key : map.keySet()) {
                System.out.println("Key: " + key + ", Value: " + map.get(key));
            }
            System.out.println("-----");
        }
    }
}
