package src;

import java.util.Scanner;

public class MenuApp {

  static Scanner s = new Scanner(System.in);

  public static void main() {

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
          // showTeamMember(team);
      } else if (decision == 3) {
          // addTeamMember(team);
      } else if (decision == 4) {
          // deleteTeamMember(team);
      } else {
          // deleteAllTeamMembers(team);
      }

      }

    }

  // private static void deleteAllTeamMembers(String[] team) {
  // }

  // private static void deleteTeamMember(String[] team) {
  // }

  // private static void addTeamMember(String[] team) {
  // }

  // private static void showTeamMember(String[] team) {
  // }

  private static void showTeam(String[] team) {
    System.out.println("Team:");
    for (int i = 0; i < team.length; i++) {
      System.out.println(i + ": " + team[i]);
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



