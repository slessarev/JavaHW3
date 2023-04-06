import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class task2 {
    
    static void removeIntegers(List<String> strings) {
        // TODO: 31.03.2023 Удалить строки, которые являются целыми числами
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            try {
                Integer.parseInt(string);
                iterator.remove();
            } catch (NumberFormatException e) {
                // строка не является целым числом, продолжаем
            }
        }
    }
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("my_string");
        strings.add("17.4");
        removeIntegers(strings);
        System.out.println(strings); // [string, my_string, 17.4]
    }
}
