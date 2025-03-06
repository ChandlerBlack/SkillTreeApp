
import java.util.Scanner;

/**
 * This whole project is a simple skill tree application that allows users to create a skill tree and add skills to it.
 * for Borderland 2.
 * 
 * There is a class for each Vault Hunter and within that class 
 * are the skill trees for that Vault Hunter.
 * In these classes the necessary methods are implemented to add skills to the skill tree.
 * 
 * 
 * In the Driver class, the user is able to choose a Vault Hunter and add skills to the skill tree.
 * It will also display the skill tree and the skills that have been added as well as the total percentage 
 * changes of the stats that the skills effect.
 * 
 * 
 * 
 * Version 1.0 needs
 *  - Basic implementation of the skill tree application.
 *  - Text based interface through the console.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * @author ChandlerBlack
 * @version 0.1
 * @since 2021-09-27
 */

/**
 * This is the main driver class for the application.
 */
public class SkillTree {
    public static void main(String[] args) {
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

        // Scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        int vaultHunter = scanner.nextInt();
        int level = scanner.nextInt();
        scanner.nextLine();

        // Switch statement to choose the Vault Hunter
        switch (vaultHunter) {
            case 1: // axton
                Axton axton = new Axton(level);
                System.out.println("You have chosen Axton!");
                System.out.println("************************************************************");
                System.out.println("Please choose a skill tree to begin.");
                System.err.println("1. Guerrilla");
                System.err.println("2. Gunpowder");
                System.err.println("3. Survival");
                System.err.println("4. Quit");
                System.out.println("************************************************************");
                System.out.println("Enter the number of the skill tree you would like to choose: ");
                int skillTree = scanner.nextInt();
                scanner.nextLine();
                switch (skillTree) {
                    case 1:
                        System.out.println("You have chosen the Guerrilla skill tree!");
                        System.out.println("************************************************************");
                        System.out.println("Please choose a skill to begin.");
                        System.err.println("1. Sentry");
                        System.err.println("2. Ready");
                        System.err.println("3. Willing");
                        System.err.println("4. Onslaught");
                        System.err.println("5. Scorched Earth");
                        System.err.println("6. Double Up");
                        System.err.println("7. Quit");
                        System.out.println("************************************************************");
                        System.out.println("Enter the number of the skill you would like to choose: ");
                        int skill = scanner.nextInt();
                        scanner.nextLine();
                        switch (skill) {
                            case 1:
                                axton.increaceSkill("guerilla", "Sentry");
                                axton.printSkillTrees();
                                break;
                            case 2:
                                axton.increaceSkill("guerilla", "Ready");
                                axton.printSkillTrees();
                                break;
                            case 3:
                                axton.increaceSkill("guerilla", "Willing");
                                axton.printSkillTrees();
                                break;
                            case 4:
                                axton.increaceSkill("guerilla", "Onslaught");
                                axton.printSkillTrees();
                                break;
                            case 5:
                                axton.increaceSkill("guerilla", "Scorched Earth");
                                axton.printSkillTrees();
                                break;
                            case 6:
                                axton.increaceSkill("guerilla", "Double Up");
                                axton.printSkillTrees();
                                break;
                            case 7:
                                System.out.println("Goodbye!");
                                break;
                            default:
                                System.out.println("Invalid input. Please try again.");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("You have chosen the Gunpowder skill tree!");
                        System.out.println("************************************************************");
                        System.out.println("Please choose a skill to begin.");
                        System.err.println("1. Impact");
                        System.err.println("2. Expertise");
                        System.err.println("3. Metal Storm");
                        System.err.println("4. Longbow Turret");
                        System.err.println("5. Battlefront");
                        System.err.println("6. Do or Die");
                        System.err.println("7. Quit");
                        System.out.println("************************************************************");
                        System.out.println("Enter the number of the skill you would like to choose: ");
                        skill = scanner.nextInt();
                        scanner.nextLine();
                        switch (skill) {
                            case 1:
                                axton.increaceSkill("gunpowder", "Impact");
                                axton.printSkillTrees();
                                break;
                            case 2:
                                axton.increaceSkill("gunpowder", "Expertise");
                                axton.printSkillTrees();
                                break;
                            case 3:
                                axton.increaceSkill("gunpowder", "Metal Storm");
                                axton.printSkillTrees();
                                break;
                            case 4:
                                axton.increaceSkill("gunpowder", "Longbow Turret");
                                axton.printSkillTrees();
                                break;
                            case 5:
                                axton.increaceSkill("gunpowder", "Battlefront");
                                axton.printSkillTrees();
                                break;
                            case 6:
                                axton.increaceSkill("gunpowder", "Do or Die");
                                axton.printSkillTrees();
                                break;
                            case 7:
                                System.out.println("Goodbye!");
                                break;
                            default:
                                System.out.println("Invalid input. Please try again.");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("You have chosen the Survival skill tree!");
                        System.out.println("************************************************************");
                        System.out.println("Please choose a skill to begin.");
                        System.err.println("1. Healthy");
                        System.err.println("2. Preparation");
                        System.err.println("3. Last Ditch Effort");
                        System.err.println("4. Phalanx Shield");
                        System.err.println("5. Quick Charge");
                        System.err.println("6. Gemini");
                        System.err.println("7. Quit");
                        System.out.println("************************************************************");
                        System.out.println("Enter the number of the skill you would like to choose: ");
                        skill = scanner.nextInt();
                        scanner.nextLine();
                        switch (skill) {
                            case 1:
                                axton.increaceSkill("survival", "Healthy");
                                axton.printSkillTrees();
                                break;
                            case 2:
                                axton.increaceSkill("survival", "Preparation");
                                axton.printSkillTrees();
                                break;
                            case 3:
                                axton.increaceSkill("survival", "Last Ditch Effort");
                                axton.printSkillTrees();
                                break;
                            case 4:
                                axton.increaceSkill("survival", "Phalanx Shield");
                                axton.printSkillTrees();
                                break;
                            case 5:
                                axton.increaceSkill("survival", "Quick Charge");
                                axton.printSkillTrees();
                                break;
                            case 6:
                                axton.increaceSkill("survival", "Gemini");
                                axton.printSkillTrees();
                                break;
                            case 7:
                                System.out.println("Goodbye!");
                                break;
                            default:
                                System.out.println("Invalid input. Please try again.");
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid input. Please try again.");
                        break;
                }
                break;
            // case 2: // maya
            //     Maya maya = new Maya(level);
            //     System.out.println("You have chosen Maya!");
            //     System.out.println("************************************************************");
            //     System.out.println("Please choose a skill tree to begin.");
            //     System.err.println("1. Motion");
            //     System.err.println("2. Harmony");
            //     System.err.println("3. Cataclysm");
            //     System.err.println("4. Quit");
            //     System.out.println("************************************************************");
            //     System.out.println("Enter the number of the skill tree you would like to choose: ");
            //     skillTree = scanner.nextInt();
            //     scanner.nextLine();
            //     switch (skillTree) {
            //         case 1:
            //             maya.motion();
            //             break;
            //         case 2:
            //             maya.harmony();
            //             break;
            //         case 3:
            //             maya.cataclysm();
            //             break;
            //         case 4:
            //             System.out.println("Goodbye!");
            //             break;
            //         default:
            //             System.out.println("Invalid input. Please try again.");
            //             break;
            //     }
            //     break;
            // case 3: // salvador
            //     Salvador salvador = new Salvador(level);
            //     System.out.println("You have chosen Salvador!");
            //     System.out.println("************************************************************");
            //     System.out.println("Please choose a skill tree to begin.");
            //     System.err.println("1. Gun Lust");
            //     System.err.println("2. Rampage");
            //     System.err.println("3. Brawn");
            //     System.err.println("4. Quit");
            //     System.out.println("************************************************************");
            //     System.out.println("Enter the number of the skill tree you would like to choose: ");
            //     skillTree = scanner.nextInt();
            //     scanner.nextLine();
            //     switch (skillTree) {
            //         case 1:
            //             salvador.gunLust();
            //             break;
            //         case 2:
            //             salvador.rampage();
            //             break;
            //         case 3:
            //             salvador.brawn();
            //             break;
            //         case 4:
            //             System.out.println("Goodbye!");
            //             break;
            //         default:
            //             System.out.println("Invalid input. Please try again.");
            //             break;
            //     }
            //     break;
            // case 4: // zer0
            //     Zer0 zer0 = new Zer0(level);
            //     System.out.println("You have chosen Zer0!");
            //     System.out.println("************************************************************"); 
            //     System.out.println("Please choose a skill tree to begin.");
            //     System.err.println("1. Sniping");   
            //     System.err.println("2. Cunning");
            //     System.err.println("3. Bloodshed");
            //     System.err.println("4. Quit");
            //     System.out.println("************************************************************");
            //     System.out.println("Enter the number of the skill tree you would like to choose: ");
            //     skillTree = scanner.nextInt();
            //     scanner.nextLine();
            //     switch (skillTree) {
            //         case 1:
            //             zer0.sniping();
            //             break;
            //         case 2:
            //             zer0.cunning();
            //             break;
            //         case 3:
            //             zer0.bloodshed();
            //             break;
            //         case 4:
            //             System.out.println("Goodbye!");
            //             break;
            //         default:
            //             System.out.println("Invalid input. Please try again.");
            //             break;
            //     }
            //     break;
            // case 5: // gaige
            //     Gaige gaige = new Gaige(level);
            //     System.out.println("You have chosen Gaige!");
            //     System.out.println("************************************************************");
            //     System.out.println("Please choose a skill tree to begin.");
            //     System.err.println("1. Best Friends Forever");
            //     System.err.println("2. Little Big Trouble");
            //     System.err.println("3. Ordered Chaos");
            //     System.err.println("4. Quit");
            //     System.out.println("************************************************************");
            //     System.out.println("Enter the number of the skill tree you would like to choose: ");
            //     skillTree = scanner.nextInt();
            //     scanner.nextLine();
            //     switch (skillTree) {
            //         case 1:
            //             gaige.bestFriendsForever();
            //             break;
            //         case 2:
            //             gaige.littleBigTrouble();
            //             break;
            //         case 3:
            //             gaige.orderedChaos();
            //             break;
            //         case 4:
            //             System.out.println("Goodbye!");
            //             break;
            //         default:
            //             System.out.println("Invalid input. Please try again.");
            //             break;
            //     }
            //     break;
            // case 6: // krieg
            //     Krieg krieg = new Krieg(level);
            //     System.out.println("You have chosen Krieg!");
            //     System.out.println("************************************************************");
            //     System.out.println("Please choose a skill tree to begin.");
            //     System.err.println("1. Bloodlust");
            //     System.err.println("2. Mania");
            //     System.err.println("3. Hellborn");
            //     System.err.println("4. Quit");
            //     System.out.println("************************************************************");
            //     System.out.println("Enter the number of the skill tree you would like to choose: ");
            //     skillTree = scanner.nextInt();
            //     scanner.nextLine();
            //     switch (skillTree) {
            //         case 1:
            //             krieg.bloodlust();
            //             break;
            //         case 2:
            //             krieg.mania();
            //             break;
            //         case 3:
            //             krieg.hellborn();
            //             break;
            //         case 4:
            //             System.out.println("Goodbye!");
            //             break;
            //         default:
            //             System.out.println("Invalid input. Please try again.");
            //             break;
            //     }
            //     break;          
            case 7:
                System.out.println("Goodbye!");
                break;      
            default:
                System.out.println("Invalid input. Please try again.");
                break; 
        }
        scanner.close();
    }
}