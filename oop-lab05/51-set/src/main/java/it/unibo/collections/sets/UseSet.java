package it.unibo.collections.sets;

import java.util.TreeSet;
import java.util.Iterator;
/**
 * Example class using {@link java.util.Set}.
 *
 */
public final class UseSet {

    private static final int ELEMS = 20;
    private static final String SEPARATOR = " ";

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection", write a program which, in
         * order:
         *
         * 1) Builds a TreeSet containing Strings
         */
        TreeSet<String> treeSet1 = new TreeSet<>();
        /*
         * 2) Populates such Collection with all the Strings representing numbers ranging from "1" to
         * "20" (both included)
         */
        for (int i = 0; i < ELEMS; i++) {
            treeSet1.add(""+(i+1));
        }
        /*
         * 3) Prints its content
         */
        System.out.println(treeSet1);
        /*
         * 4) Removes all those strings whose represented number is divisible by three.
         * Note: the method removeIf(Predicate) is not allowed.
         */

        Iterator<String> treeSetIterator = treeSet1.iterator();
        while (treeSetIterator.hasNext()) {
            String string = treeSetIterator.next();
            if (Integer.parseInt(string) % 3 == 0) {
                treeSetIterator.remove();
            }
        }
        /*
         * 5) Prints the content of the Set using a for-each construct
         */
        StringBuilder sb = new StringBuilder();
        for (String string : treeSet1) {
            sb.append(string);
            sb.append(SEPARATOR);
        }
        System.out.println(sb);
        /*
         * 6) Verifies whether all the numbers left in the set are even
         */
        boolean areAllEven = true;
        for (String string : treeSet1) {
            if (Integer.parseInt(string) % 2 == 0) {
                areAllEven = false;
            }
        }
        System.out.println("Are all numbers in Set even? " + areAllEven);
    }
}
