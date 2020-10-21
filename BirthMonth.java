package BirthMonth;

import java.util.Scanner;

public class BirthMonth {

	public static void main(String[] args) {
		System.out.println("Welcome to Guess Your Birth Month :]");
		String set1 =
				" 1 3 5\n" +
						" 7 9 11\n";
		String set2 =
				" 2 3 6\n" +
						" 7 10 11\n";
		String set3 =
				" 4 5 6\n" +
						" 7 12\n";
		String set4 =
				" 8 9 10\n" +
						" 11 12\n";
		int month = 0;

		Scanner input = new Scanner(System.in);

		// Prompt user to answer questions
		System.out.print("Is your birth month in Set1?\n");
		System.out.print(set1);
		System.out.print("\nEnter N for No and Y for Yes: ");
		//https://tutorialspoint.dev/language/java/gfact-51-java-scanner-nextchar
		String userAnswer = input.next();

		if (userAnswer.equals("Y")) {
			month += 1;
		}


		System.out.print("\nIs your birth month in Set2?\n");
		System.out.print(set2);
		System.out.print("\nEnter N for No and Y for Yes: ");
		
		String userAnswer1 = input.next();

		if (userAnswer1.equals("Y")) {
			month += 2;
		}
		
		System.out.print("Is your birth month in Set3?\n");
		System.out.print(set3);
		System.out.print("\nEnter N for No and Y for Yes: ");
		
		String userAnswer2 = input.next();

		if (userAnswer2.equals("Y")) {
			month += 4;
		}

		
		System.out.print("\nIs your birth month in Set4?\n");
		System.out.print(set4);
		System.out.print("\nEnter N for No and Y for Yes: ");
		
		String userAnswer3 = input.next();

		if (userAnswer3.equals("Y")) {
			month += 8;
		}
		System.out.println("\nYour birth month is " + month + ".");
		switch (month) {
		case 1: System.out.println("You were born in January!");
		System.out.println("Your birthstone is garnet - a typically red gem."
				+ "\nYour birth month flowers are carnation and snow drop.");
		break;
		case 2: System.out.println("You were born in February!");
		System.out.println("Your birthstone is amethyst - the world's most popular purple gem!"
				+ "\nYour birth month flowers are violet and primrose.");
		break;
		case 3: System.out.println("You were born in March!"); 
		System.out.println("Your birthstones are aquamarine - a blue variety of the beryl mineral,"
				+ " and bloodstone - an opaque gem marked in greens with red splashes." + 
				"\nYour birth month flowers are daffodil and jonquil.");
		break;
		case 4: System.out.println("You were born in April!");
		System.out.println("Your birthstone is diamond - the world's most popular and expensive gem!" 
				+ "\nYour birth month flowers are daisy and sweet pea.");
		break;
		case 5: System.out.println("You were born in May!");
		System.out.println("Your birth month is emerald - a popular green gem."
				+ "\nYour birth month flowers are lily of the valley and hawthorn.");
		break;
		case 6: System.out.println("You were born in June!");
		System.out.println("Your birthstones are pearl - an organic gem, alexandrite - a color-change "
				+ "variety of chrysoberyl, and moonstone - \na feldspar mineral that are"
				+ " typically white or gray with a silvery glow." 
				+ "\nYour birth month flowers are rose and honeysuckle.");
		break;	
		case 7: System.out.println("You were born in July!");
		System.out.println("Your birthstone is ruby - the most popular red gem."
				+ "\nYour birth month flowers are larkspur and water lily.");
		break;
		case 8: System.out.println("You were born in August!");
		System.out.println("Your birthstones are peridot - a popular and affordable green gem, spinel - "
				+ "a mineral with a \nvariety of color such as"
				+ " reds and blues, and sardonyx - a gem with parallel bands in white, orange, red chlalcedony."
				+ "\nYour birth month flowers are gladiolus and poppy.");
		break;
		case 9: System.out.println("You were born in September!");
		System.out.println("Your birthstone is sapphire - a typically blue gem." 
				+ "\nYour birth month flowers are aster and morning glory.");
		break;
		case 10:System.out.println("You were born in October!");
		System.out.println("Your birthstones are opal - referred by some as the world's most colorful gem, "
				+ "and tourmaline - a gem with a variety of colors "
				+ "such as green and pink."
				+ "\nYour birth month flowers are marigold and cosmos.");
		break;
		case 11: System.out.println("You were born in November!");
		System.out.println("Your birthstones are topaz - a gem colored yellow, blue, orange, or even brown,"
				+ " and citrine - the world's best selling gem with a"
				+ " yellow to orange color."
				+ "\nYour birth month flower is chrysanthemum.");
		break;
		case 12: System.out.println("You were born in December!");
		System.out.println("Your birthstones are turquoise - a blue or blue green mineral, "
				+ "zircon - a bright gem \nwith high luster and many color options, "
				+ "and tanzanite - a blue to bluish purple colored gem."
				+ "\nYour birth month flowers are narcissus and holy.");
		}
		
		System.out.println("\nWelcome to Guess Your Birthday (Day Only Sorry) o~o");
		String set5 =
				" 1 3 5 7\n" +
						" 9 11 13 15\n" +
						"17 19 21 23\n" +
						"25 27 29 31";

		String set6 =
				" 2 3 6 7\n" +
						"10 11 14 15\n" +
						"18 19 22 23\n" +
						"26 27 30 31";

		String set7 =
				" 4 5 6 7\n" +
						"12 13 14 15\n" +
						"20 21 22 23\n" +
						"28 29 30 31";

		String set8 =
				" 8 9 10 11\n" +
						"12 13 14 15\n" +
						"24 25 26 27\n" +
						"28 29 30 31";

		String set9 =
				"16 17 18 19\n" + "20 21 22 23\n" +
						"24 25 26 27\n" +
						"28 29 30 31";

		int day = 0;

		// Create a Scanner
		Scanner input1 = new Scanner(System.in);

		// Prompt the user to answer questions
		System.out.print("Is your birthday in Set5?\n");
		System.out.print(set5);
		//System.out.print("\nEnter 0 for No and 1 for Yes: ");// mod to accept char
		System.out.print("\nEnter N for No and Y for Yes: ");
		String answer = input1.next();

		if (answer.equals("Y")) {
			day += 1;
		}


		System.out.print("\nIs your birthday in Set6?\n");
		System.out.print(set6);
		System.out.print("\nEnter N for No and Y for Yes: ");
		
		String answer1 = input1.next();

		if (answer1.equals("Y")) {
			day += 2;
		}
	
		System.out.print("\nIs your birthday in Set7?\n");
		System.out.print(set7);
		System.out.print("\nEnter N for No and Y for Yes: ");
	
		String answer2 = input1.next();

		if (answer2.equals("Y")) {
			day += 4;
		}
		
		System.out.print("\nIs your birthday in Set8?\n");
		System.out.print(set8);
		System.out.print("\nEnter N for No and Y for Yes: ");
		
		String answer3 = input1.next();

		if (answer3.equals("Y")) {
			day += 8;
		}
	
		System.out.print("\nIs your birthday in Set9?\n");
		System.out.print(set9);
		System.out.print("\nEnter N for No and Y for Yes: ");
		String answer4 = input1.next();

		if (answer4.equals("Y")) {
			day += 16;
		}
		System.out.println("\nYour birthday is " + day + "!");
		System.out.println("You were born on " + month + "/" + day + "!");
		input.close();  

	}
}

