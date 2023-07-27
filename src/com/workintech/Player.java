package com.workintech;

public class Player {
   private String name;
   private int healthPercentage;
   private Weapon weapon;


private void checkHealth (int healthPercentage){
    if (healthPercentage > 100){
        this.healthPercentage = 100;
    }else if(healthPercentage < 0){
        this.healthPercentage = 0;
    } else{
        this.healthPercentage = healthPercentage;
    }
}
    public  Player(String name ,int healthPercentage){
        this.name = name;
        checkHealth(healthPercentage);
        this.weapon = weapon;

    }

   public int healthRemaining(){
        return this.healthPercentage;
    }

    public void loseHealth(int damage){
        int healthRemain =  healthPercentage - damage;
        if(healthRemain <= 0){
            System.out.println("game over");
        } else{
            checkHealth(healthRemain);
        }

    }
    public void restoreHealth(int healthPotion){
           checkHealth(healthPercentage + healthPotion);
    }
}
