class TestStudent {

    public static void main(String[] args) {
		String[] n = {"Alex", "Angel", "Andrea"};
		String[] c = {"Balducci", "Bianchi", "Bracci"};
		int[] m = {1015, 1016, 1017};
		int[] y = {2019, 2018, 2017};
	    
		for (int i = 0; i < n.length; i++) {
			Student someone = new Student();
			someone.build(n[i], c[i], m[i], y[i]);
   			someone.printStudentInfo();
		}
    }
}
