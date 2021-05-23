package entities;

public class Room {
	private String name;
	private String mail;

	public Room() {
	}

	public Room(String name, String mail) {
		this.name = name;
		this.mail = mail;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return 	getName()
				+ ", "
				+ getMail();
	}
}
