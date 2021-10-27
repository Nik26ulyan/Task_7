package ru.vsu.sc.uliyanov_n_s;

public class Main {

    public static void main(String[] args) {
        Test.testProgram();
        int[] arr = ArrayUtils.readArrayFromConsole("Enter an integer array: ");
        Sequence result = getSeq(arr);
        Sequence.printValuesOfClassSequence(result);
    }

    public static Sequence getSeq(int[] arr) {
        int tmpLength = 0;
        int maxLength = 0;
        int firstMemberIndex = -1;
        boolean recSeqVal = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if (isTrueSeq(arr[i], arr[i + 1])) {
                tmpLength++;
                recSeqVal = true;
            } else if (tmpLength >= maxLength) {
                    maxLength = tmpLength;
                    firstMemberIndex = i - tmpLength;
                    tmpLength = 0;
                    recSeqVal = false;
            }
        }
        if (recSeqVal && tmpLength >= maxLength + 1) {
            firstMemberIndex = arr.length - tmpLength - 1;
            maxLength = tmpLength + 1;
        }

        return new Sequence(firstMemberIndex, maxLength);
    }

    private static boolean isTrueSeq(int a, int b) {
        if (Math.abs(a) % 2 == 0)
            return Math.abs(b) % 2 != 0;
        if (Math.abs(b) % 2 == 0)
            return Math.abs(a) % 2 != 0;
        return false;
    }
}
