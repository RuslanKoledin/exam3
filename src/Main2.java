import java.util.*;

public class Main2 {
    public static void main(String[] args) {

        System.out.println("Введите числа через пробел : ");
        String numbers = new Scanner(System.in).nextLine();
        Set<String> set = new HashSet<>();
        set.addAll(Arrays.asList(numbers.split(" ")));
        System.out.println(set);
    }

}


