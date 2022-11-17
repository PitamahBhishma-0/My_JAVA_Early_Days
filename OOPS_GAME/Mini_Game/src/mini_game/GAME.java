package mini_game;

public class GAME {

	public static void main(String[] args) {
		Player1 player=new Player1("Gaurav","Gun1",100);
		/*System.out.println("The name of player is"+player.getName());
		System.out.println("The weapon of player is"+player.getHelath());
		System.out.println("The health of player is"+player.getWeapon());*/
        /*player.Gun1Damage();
        player.Gun1Damage();
        player.Gun2Damage();*/
		Player2 betterPlayer=new Player2("Saurav","Machine Gun",80,false);
		player.Gun1Damage();
	    player.Gun2Damage();
	    player.Gun2Damage();
	    
		player.heal();
		
		
			
	}

}
