import java.util.ArrayList;
/**
 * This class is for the Vault Hunter Axton.
 * This class will contain the skill trees for Axton, and the methods to add skills to the skill tree.
 * 
 * @author ChandlerBlack
 * @version 0.1
 * @since 3/7/2025
 */
public class Axton {
    
    // Level and Skill Points
    private int level;
    private int skillPoints;
    private int totalSkillPoints;
    private int totalSkillPointsSpent;
    private int totalSkillPointsRemaining;


    // Health
    private int totalHealth;
    private double totalHealthRegeneration;
    
    
    // Sheilds
    private int totalShieldCapacity;
    private double totalShieldRechargeRate;
    private double totalShieldRechargeDelay;
    
    
    // Grenades
    private double totalGrenadeDamage;
    private int totalGrenadeCapacity;
    

    // Guns
    private double totalGunDamage;
    private double totalAccuracy;
    private double totalFireRate;
    private double totalReloadSpeed;
    private double totalMagazineSize;
    private double totalSwapSpeed;
    private double totalAimSpeed;
    private double totalRecoilReduction;


    // Elemental Effects
    private double totalElementalEffectChance;
    private double totalElementalEffectDamage;
    
    
    // Misc
    private int totalMeleeDamage;
    private double totalCriticalHitDamage;
    private double totalActionSkillCooldownRate;
    private double totalMovementSpeed;
    private double totalDamageReduction;
    private int totalActionSkillDuration;


    // NOT USED IN CURRENT VERSION
    private int turretHealth;
    private int turretBurstCount = 0;
    private int turretAccuracy = 0;
    private int turretRocketCount = 0;
    private boolean turretNuke = false;
    private boolean turretGemini = false;
    private boolean turretPhalanx = false;
    private boolean turretLongbow = false;
    private boolean turretSlag = false;



    // Skill Trees
    private  ArrayList<Skill> guerilla = new ArrayList<Skill>();
    private ArrayList<Skill> gunpowder = new ArrayList<Skill>();
    private ArrayList<Skill> survival = new ArrayList<Skill>();

    // Skills in the Guerilla tree
    Skill sentry = new Skill("Sentry", 0, 5);
    Skill ready = new Skill("Ready", 0, 5);
    Skill laserSight = new Skill("Laser Sight", 0, 5);
    Skill willing = new Skill("Willing", 0, 5);
    Skill onslaught = new Skill("Onslaught", 0, 5);
    Skill scorchedEarth = new Skill("Scorched Earth", 0, 1);
    Skill able = new Skill("Able", 0, 5);
    Skill grenadier = new Skill("Grenadier", 0, 5);
    Skill crisisManagement = new Skill("Crisis Management", 0, 5);
    Skill doubleUp = new Skill("Double Up", 0, 1);
    

    // Skills in the Gunpowder tree
    Skill impact = new Skill("Impact", 0, 5);
    Skill expertise = new Skill("Expertise", 0, 5);
    Skill overload = new Skill("Overload", 0, 5);
    Skill metalStorm = new Skill("Metal Storm", 0, 5);
    Skill steady = new Skill("Steady", 0, 5);
    Skill longbowTurret = new Skill("Longbow Turret", 0, 1);
    Skill battlefront = new Skill("Battlefront", 0, 5);
    Skill dutyCalls = new Skill("Duty Calls", 0, 5);
    Skill doOrDie = new Skill("Do or Die", 0, 5);
    Skill ranger = new Skill("Ranger", 0, 5);
    Skill nuke = new Skill("Nuke", 0, 1);

    


