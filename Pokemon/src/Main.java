
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pokemon squirtle = new Squirtle("Squirtle", 100, 10, 50);
        Pokemon bulbasaur = new Bulbasaur("Bulbasaur", 100, 10, 100);

        Pokemon player;
        Pokemon computer;

        Scanner scan = new Scanner(System.in);
        System.out.println("Choose your pokemon: (1)Squirtle (2)Bulbasaur");
        int choosePokemon = scan.nextInt();
        switch (choosePokemon) {
            case 1: {
                player = squirtle;
                System.out.print(player.getName() + "(" + player.getHealth() + "/100♥)   ");

                computer = bulbasaur;
                System.out.println(computer.getName() + "(" + computer.getHealth() + "/100♥)");
            }
            break;
            case 2: {
                player = bulbasaur;
                System.out.print(player.getName() + "(" + player.getHealth() + "/100♥)   ");

                computer = squirtle;
                System.out.println(computer.getName() + "(" + computer.getHealth() + "/100♥)");
            }
            break;
            default:
                throw new IllegalArgumentException();
        }

        while (computer.isAlive() && player.isAlive()) {
            System.out.println("Choose attack  (1)  (2)");
            int chooseAttack = scan.nextInt();
            player.fight(chooseAttack, computer);
            System.out.println();
            if (computer.isAlive()) {
                chooseAttack = (int) (Math.random() * 2 + 1);
                System.out.println("Computer playes attack number " + chooseAttack);
                computer.fight(chooseAttack, player);
                System.out.println();
            }
        }
    }
}
