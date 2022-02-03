package gitpractice;

public class User {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		User user1 = new User();
		user1.setName("lombak");
		System.out.println(user1.getName());
	}
}