    // Skills in the Survival tree
    Skill healthy = new Skill("Healthy", 0, 5);
    Skill preparation = new Skill("Preparation", 0, 5);
    Skill lastDitchEffort = new Skill("Last Ditch Effort", 0, 1);
    Skill pressure = new Skill("Pressure", 0, 5);
    Skill forbearance = new Skill("Forbearance", 0, 5);
    Skill phalnaxShield = new Skill("Phalanx Shield", 0, 1);
    Skill quickCharge = new Skill("Quick Charge", 0, 5);
    Skill resourceful = new Skill("Resourceful", 0, 5);
    Skill magLock = new Skill("Mag Lock", 0, 1);
    Skill grit = new Skill("Grit", 0, 5);
    Skill gemini = new Skill("Gemini", 0, 1);

    /**
     * This is the constructor for the Axton class.
     * @param level
     */
    public Axton (int level) {
        this.level = level;
        this.skillPoints = level - 5;
        this.totalSkillPoints = level - 5;
        this.totalSkillPointsSpent = 0; 
        this.totalSkillPointsRemaining = totalSkillPoints - totalSkillPointsSpent;
        this.totalHealth = 0;
        this.totalGrenadeDamage = 0;
        this.totalGunDamage = 0;
        this.totalMeleeDamage = 0;
        this.totalCriticalHitDamage = 0;
        this.totalAccuracy = 0;
        this.totalFireRate = 0;
        this.totalReloadSpeed = 0;
        this.totalMagazineSize = 0;
        this.totalElementalEffectChance = 0;
        this.totalElementalEffectDamage = 0;
        this.totalActionSkillCooldownRate = 0;
        this.totalMovementSpeed = 0;
        this.totalDamageReduction = 0;
        this.totalShieldCapacity = 0;
        this.totalShieldRechargeRate = 0;
        this.totalShieldRechargeDelay = 0;
        this.totalGrenadeCapacity = 0;
        this.totalHealthRegeneration = 0;
        this.totalActionSkillDuration = 0;
        this.totalSwapSpeed = 0;
        this.totalAimSpeed = 0;
        this.totalRecoilReduction = 0;
        addSkills();


    }

    /**
     * This is a helper method used to populate the array lists of the skill trees.
     */
    private void addSkills(){
        // Guerilla
        guerilla.add(sentry);
        guerilla.add(ready);
        guerilla.add(laserSight);
        guerilla.add(willing);
        guerilla.add(onslaught);
        guerilla.add(scorchedEarth);
        guerilla.add(able);
        guerilla.add(grenadier);
        guerilla.add(crisisManagement);
        guerilla.add(doubleUp);



        // Gunpowder
        gunpowder.add(impact);
        gunpowder.add(expertise);
        gunpowder.add(overload);
        gunpowder.add(metalStorm);
        gunpowder.add(steady);
        gunpowder.add(longbowTurret);
        gunpowder.add(battlefront);
        gunpowder.add(dutyCalls);
        gunpowder.add(doOrDie);
        gunpowder.add(ranger);
        gunpowder.add(nuke);
        

        // Survival
        survival.add(healthy);
        survival.add(preparation);
        survival.add(lastDitchEffort);
        survival.add(pressure);
        survival.add(forbearance);
        survival.add(phalnaxShield);
        survival.add(quickCharge);
        survival.add(resourceful);
        survival.add(magLock);
        survival.add(grit);
        survival.add(gemini);


    }

    /**
     * This method will add a skill point to the skill tree.
     * @param skillTree
     * @param skillName
     */
    public void increaceSkill(String skillTree, String skillName){
        switch (skillTree) {
            case "Guerilla":
                for (Skill skill : guerilla){
                    if (skill.getSkillName().equals(skillName)){
                        skill.addPoint();
                    }
                }
                break;
            case "Gunpowder":
                for (Skill skill : gunpowder){
                    if (skill.getSkillName().equals(skillName)){
                        skill.addPoint();
                    }
                }
                break;
            case "Survival":
                for (Skill skill : survival){
                    if (skill.getSkillName().equals(skillName)){
                        skill.addPoint();
                    }
                }
                break;
            default:
                break;
        }
    }

