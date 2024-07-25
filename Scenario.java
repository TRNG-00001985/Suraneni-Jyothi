package Revday02;
abstract class Character{
	String name;
	String race;
	int level;
	int health;
	public Character(String name, String race, int level) {
		super();
		this.name = name;
		this.race = race;
		this.level = level;
		this.health = 100;
	}
	public void attack(Character enemy) {
		enemy.takeDamage(30);
	}
	void takeDamage(int damage) {
		this.health-=damage;
		if(this.health<0) {
			this.health=0;
		}
		
	}
	public void drinkPotion() {
		this.health+=50;
	}
	public abstract void display();
}
class Human extends Character{
	public Human(String name,int level) {
		super(name,"Human",level);
	}

	@Override
	public void display() {
		System.out.println("Name:"+name+",Level:"+level+",Health:"+health);
		
	}
	
}
class Elf extends Character{
	public Elf(String name,int level) {
		super(name,"Elf",level);
	}
	@Override
	public void display() {
		System.out.println("Name:"+name+" ,Level:"+level+"Health:"+health);
	}
	
}
class Dwarf extends Character{

	public Dwarf(String name, int level) {
		super(name, "Dwarf", level);
		
	}

	@Override
	public void display() {
		System.out.println("Name:"+name+",Level:"+level+",Health:"+health);
		
	}
	
}
class Hobbit extends Character{

	public Hobbit(String name, int level) {
		super(name, "Hobbit", level);
		
	}

	@Override
	public void display() {
		System.out.println("Name:"+name+",Level:"+level+",Health:"+health);
		
	}
	
}
interface CharacterClass{
	void PerformspecialAbility();
}
class Ranger extends Character implements CharacterClass{

	public Ranger(String name, int level) {
		super(name, "Human", level);
		
	}

	
	@Override
	public void PerformspecialAbility() {
		System.out.println("Tracking the enemy with ranger skills");
		
	}
	@Override
	public void display() {
		System.out.println("Ranger:"+name+",Level:"+level+",Health:"+health);
		
	}

	
}
class Wizard extends Character implements CharacterClass{

	public Wizard(String name, int level) {
		super(name, "Elf", level);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void PerformspecialAbility() {
		System.out.println("casting powerful spells as a wizard");
		
	}

	@Override
	public void display() {
		System.out.println("Wizard:"+name+",Level:"+level+"Health:"+health);
		
	}
	
}
class Warrior extends Character implements CharacterClass{

	public Warrior(String name, int level) {
		super(name, "race", level);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void PerformspecialAbility() {
		System.out.println("Engaging in fierce combat as a warrior");
		
	}

	@Override
	public void display() {
		System.out.println("Warrior:"+name+",Level:"+level+",Health:"+health);
		
	}
	
}
class Commoner extends Character implements CharacterClass{

	public Commoner(String name, int level) {
		super(name, "race", level);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void PerformspecialAbility() {
		System.out.println("Living a peaceful life as a commoner");
		
	}

	@Override
	public void display() {
		System.out.println("Commoner:"+name+",Level:"+level+",Health:"+health);
	}
	
}
abstract class Creature{
	String creatureType;
	int attackPower;
	public Creature(String creatureType, int attackPower) {
		super();
		this.creatureType = creatureType;
		this.attackPower = attackPower;
	}
	public void attack(Character enemy) {
		enemy.takeDamage(this.attackPower);
	}
	public abstract void display();
}
class Orc extends Creature{

	public Orc(String creatureType, int attackPower) {
		super(creatureType, attackPower);
		
	}

	@Override
	public void display() {
		System.out.println("Orc:Type-"+creatureType+"AttackPower:"+attackPower);
		
	}
	
}
class Troll extends Creature{

	public Troll(String creatureType, int attackPower) {
		super(creatureType, attackPower);
		
	}

	@Override
	public void display() {
		System.out.println("Troll:Type-"+creatureType+"AttackPower:"+attackPower);
		
	}
	
}
class Dragon extends Creature{

	public Dragon(String creatureType, int attackPower) {
		super(creatureType, attackPower);
		
	}

	@Override
	public void display() {
		System.out.println("Dragon:Type-"+creatureType+"AttackPower:"+attackPower);
		
		
	}
	
}
class Nazgul extends Creature{

	public Nazgul(String creatureType, int attackPower) {
		super(creatureType, attackPower);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		
		System.out.println("Nazgul:Type-"+creatureType+"AttackPower:"+attackPower);
	}
	
}
public class Scenario {

	public static void main(String[] args) {
		Human h=new Human("Uma",4);
		h.display();
		h.attack(h);
		h.display();
		h.drinkPotion();
		h.display();
		Elf e=new Elf("magical",1);
		e.display();
		e.attack(e);
		e.display();
		e.drinkPotion();
		e.display();
		Dwarf d=new Dwarf("abc", 2);
		d.display();
		d.attack(d);
		d.display();
		d.drinkPotion();
		d.display();
		Hobbit ho=new Hobbit("Man",3);
		ho.display();
		ho.attack(ho);
		ho.display();
		ho.drinkPotion();
		ho.display();
		Ranger r=new Ranger("Abhi",3);
		r.PerformspecialAbility();
		r.display();
		Wizard w=new Wizard("mi",3);
		w.PerformspecialAbility();
		w.display();
		Warrior wa=new Warrior("abc",7);
		wa.PerformspecialAbility();
		wa.display();
		Commoner c=new Commoner("Man",8);
		c.PerformspecialAbility();
		c.display();

	}

}
