package object.oriented;


// https://www.geeksforgeeks.org/g-fact-79/ 

/*
 * static block co the dc dung cho cac qua trinh khoi tao tinh cua 1 class 
 * 
 * nhx cau lenh nam ben trong static block se dc thuc thi chi mot lan duy nhat 
 * ngay  sau lan dau tien ban tao ra mt doi tuong cua class hoac lan dau tien truy cap 
 * toi static member  (tham tri k can tao ra doi tuong ) 
 * 
 * 
 * static blocks cx dc thu hien trc cac contructor 
 * 
 * 
 */

class AA
{
	public  int a;
	
	
	
	public AA(int a) {
		super();
		this.a = a;
		System.out.println("contructor called !");
	}

	public static void print()
	{
		System.out.println("this is static member of class ");
	}
	
	static 
	{
		System.out.println("static blocks called !");
	}
	
}


public class StaticBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AA.print(); // k can tao doi tg nhg static block van dc thuc thi 
		
		AA.print(); // va thuc thi mot lan duy nhat 
		
		
		AA a= new AA(2); // static blocks dc thuc thi trc cac contructor ,va duy nhat mot lan ,(xoa 2 dong tren de kiem chung )
		
	}

}
