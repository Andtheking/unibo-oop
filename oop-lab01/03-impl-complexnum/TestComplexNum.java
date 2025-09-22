class TestComplexNum {
  public static void main(String[] args) {
    /*
      * Testare la classe come segue:
      *
      * 1) Creare il numero complesso 3+5i e memorizzarlo nella variabile c1
      * 
      * 2) Creare il numero complesso 7-4i e memorizzarlo nella variabile c2
      *
      * 3) Creare il numero complesso -2+3i e memorizzarlo nella variabile c3
      *
      * 4) Creare il numero complesso -2+3i e memorizzarlo nella variabile c4
      *
      * 5) Stampare in standard output la rappresentazione testuale di
      * c1,c2,c3,c4 restituita dal metodo toStringRep()
      * 
      * 6) Sommare a c1 c2
      * (somma di due num complessi (a + ib) + (c + id) = (a + c) + i(b + d)
      * 
      * 7) Sommare a c2 c4
      *
      * 8) Stampare nuovamente in standard output la rappresentazione testuale
      * di c1,c2,c3,c4
      * 
      * 9) Controllare se l'output corrisponde a quanto preventivato
      * 
      * 10) Invocare il metodo equal su c3 per tre volte, passando come input
      * c1,c2,c4. Stampare il risultato di ciascuna invocazione in standard
      * output
      * 
      * 11) Controllare se l'output corrisponde a quanto preventivato
    */
    ComplexNum c1 = new ComplexNum();
    c1.build(7, 0);
    ComplexNum c2 = new ComplexNum();
    c2.build(0, -4);
    ComplexNum c3 = new ComplexNum();
    c3.build(-2, 0);
    ComplexNum c4 = new ComplexNum();
    c4.build(0,0);
    /*
     * Print phase
     */
    System.out.println(c1.toStringRep()); // 3+5i
    System.out.println(c2.toStringRep()); // 7-4i
    System.out.println(c3.toStringRep()); // -2+3i
    System.out.println(c4.toStringRep()); // -2+3i
    c1.add(c2); // 3+5i + 7-4i = (3+7) + (5-4)i = 10+1i
    c2.add(c4); // 7-4i + -2+3i = (7-2) + (-4+3)i = 5-1i
    System.out.println(c1.toStringRep());
    System.out.println(c2.toStringRep());
    System.out.println(c3.toStringRep());
    System.out.println(c4.toStringRep());
    System.out.println(c3.equal(c1)); // false
    System.out.println(c3.equal(c2)); // false
    System.out.println(c3.equal(c4)); // true
  }
}
