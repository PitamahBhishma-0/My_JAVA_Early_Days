package mini_game;

public class Player2 extends Player1 {
    private int health;
    private boolean armour;

    public Player2(String name, String weapon, int health, boolean armour) {
        super(name, weapon, health);
        this.health = health;
        this.armour = armour;
    }

    @Override
    public void Gun1Damage() {
        if(armour){
            this.health -= 20;
            if(this.health <=0) this.health = 0;
            System.out.println("Armour is on. Got hit by gun 1. Health is reduced by 20." +
                    "New health is "+ this.health);
        } if(!armour){
            this.health -= 30;
            if(this.health <=0) this.health = 0;
            System.out.println("Armour is off. Got hit by gun 1. Health is reduced by 30." +
                    "New health is "+ this.health);
        }
        if(this.health == 0){
            System.out.println(getName() + " is dead");
        }
    }

    @Override
    public void Gun2Damage() {
        if(armour){
            this.health -= 40;
            if(this.health <=0) this.health = 0;
            System.out.println("Armour is on. Got hit by gun 1. Health is reduced by 40." +
                    "New health is "+ this.health);
        } if(!armour){
            this.health -= 50;
            if(this.health <=0) this.health = 0;
            System.out.println("Armour is off. Got hit by gun 1. Health is reduced by 50." +
                    "New health is "+ this.health);
        }
        if(this.health == 0){
            System.out.println(getName() + " is dead");
        }
    }
    public void heal() {
   	 if(this.health<=0) {System.out.println("Player is dead heal not possible");
    }
    else {
   	 this.health=100;
   	 System.out.println("Health is "+this.health);
    }
    }
}