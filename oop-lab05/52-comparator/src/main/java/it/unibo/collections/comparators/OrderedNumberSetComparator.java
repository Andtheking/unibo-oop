package it.unibo.collections.comparators;

import java.util.Comparator;

public class OrderedNumberSetComparator implements Comparator<String> {

    @Override
    public int compare(String arg0, String arg1) {
        return Double.compare(Double.parseDouble(arg0), Double.parseDouble(arg1));
    }
}
