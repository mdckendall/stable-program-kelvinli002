import java.util.Scanner;

class Main {
  public static void main(String[] args) {
	  Stable s = new Stable("placeholder");
    
		System.out.println("What is the address of the stable?");
		Scanner scanner = new Scanner(System.in);
		s.address = scanner.nextLine();
    System.out.println("(debug) You have entered " + s.address);
    
		do {
			System.out.println("Do you wish to add a horse to the stable? y = YES, n = NO"); 
			char input = scanner.next().charAt(0);
			scanner.nextLine();
      
			if(input == 'y') {
				System.out.println("What is the name of the horse?");
				String hn = scanner.nextLine();
        System.out.println("(debug) You have entered " + hn);
        
				System.out.println("What is the weight of the horse?");
				double w = scanner.nextDouble();
        System.out.println("(debug) You have entered " + w);
        
				System.out.println("Enter true if the horse is tame or false if it is not.");
				boolean t = scanner.nextBoolean();
        System.out.println("(debug) You have entered " + t);
        
				Horse h = new Horse(hn, w, t);
				s.horseList.add(h);
			}
			else if (input == 'n') {
        System.out.println("(debug) Exiting loop...");
				break;
			}
      else {
        System.out.println("Invalid input, try again...");
      }      
		} while(true);
    
		System.out.println("(debug) Displaying info in arraylist...");
    for (int i = 0; i < s.horseList.size(); i++) {
      System.out.println("Horse #" + (i+1) + " " + s.horseList.get(i));      
    }
  }
}