import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        String text = "But good morning! Good morning to ye and thou! " +
                "I’d say to all my patients, because I was the worse of the hypocrites, " +
                "of all the hypocrites, the cruel and phony hypocrites, I was the very worst.";
        text = text.replaceAll("[!,.]", "");
        List<String> textList = new ArrayList<>(List.of(text.split(" ")));

        task1(nums);
        task1WithStream(nums);

        task2(nums);
        task2WithStream(nums);

        task3(textList);

        task4(textList);
        task4WithStream(textList);


    }

    private static void task4WithStream(List<String> textList) {
        System.out.println("Task 4 func:");

        Set<String> textSet = new HashSet<>(textList);
        System.out.println(textSet.stream()
                .map(string -> Collections.frequency(textList, string))
                .collect(Collectors.toList()));
        System.out.println();
    }

    private static void task4(List<String> textList) {
        System.out.println("Task 4:");

        Set<String> textSet = new HashSet<>(textList);
        List<Integer> nOfOccurrences = new ArrayList<>();
        for (String string : textSet) {
            int occ = Collections.frequency(textList, string);
            nOfOccurrences.add(occ);
        }
        System.out.println(nOfOccurrences);
        System.out.println();
    }

    private static void task3(List<String> textList) {
        System.out.println("Task 3:");
        Set<String> textSet = new HashSet<>(textList);
        System.out.println(textSet);
        System.out.println();
    }

    private static void task2WithStream(List<Integer> nums) {
        System.out.println("Task 2 func:");
        Set<Integer> numsTreeSet = new TreeSet<>(nums);
        numsTreeSet.stream().filter(num -> num % 2 == 0).forEach(System.out::println);
        System.out.println();
    }

    private static void task2(List<Integer> nums) {
        System.out.println("Task 2:");
        Set<Integer> numsTreeSet = new TreeSet<>(nums);
        for (Integer num : numsTreeSet) {
            if (num % 2 == 0)
                System.out.println(num);
        }
        System.out.println();
    }

    private static void task1WithStream(List<Integer> nums) {
        System.out.println("Task 1 func:");
        nums.stream().filter(num -> num % 2 != 0).forEach(System.out::println);
        System.out.println();
    }

    private static void task1(List<Integer> nums) {
        System.out.println("Task 1:");
        for (Integer num : nums) {
            if (num % 2 != 0)
                System.out.println(num);
        }
        System.out.println();
    }
}