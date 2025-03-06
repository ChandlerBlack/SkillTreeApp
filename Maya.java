public class Maya {
    
        
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


    // Elemental Effects
    private double totalElementalEffectChance;
    private double totalElementalEffectDamage;
    
    
    // Misc
    private int totalMeleeDamage;
    private double totalCriticalHitDamage;
    private double totalActionSkillCooldownRate;
    private double totalMovementSpeed;
    private double totalDamageReduction;


    public Maya (int level) {
        this.level = level;
        this.skillPoints = level - 5;
        this.totalSkillPoints = level - 5;
        this.totalSkillPointsSpent = 0; 
        this.totalSkillPointsRemaining = totalSkillPoints - totalSkillPointsSpent;
        this.totalHealth = 100;
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
    }
}