    /**
     * This method calculates the stats of the character based on the skills invested in.
     */
    public void calculateStats() {
        for (Skill s : guerilla) {
            switch (s.getSkillName()) {
                case "Sentry":
                    totalGunDamage += 1 * s.getPointsInvested();
                    totalAccuracy += 2 * s.getPointsInvested();
                    break;
                case "Ready":
                    totalReloadSpeed += 0.08 * s.getPointsInvested();
                    break;
                // case "Laser Sight":
                //     turretAccuracy += 0.1 * s.getPointsInvested();
                //     break;
                case "Willing":
                    totalShieldRechargeRate += 0.15 * s.getPointsInvested();
                    totalShieldRechargeDelay += -0.12 * s.getPointsInvested();
                    break;
                case "Onslaught":
                    totalGunDamage += 0.6 * s.getPointsInvested();
                    totalMovementSpeed += 0.12 * s.getPointsInvested();
                    break;
                // case "Scorched Earth":
                //     turretRocketCount = 22;
                //     break;
                case "Able":
                    totalHealthRegeneration += 0.04 * s.getPointsInvested();
                    break;
                case "Grenadier":
                    totalGrenadeCapacity += 1 * s.getPointsInvested();
                    break;
                case "Crisis Management":
                    totalGunDamage += 0.07 * s.getPointsInvested();
                    totalMeleeDamage += 0.06 * s.getPointsInvested();
                    break;
                // case "Double Up":
                //     turretSlag = true;
                //     break;
                default:
                    break;
            }
        }

        for (Skill s : gunpowder) {
            switch (s.getSkillName()) {
                case "Impact":
                    totalGunDamage += 0.5 * s.getPointsInvested();
                    totalMeleeDamage += 0.5 * s.getPointsInvested();
                    break;
                case "Expertise":
                    totalReloadSpeed += 0.5 * s.getPointsInvested();
                    totalMagazineSize += 0.5 * s.getPointsInvested();
                    break;
                case "Overload":
                    totalShieldCapacity += 0.5 * s.getPointsInvested();
                    totalShieldRechargeRate += 0.5 * s.getPointsInvested();
                    break;
                case "Metal Storm":
                    totalFireRate += 0.5 * s.getPointsInvested();
                    totalAccuracy += 0.5 * s.getPointsInvested();
                    break;
                case "Steady":
                    totalGrenadeDamage += 0.5 * s.getPointsInvested();
                    totalElementalEffectChance += 0.5 * s.getPointsInvested();
                    break;
                // case "Longbow Turret":
                //     totalActionSkillDuration += 1 * s.getPointsInvested();
                //     break;
                case "Battlefront":
                    totalGunDamage += 0.5 * s.getPointsInvested();
                    totalAccuracy += 0.5 * s.getPointsInvested();
                    break;
                case "Duty Calls":
                    totalGunDamage += 0.5 * s.getPointsInvested();
                    totalAccuracy += 0.5 * s.getPointsInvested();
                    break;
                case "Do or Die":
                    totalGrenadeDamage += 0.5 * s.getPointsInvested();
                    totalGrenadeCapacity += 1 * s.getPointsInvested();
                    break;
                case "Ranger":
                    totalGunDamage += 0.5 * s.getPointsInvested();
                    totalAccuracy += 0.5 * s.getPointsInvested();
                    break;
                // case "Nuke":
                //     totalGrenadeDamage += 1 * s.getPointsInvested();
                //     break;
                default:
                    break;
            }
        }

        for (Skill s : survival) {
            switch (s.getSkillName()) {
                case "Healthy":
                    totalHealth += 0.5 * s.getPointsInvested();
                    totalHealthRegeneration += 0.4 * s.getPointsInvested();
                    break;
                case "Preparation":
                    totalShieldCapacity += 0.5 * s.getPointsInvested();
                    totalShieldRechargeRate += 0.5 * s.getPointsInvested();
                    break;
                case "Last Ditch Effort":
                    totalGunDamage += 0.5 * s.getPointsInvested();
                    totalAccuracy += 0.5 * s.getPointsInvested();
                    break;
                case "Pressure":
                    totalGunDamage += 0.5 * s.getPointsInvested();
                    totalAccuracy += 0.5 * s.getPointsInvested();
                    break;
                case "Forbearance":
                    totalShieldCapacity += 0.5 * s.getPointsInvested();
                    totalShieldRechargeRate += 0.5 * s.getPointsInvested();
                    break;
                // case "Phalanx Shield":
                //     totalShieldCapacity += 1 * s.getPointsInvested();
                //     break;
                case "Quick Charge":
                    totalShieldRechargeRate += 0.5 * s.getPointsInvested();
                    totalShieldRechargeDelay += 0.5 * s.getPointsInvested();
                    break;
                case "Resourceful":
                    totalActionSkillCooldownRate += 0.5 * s.getPointsInvested();
                    break;
                case "Mag Lock":
                    totalActionSkillDuration += 1 * s.getPointsInvested();
                    break;
                case "Grit":
                    totalHealth += 0.5 * s.getPointsInvested();
                    totalHealthRegeneration += 0.4 * s.getPointsInvested();
                    break;
                // case "Gemini":
                //     totalActionSkillDuration += 1 * s.getPointsInvested();
                //     break;
                default:
                    break;
            }
        }
    }

