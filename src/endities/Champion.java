package endities;

public class Champion {

	private String name;
	private int life, attack, armor;

	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}


	public int getLife() {
		return life;
	}


	public int getAttack() {
		return attack;
	}



	public int getArmor() {
		return armor;
	}


	public void takeDamage(int attack, int life, int a) {

		if(attack - armor <= 0) {
			this.life = life - 1;
		}
		else {this.life = life - (attack - armor);}
		
		
	}

	public String status() {
		
		if (this.life <=0) {
			return name + " : 0 de vida (morreu)";
		}
		
		else return name + " : " + life;
	}
}
