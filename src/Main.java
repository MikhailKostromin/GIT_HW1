import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Напишите программу, которая использует Stream API для обработки списка чисел.
Программа должна вывести на экран среднее значение всех четных чисел в списке.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 8);
        double avr = list.stream()
                .filter(integer -> integer % 2 == 0)
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println("Среднее значение четных чисел: " + avr);
    }
}