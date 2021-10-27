package ru.vsu.sc.uliyanov_n_s;

public class Test {
    public static void testProgram() {
        int[] arr1 = {1, 2, -2, 1, 10, 3, 105, 4, -5, 4, 10, 1, 1, 3, 4, 7, 12, 10};
        Sequence sequence1 = Main.getSeq(arr1);
        System.out.println("Tested array: " + ArrayUtils.toString(arr1, "%s"));
        Sequence.printValuesOfClassSequence(sequence1);

        int [] arr2 = {3, 2, 3, 2, 3, 2, 3, 2, 3};
        Sequence sequence2 = Main.getSeq(arr2);
        System.out.println("Tested array: " + ArrayUtils.toString(arr2, "%s"));
        Sequence.printValuesOfClassSequence(sequence2);


        int [] arr3 = {6, 3, 8, 12, 54, 3, 32, 43, 2};
        Sequence sequence3 = Main.getSeq(arr3);
        System.out.println("Tested array: " + ArrayUtils.toString(arr3, "%s"));
        Sequence.printValuesOfClassSequence(sequence3);

        int [] arr4 = {1, 2, 7, 12, 2, 7, 2, 3, 4, 5, 12, 7, 8};
        Sequence sequence4 = Main.getSeq(arr4);
        System.out.println("Tested array: " + ArrayUtils.toString(arr4, "%s"));
        Sequence.printValuesOfClassSequence(sequence4);

        int [] arr5 = {4, 5, 3, 3, 7, 3, 3, 7, 6, 4, 6, 7, 7, 7, 7, 1};
        Sequence sequence5 = Main.getSeq(arr5);
        System.out.println("Tested array: " + ArrayUtils.toString(arr5, "%s"));
        Sequence.printValuesOfClassSequence(sequence5);

        int [] arr6 = {5, 1, 3, 1, 3, 5, 1, 5, 3, 7, 8, 8, 9, 8, 8, 5, 1};
        Sequence sequence6 = Main.getSeq(arr6);
        System.out.println("Tested array: " + ArrayUtils.toString(arr6, "%s"));
        Sequence.printValuesOfClassSequence(sequence6);

        int [] arr7 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        Sequence sequence7 = Main.getSeq(arr7);
        System.out.println("Tested array: " + ArrayUtils.toString(arr7, "%s"));
        Sequence.printValuesOfClassSequence(sequence7);

        int [] arr8 = {7, 3, 4 };
        Sequence sequence8 = Main.getSeq(arr8);
        System.out.println("Tested array: " + ArrayUtils.toString(arr8, "%s"));
        Sequence.printValuesOfClassSequence(sequence8);

        int [] arr9 = {1, 4, 2, 5, 8, 4, 1, 3 };
        Sequence sequence9 = Main.getSeq(arr9);
        System.out.println("Tested array: " + ArrayUtils.toString(arr9, "%s"));
        Sequence.printValuesOfClassSequence(sequence9);

        int [] arr10 = {1, 3, -2, 11, 7, 3, 3, 2, 4, 2, 7, 12};
        Sequence sequence10 = Main.getSeq(arr10);
        System.out.println("Tested array: " + ArrayUtils.toString(arr10, "%s"));
        Sequence.printValuesOfClassSequence(sequence10);
    }
}
