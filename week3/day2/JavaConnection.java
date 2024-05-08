package week3.day2;

public class JavaConnection implements DatabaseConnection {
	
	public void connect() {
		
		System.out.println("Connect method validation");
		
	}

	public void disconnect() {
		System.out.println("DisConnect method validation");
		
	}

	public void executeUpdate() {
		System.out.println("Update method validation");
		
	}

	

	public static void main(String[] args) {
		JavaConnection jc=new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();

	}

}
