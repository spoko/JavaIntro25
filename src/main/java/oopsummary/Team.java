package oopsummary;

import java.security.InvalidParameterException;
import java.util.LinkedList;
import java.util.List;

public class Team {
    private String name;
    private byte rating;
    private List<Player> playerList = new LinkedList<>();

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

    public byte getRating() {
        return rating;
    }

//    public void setRating(byte rating) {
//        this.rating = rating;
//    }

    //calculate rating internally hidden from outside world:
    private void updateRating(){
        if (playerList.size() == 0){
            rating = 0;
            return;
        }

        int result = 0;

        for (Player player : playerList){
            result =  result + player.getStats();
        }

        rating = (byte) (result / playerList.size());
    }

    public void addPlayer(Player player){
        playerList.add(player);
        updateRating();
    }

    public void removePlayer(Player player){
        if (playerList.contains(player)){
            playerList.remove(player);
            updateRating();
        }else {
            System.out.printf("Player %s is not in %s team.", player.getName(), name);
        }
    }

    public Team(String name){
        setName(name);
    }
}
