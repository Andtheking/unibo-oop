class TestComplexNumCalculator {
  public static void main(String[] args) {
      /*
       * 1) Testare la classe ComplexNumCalculator con le seguenti operazioni
       *    tra numeri complessi:
       *
       * - add(1+2i, 2+3i) = 3+5i
       *
       * - sub(4+5i, 6+7i) = -2-2i
       *
       * - mul(8+2i, 3-i) = 26 - 2i
       *
       * - ... altre a piacere
       *
       * 2) Verificare il corretto valore dei campi nOpDone, lastRes
       *
       * 3) Fare altre prove con operazioni a piacere
       */
      ComplexNumCalculator cnc = new ComplexNumCalculator();
      cnc.build();
      /*
       * Create complex numbers
       */
      ComplexNum c1 = new ComplexNum();
      c1.build(1,2);
      ComplexNum c2 = new ComplexNum();
      c2.build(2,3);
      ComplexNum c3 = new ComplexNum();
      c3.build(4,5);
      ComplexNum c4 = new ComplexNum();
      c4.build(6,7);
      ComplexNum c5 = new ComplexNum();
      c5.build(8,2);
      ComplexNum c6 = new ComplexNum();
      c6.build(3,-1);
      /*
       * Test operations
       */
      ComplexNum r1 = cnc.add(c1, c2);
      ComplexNum r2 = cnc.sub(c3, c4);
      ComplexNum r3 = cnc.mul(c5, c6);
      System.out.println(r1.toStringRep());
      System.out.println(r2.toStringRep());
      System.out.println(r3.toStringRep());
      // Print detail variables
      System.out.println("Numero operazioni: "+cnc.nOpDone+", ultimo risultato: "+cnc.lastRes.toStringRep());
  }
}
