package ru.vsu.sc.uliyanov_n_s;

public class Sequence {
    public int indexOfFirstMemberOfSequence;
    public int lengthOfSequence;

    public Sequence(int firstMemInd, int seqLength) {
        indexOfFirstMemberOfSequence = firstMemInd;
        lengthOfSequence = seqLength;
    }

    public static void printValuesOfClassSequence(Sequence sequence) {
        System.out.println("Index of first member: " + sequence.indexOfFirstMemberOfSequence +
                ". Value of members in sequence: " + sequence.lengthOfSequence + "\n");
    }
}
