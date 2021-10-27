package ru.vsu.sc.uliyanov_n_s;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ArrayUtils {
// Слегка изменнёные утилиты Соломатина
    public static int[] readArrayFromConsole(String text) {
        System.out.print(text);
        Scanner scanner = new Scanner(System.in);
        String s;

        if (scanner.hasNextLine()) {
            s = scanner.nextLine();
        } else {
            System.out.println("Invalid values! Array members must be integers. Try again.");
            return readArrayFromConsole(text);
        }

        return readIntArrayFromString(s);
    }

    private static int[] readIntArrayFromString(String str) {
        Scanner scanner = new Scanner(str);
        scanner.useLocale(Locale.ROOT);
        scanner.useDelimiter("(\\s|[,;])+");
        List<Integer> list = new ArrayList<>();

        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }

        Integer[] arr = list.toArray(new Integer[0]);
        return ArrayUtils.toIntPrimitive(arr);
    }

    private static int[] toIntPrimitive(Integer[] arr) {
        if (arr == null) {
            return null;
        }

        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        return result;
    }

    public static String toString(int[] arr, String itemFormat) {
        if (arr == null) {
            return null;
        }
        if (itemFormat == null || itemFormat.length() == 0) {
            itemFormat = "%s";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(String.format(Locale.ROOT, itemFormat, arr[i]));
        }
        return sb.toString();
    }
}
