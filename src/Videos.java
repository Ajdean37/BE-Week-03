package src;

import java.util.Scanner;

public class Videos {

  static Scanner s = new Scanner(System.in);
  static int addingIndex = 0;
  
  public static void main(String[] args) {
    
    //ARRAYS

    String studentName1 = "John Doe";
    String studentName2 = "Jane Doe";
    String studentName3 = "Joe Doe";

    System.out.println(studentName1);
    System.out.println(studentName2);
    System.out.println(studentName3);

    String[] students = new String[3];

    students[0] = "John Doe";
    students[1] = "Jane Doe";
    students[2] = "Joe Doe";

    System.out.println(students[0]);
    System.out.println(students[1]);
    System.out.println(students[2]);

    for (int i = 0; i < students.length; i++) {
      System.out.println(students[i]);
    }

    System.out.println("Enhanced for loop:");

    for (String student : students) {
      System.out.println(student);
    }

    String[] products = new String[5];

    products[0] = "Carrots";
    products[1] = "Pineapples";
    products[2] = "Tomatoes";
    products[3] = "Potatoes";
    products[4] = "Cereal";

    for (String product : products) {
      System.out.println("Product: " + product);
    }

    int[] multiplesOf3 = new int[10];

    for (int i = 1; i <= multiplesOf3.length; i++) {
      multiplesOf3[i - 1] = i * 3;
      System.out.println("number: " + multiplesOf3[i -1]);
    }

    int[] multiplesOf5 = new int[10];

    for (int i = 0; i < multiplesOf5.length; i++) {
      multiplesOf5[i] = (i + 1) * 5;
      System.out.println(multiplesOf5[i]);
    }

    //METHODS

    String firstName = "John";
    String lastName = "Doe";
    String fullName = createFullName(firstName, lastName);
    String fullName2 = createFullName("Jane", lastName);

    System.out.println(fullName);
    System.out.println(fullName2);

    int[] myArray = new int[3];

    myArray[0]= 7;
    myArray[1]= 10;
    myArray[2]= 8;

    System.out.println(sumArray(myArray));

    double[] grades = new double[5];

    grades[0] = 88.7;
    grades[1] = 92.5;
    grades[2] = 100;
    grades[3] = 67.3;
    grades[4] = 78.9;

    System.out.println(calculateAverage(grades));

    System.out.println(multiplyString("Hello", 3));

    //OBJECTS
    

    String name = "Amanda Dean";
    System.out.println(name.length());
    System.out.println(name.charAt(8));

    int[] numbers = new int[3];
    System.out.println(numbers.length);

    //EQUALITY

    String a = new String("Hello");
    String b = new String("Hello");

    System.out.println(a);
    System.out.println(b);
    System.out.println(a == b); // false because using new keyword
    System.out.println(a.equals(b));

    
    int x = 5;
    int y = 5;

    System.out.println(x);
    System.out.println(y);
    System.out.println(x == y);

    String c = new String("Hello");
    String d = c;

    System.out.println(c == d);

    String[] team = new String[5];
    int decision = 0;

    while(decision != -1) {
      showMenu();
      decision = s.nextInt();

      if (decision < -1 || decision > 5) {
          System.out.println("Please pick a valid option");
      } else if (decision == 1) {
          showTeam(team);
      } else if (decision == 2) {
          showTeamMember(team);
      } else if (decision == 3) {
          addTeamMember(team);
      } else if (decision == 4) {
          deleteTeamMember(team);
      } else {
          deleteAllTeamMembers(team);
      }

    }


  }
  // Methods

  public static String createFullName(String x, String y) {
    return x + " " + y;
  }
  
  public static int sumArray(int[] numbers) {
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    return sum;
  }

  public static double calculateAverage(double[] numbers) {
    double sum = 0;
    for (double number : numbers) {
      sum += number;
    }
    return sum / numbers.length;
  }

  public static String multiplyString(String str, int num) {
    String result = "";
    for (int i = 0; i < num; i++) {
      result += str;
    }
    return result;
  }

  private static void deleteAllTeamMembers(String[] team) {
    for (int i = 0; i < team.length; i++) {
      team[i] = null;
    }
  }

  private static void deleteTeamMember(String[] team) {
    System.out.print("Which team member would you like to delete?");
    int memberToDelete = s.nextInt();
    if ( isValid(memberToDelete)) {
      team[memberToDelete] = null;
    }
  }

  private static void addTeamMember(String[] team) {
    System.out.print("Enter new member name: ");
    String newMember = s.next();

    if (isValid(addingIndex)) {
     team[addingIndex++] = newMember;
    }
  }

  private static void showTeamMember(String[] team) {
    System.out.print("Which team member would you like to see? ");
    int teamNumber = s.nextInt();

    if (isValid(teamNumber)) {
      System.out.println(teamNumber + ": " + team);
    }
  }

  private static void showTeam(String[] team) {
    System.out.println("Team:");
    for (int i = 0; i < team.length; i++) {
      System.out.println(i + ": " + team[i]);
    }
  }

  public static boolean isValid(int input) {
    if (input >= 0 && input < 5) {
      return true;
    } else {
      System.out.println("Invalid entry");
      return false;
    }
  }
  
  public static void showMenu() {
    System.out.println("Please pick an option or enter -1 to exit");
    System.out.println("1) Show Team");
    System.out.println("2) Show Team Member");
    System.out.println("3) Add Team Member");
    System.out.println("4) Delete Team Member");
    System.out.println("5) Delete All Team Members");
  }
  
}
