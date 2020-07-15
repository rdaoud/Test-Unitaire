public class Test {
	
	public void testAdd() {
		Calculatrice calc = new Calculatrice();
		int a, b, resultat; 
		a = 2; 
		b = 10;
		resultat = a+b;

		if (calc.add(a,b) != resultat) {
			System.out.println("Erreur");
		}
		else {
			System.out.println("It works !");
		}
	}
	
	public void testSub() {
		Calculatrice calc = new Calculatrice();
		int a, b, resultat; 
		a = 2; 
		b = 10;
		resultat = a-b;

		if (calc.sub(a,b) != resultat) {
			System.out.println("Erreur");
		}
		else {
			System.out.println("It works !");
		}
	}

	public void testMul() {
		Calculatrice calc = new Calculatrice();
		int a, b, resultat; 
		a = 2; 
		b = 10;
		resultat = a*b;

		if (calc.mul(a,b) != resultat) {
			System.out.println("Erreur");
		}
		else {
			System.out.println("It works !");
		}
	}

	public void testDiv() {
		Calculatrice calc = new Calculatrice();
		int a, b, resultat; 
		a = 2; 
		b = 10;
		resultat = a/b;

		if (calc.div(a,b) != resultat) {
			System.out.println("Erreur");
		}
		else {
			System.out.println("It works !");
		}
	}

}