    /**
     * This method will return the total stats of the character.
     * @return the skill trees with the points invested in each skill.
     */
    public String printSkillTrees() {
        String skillTrees = " \n GUERILLA: \n ";
        for (Skill skill : guerilla) {
            skillTrees += skill.getSkillName() + ": " + skill.getPointsInvested() + "\n";
        }
        skillTrees += "\n GUNPOWDER: \n";
        for (Skill skill : gunpowder) {
            skillTrees += skill.getSkillName() + ": " + skill.getPointsInvested() + "\n";
        }
        skillTrees += "\n SURVIVAL: \n";
        for (Skill skill : survival) {
            skillTrees += skill.getSkillName() + ": " + skill.getPointsInvested() + "\n";
        }
        return skillTrees;
    }

    /**
     * This method will return the total stats of the character.
     * @return the total stats of the character.
     */
    public String printVHStats() {
        return "Level: " + level + "\n" +
               "Skill Points: " + skillPoints + "\n" +
               "Total Skill Points: " + totalSkillPoints + "\n" +
               "Total Skill Points Spent: " + totalSkillPointsSpent + "\n" +
               "Total Skill Points Remaining: " + totalSkillPointsRemaining + "\n" +
               "Total Health: " + totalHealth + "\n" +
               "Total Health Regeneration: " + totalHealthRegeneration + "\n" +
               "Total Shield Capacity: " + totalShieldCapacity + "\n" +
               "Total Shield Recharge Rate: " + totalShieldRechargeRate + "\n" +
               "Total Shield Recharge Delay: " + totalShieldRechargeDelay + "\n" +
               "Total Grenade Damage: " + totalGrenadeDamage + "\n" +
               "Total Grenade Capacity: " + totalGrenadeCapacity + "\n" +
               "Total Gun Damage: " + totalGunDamage + "\n" +
               "Total Accuracy: " + totalAccuracy + "\n" +
               "Total Fire Rate: " + totalFireRate + "\n" +
               "Total Reload Speed: " + totalReloadSpeed + "\n" +
               "Total Magazine Size: " + totalMagazineSize + "\n" +
               "Total Elemental Effect Chance: " + totalElementalEffectChance + "\n" +
               "Total Elemental Effect Damage: " + totalElementalEffectDamage + "\n" +
               "Total Action Skill Cooldown Rate: " + totalActionSkillCooldownRate + "\n" +
               "Total Movement Speed: " + totalMovementSpeed + "\n" +
               "Total Damage Reduction: " + totalDamageReduction + "\n" +
               "Total Action Skill Duration: " + totalActionSkillDuration + "\n";
    }

}