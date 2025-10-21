package it.unibo.collections.comparators;

import java.util.TreeSet;

/**
 * 
 */
public final class UseSetWithOrder {
    static final int ELEMS = 100;

    private UseSetWithOrder() {
    }

    /**
     * @param s
     *            ignored
     */
    public static void main(final String[] s) {

        /*
         * Write a program which:
         * 
         * 1) Creates a new ORDERED TreeSet of Strings.
         * To order the set, define a new Comparator in a separate class.
         * The comparator must convert the strings to double, then compare the doubles to find the biggest.
         * The comparator does not need to deal with the case of Strings which are not parseable as doubles.
         */
        TreeSet<String> orderedTreeSet = new TreeSet<>(new OrderedNumberSetComparator());
        /*
         * 2) Inserts in the set a hundred strings containing randomly generated numbers
         * (use Math.random(), and convert to String appropriately)
         */
        for (int i = 0; i < ELEMS; i++) {
            orderedTreeSet.add(Double.toString(Math.random()));
        }
        /*
         * 3) Prints the set, which must be ordered
         */
        System.out.println(orderedTreeSet);
    }
}
