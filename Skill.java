
/**
 * Handles a skill object that will be added to the skill tree.
 */
public class Skill {
    public int maxPoints;
    public int pointsInvested;
    public String skillName;


    public Skill (String skillName, int pointsInvested, int maxPoints) {
        this.maxPoints = maxPoints;
        this.pointsInvested = pointsInvested;
        this.skillName = skillName;
    }

    public void addPoint() {
        if (pointsInvested < maxPoints) {
            pointsInvested++;
        }
        else {
            System.out.println("You have already invested the maximum amount of points into this skill.");
        }
    }

    public void removePoint() {
        if (pointsInvested > 0) {
            pointsInvested--;
        }
        else {
            System.out.println("You have not invested any points into this skill.");
        }
    }

    public int getPointsInvested() {
        return pointsInvested;
    }

    public String getSkillName() {
        return skillName;
    }

    public int getMaxPoints() {
        return maxPoints;
    }

    public void setPointsInvested(int pointsInvested) {
        this.pointsInvested = pointsInvested;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }   

    public void setMaxPoints(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    @Override
    public String toString() {
        return "Skill Name: " + skillName + "\n" + "Points Invested: " + pointsInvested + "\n" + "Skill Change: " + "Max Points: " + maxPoints;
    }



}
