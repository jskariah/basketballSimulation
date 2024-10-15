import java.util.Scanner;
public class App {
public static void main(String[] args) throws Exception {
Scanner scanner = new Scanner(System.in);
String[] teams = {"Atlanta Hawks","Boston Celtics","Brooklyn Nets","Charlotte Hornets","Chicago Bulls","Cleveland Cavaliers","Dallas Mavericks","Detroit Pistons","Golden State Warriors","Houston Rockets","Indiana Pacers","LA Clippers","Los Angeles Lakers",
"Memphis Grizzlies","Miami Heat","Milwaukee Bucks","Minnesota Timberwolves","New Orleans Pelicans","New York Knicks","Oklahoma City Thunder","Orlando Magic","Philadelphia 76ers","Phoenix Suns","Portland Trail Blazers","Sacramento Kings",
"San Antonio Spurs","Toronto Raptors","Utah Jazz","Washington Wizards"};
Simulation player = new Simulation();
  System.out.println("Basketball Career Simulator");
  System.out.println("---------------------------"); 
  System.out.print("Name: ");
  String name = scanner.nextLine();
  System.out.print("What College Did You Attend: ");
  String college = scanner.nextLine();
  System.out.print("Position (PG, SG, SF, PF, C): ");
  String collegePosition = scanner.nextLine();
  player.changePosition(collegePosition);
  System.out.print("Enter college points per game: ");
  double collegePPG = scanner.nextDouble();
  player.changePoints(collegePPG);
  System.out.print("Enter college assists per game: ");
  double collegeAPG = scanner.nextDouble();
  player.changeAssists(collegeAPG);
  System.out.print("Enter college rebounds per game: ");
  double collegeRPG = scanner.nextDouble();
  player.changeRebounds(collegeRPG);
  System.out.print("Enter age: ");
  int age = scanner.nextInt();
  player.simulateDraft();
  System.out.println("Welcome to the 2024 NBA Draft");
  System.out.println("With the " + player.getDraftPick() + " pick in the 2024 NBA Draft, the " + teams[(int)(Math.random()*29) + 1] + " select "  + name + " from " + college +".");
  System.out.println("The season has begun!");
  
  










  }
}
