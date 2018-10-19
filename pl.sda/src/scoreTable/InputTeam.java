package scoreTable;


import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 19.10.2018
 **/
public class InputTeam {
    public void inputTeam(){
        List<Team> team = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);



        System.out.println("Podaj nazwę drużyny");
        System.out.println("Jeżeli chcesz zakończyć wpisz: koniec");
        System.out.println("-----------------------------------------------");


        do {

            team.add(new Team(scanner.nextLine()));
        }while(!scanner.nextLine().equals("koniec"));
    }
}
