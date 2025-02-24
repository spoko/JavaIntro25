package oopsummary;

import java.security.InvalidParameterException;

public class Player {
    private String name;
    private PlayerStats stats;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }else {
            throw new InvalidParameterException();
        }
    }

    public byte getStats() {
        return stats.getOverallSkill();
    }

    public void setStats(PlayerStats stats) {
        if (!stats.equals(null)){
            this.stats = stats;
        }else {
            throw new InvalidParameterException();
        }
    }

    public Player(String name, PlayerStats stats){
        setName(name);
        setStats(stats);
    }
}
