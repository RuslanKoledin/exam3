import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> toys = new HashMap<>();
        toys.put("Машинка", "1");
        toys.put("мягкая игрушка", "2");
        toys.put("трактор", "3");
        toys.put("телефон", "4");
        toys.put("погремушка", "5");

        entrySet(toys);
        System.out.println();
        keySet(toys);
        System.out.println();
        values(toys);

    }

    static public void entrySet(HashMap<String, String> toys) {
        for(Map.Entry<String, String> entrySet : toys.entrySet()) {
            System.out.println(entrySet);
        }
    }

    static public void keySet(HashMap<String, String> toys) {
        for(Map.Entry<String, String> keySet : toys.entrySet()) {
            System.out.println(keySet.getKey());
        }
    }
    static public void values(HashMap<String, String> toys) {
        for(Map.Entry<String, String> values : toys.entrySet()) {
            System.out.println(values.getValue());
        }


    }

}
