package Exception.handling;

//https://www.youtube.com/watch?v=X3DKOcRmlzM&index=71&list=PLsfLgp1K1xQ4ukX-Y7w5i76eJkApL641w

public class CreatException extends Exception {
	
	private String Error;// tao 1 thuoc tinh cho class Createxception
	
	
	
	public CreatException(String error) {
		super();
		Error = error;
	}


	public void getError() {  // ham in loi 
		
		System.out.println(Error);
	}



	public void setError(String error) {
		Error = error;
	}

}
