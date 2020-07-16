import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	/*
		 Calculatrice calc = new Calculatrice();

		    
		    
		    System.out.println("Rentrez deux valeurs : ");
		    Scanner sc = new Scanner(System.in);
		    int a = sc.nextInt();
		    int b = sc.nextInt();

		    System.out.println("1) Addition\n2)Soustraction\n3) Multiplication \n4) Division");
		    System.out.println("Choisissez le calcul que vous voulez effectuer par son numero : ");
		    Scanner sca = new Scanner(System.in); 
		    int op = sca.nextInt();

		    if (op == 1 ){
		        System.out.println(calc.add(a, b));
		       
		    }
		    else if (op == 2 ){
		    	System.out.println(calc.sub(a, b));
		    }
		    else if (op == 3 ){
		    	System.out.println(calc.mul(a, b));
		    }
		    else if (op == 4 ){
		    	System.out.println(calc.div(a, b));
		    }
		    else {
		        System.out.println("Cette operation n'est pas disponible");
		    }
		    
		*/
		    
		
		CalculatriceTest test = new CalculatriceTest();
		test.testAdd();
		test.testSub();
		test.testMul();
		test.testDiv();
		

	}

}
