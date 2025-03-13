import java.util.Scanner;

public class SkillTree {
    public static Axton axton;
    public static Maya maya;
    public static Salvador salvador;
    public static Zero zero;
    public static Gaige gaige;
    public static Kreig kreig;

    public static void main(String[] args) {
        int usrInput = 0;
            System.out.println("************************************************************");
            System.out.println("Welcome to the Borderlands 2 Skill Tree Application!");
            System.out.println("************************************************************");
            System.out.println("Please choose a Vault Hunter to begin.");
            System.err.println("1. Axton");
            System.err.println("2. Maya");
            System.err.println("3. Salvador");
            System.err.println("4. Zer0");
            System.err.println("5. Gaige");
            System.err.println("6. Krieg");
            System.err.println("7. Quit");
            System.out.println("************************************************************");
            System.out.println("Enter the number of the Vault Hunter you would like to choose: ");
            System.out.println("Please enter the level of the Vault Hunter: ");
            System.out.println("************************************************************");
            Scanner scanner = new Scanner(System.in);
            usrInput = scanner.nextInt();
            scanner.nextLine();
            if(usrInput == 7) {
                System.out.println("Goodbye!");
                System.exit(0);
            }
        // chooseVaultHunter(usrInput);

    }

    public static void chooseVaultHunter(int input) {
        Scanner scanner = new Scanner(System.in);
        int level;
        switch (input) {
            case 1:
                System.out.println("You have chosen Axton!");
                chooseVHTree(input);
                System.out.print("What level are you: ");
                level = scanner.nextInt();  
                axton = new Axton(level);
                break;
            case 2:
                System.out.println("You have chosen Maya!");
                chooseVHTree(input);
                System.out.print("What level are you: ");
                level = scanner.nextInt(); 
                maya = new Maya(level);
                break;
            case 3:
                System.out.println("You have chosen Salvador!");
                chooseVHTree(input);
                System.out.print("What level are you: ");
                level = scanner.nextInt(); 
                salvador = new Salvador(level);
                break;
            case 4: 
                System.out.println("You have chosen Zer0!");
                chooseVHTree(input);    
                System.out.print("What level are you: ");
                level = scanner.nextInt(); 
                zero = new Zero(level);
                break;
            case 5:
                System.out.println("You have chosen Gaige!");
                chooseVHTree(input);
                System.out.print("What level are you: ");
                level = scanner.nextInt(); 
                gaige = new Gaige(level);
                break;
            case 6:
                System.out.println("You have chosen Krieg!");
                chooseVHTree(input);
                System.out.print("What level are you: ");
                level = scanner.nextInt(); 
                kreig = new Kreig(level);
                break;
            default:
                break;
        }
    }

    public static void chooseVHTree(int input) {
        Scanner scanner = new Scanner(System.in);
        int treeChoice;

        switch (input) {
            case 1:
                System.out.println("************************************************************");
                System.out.println("Welcome to Axton's Skill Tree!");
                System.out.println("************************************************************");
                System.out.println("Please choose a skill tree to begin.");
                System.err.println("1. Guerrilla");
                System.err.println("2. Gunpowder");
                System.err.println("3. Survival");
                System.err.println("4. Quit");
                System.out.println("************************************************************");
                System.out.print("Enter the number of the skill tree you would like to choose: ");
                treeChoice = scanner.nextInt();
                if(treeChoice == 4) {
                    System.out.println("Goodbye!");
                    System.exit(0);
                }
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5: 

                break;
            case 6:

                break;
        
            default:
                break;
        }
    }

}