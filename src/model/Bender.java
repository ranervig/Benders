package model;

/**
 * 
 * @author Robby Nervig
 *
 */
public class Bender {
	private String name;
	private int age;
	private String nation;
	private String bending;

	public Bender() {
		super();
	}

	public Bender(String name, int age, String nation) {
		super();
		this.name = name;
		this.age = age;
		this.nation = nation;
		bending = nation;
	}

	public boolean canBend(String type) {
		if (this.bending == "All") {
			// can bend all types
			return true;
		} else {
			if (this.bending == type) {
				return true;
			} else {
				return false;
			}
		}
	}

	public boolean isAvatar() {
		if (this.canBend("Fire") && this.canBend("Air") && this.canBend("Water") && this.canBend("Earth")) {
			return true;
		} else
			return false;
	}

	public int elementsControlled() {
		// not avatar or young avatar
		if (!this.isAvatar() || this.age < 10) {
			return 1;
		} else {
			// avatar gains control with age and practice
			if (age < 12) {
				return 2;
			} else if (age < 15) {
				return 3;
			} else {
				return 4;
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getBending() {
		return bending;
	}

	public void setBending(String bending) {
		this.bending = bending;
	}

}
