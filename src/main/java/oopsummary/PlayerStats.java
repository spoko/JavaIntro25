package oopsummary;

import java.security.InvalidParameterException;

public class PlayerStats {
    private byte endurance;
    private byte sprint;
    private byte dribble;
    private byte passing;
    private byte shooting;

    public byte getEndurance() {
        return endurance;
    }

    public void setEndurance(byte endurance) {
        if (endurance >= 0 && endurance <= 100){
            this.endurance = endurance;
        }else {
            throw new InvalidParameterException();
        }
    }

    public byte getSprint() {
        return sprint;
    }

    public void setSprint(byte sprint) {
        if (sprint >= 0 && sprint <= 100){
            this.sprint = sprint;
        }else {
            throw new InvalidParameterException();
        }
    }

    public byte getDribble() {
        return dribble;
    }

    public void setDribble(byte dribble) {
        if (dribble >= 0 && dribble <= 100){
            this.dribble = dribble;
        }else {
            throw new InvalidParameterException();
        }
    }

    public byte getPassing() {
        return passing;
    }

    public void setPassing(byte passing) {
        if (passing >= 0 && passing <= 100){
            this.passing = passing;
        }else {
            throw new InvalidParameterException();
        }
    }

    public byte getShooting() {
        return shooting;
    }

    public void setShooting(byte shooting) {
        if (shooting >= 0 && shooting <= 100){
            this.shooting = shooting;
        }else {
            throw new InvalidParameterException();
        }
    }

    public PlayerStats(byte endurance, byte sprint, byte dribble, byte passing, byte shooting){
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }

    public byte getOverallSkill(){
        return (byte) ((endurance + sprint + dribble + passing + shooting) / 5);
    }
}
