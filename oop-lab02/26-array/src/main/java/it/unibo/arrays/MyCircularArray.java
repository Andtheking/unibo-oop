package it.unibo.arrays;

class MyCircularArray {

    final static int DEFAULT_ARRAY_SIZE = 10;
    final static int EMPTY_ARRAY = -1;

    int[] array;
    int lastIndex;

    MyCircularArray() {
        this(DEFAULT_ARRAY_SIZE);
    }

    MyCircularArray(int size) {
        this.array = new int[size];
        this.lastIndex = EMPTY_ARRAY;
    }

    void add(final int elem) {
        this.lastIndex = (this.lastIndex + 1) % array.length;
        array[lastIndex] = elem;
    }

    void reset() {
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = 0;
        }
        this.lastIndex = EMPTY_ARRAY;
    }

    void printArray() {
        System.out.print("[");
        for (int i = 0; i < this.array.length - 1; i++) {
            System.out.print(this.array[i] + ",");
        }
        System.out.print(this.array[this.array.length - 1] + "]");
    }

    public static void main(final String[] args) {
        // 1) Creare un array circolare di dieci elementi
        MyCircularArray mca = new MyCircularArray();
        // 2) Aggiungere gli elementi da 1 a 10 e stampare il contenuto
        // dell'array circolare
        mca.add(1);
        mca.add(2);
        mca.add(3);
        mca.add(4);
        mca.add(5);
        mca.add(6);
        mca.add(7);
        mca.add(8);
        mca.add(9);
        mca.add(10);
        mca.printArray();
        // 3) Aggiungere gli elementi da 11 a 15 e stampare il contenuto
        // dell'array circolare
        mca.add(11);
        mca.add(12);
        mca.add(13);
        mca.add(14);
        mca.add(15);
        mca.printArray();
        // 4) Invocare il metodo reset
        mca.reset();
        // 5) Stampare il contenuto dell'array circolare
        mca.printArray();
        // 6) Aggiungere altri elementi a piacere e stampare il contenuto
        // dell'array circolare
        mca.add(7);
        mca.add(2);
        mca.add(123);
        mca.printArray();
    }
}
