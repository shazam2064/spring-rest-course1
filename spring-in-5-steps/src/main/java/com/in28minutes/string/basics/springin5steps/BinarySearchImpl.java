package com.in28minutes.string.basics.springin5steps;

public class BinarySearchImpl implements SortAlgorithm {

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        super();
        this.sortAlgorithm = sortAlgorithm;
    }

    private SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers, int numberToSearchFor) {

        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);

        return 3;

    }

    @Override
    public int[] sort(int[] numbers) {
        return new int[0];
    }
}

