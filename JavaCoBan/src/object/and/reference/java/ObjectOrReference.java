package object.and.reference.java;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;

//https://www.geeksforgeeks.org/g-fact-31-java-is-strictly-pass-by-value/

// trong java neu ta truyen cac bien voi kieu gia tri nguyen thuy (int , char , ..) vao cac phuong thuc thi
// gia tri cua bien se k bi thay doi dau khi thu hien song phuong thuc do , do la vi java chi truyen tham tri toi cac
// bien nguyen thhuy 


// ta co the chuyen tham chieu di voi cac bien doi tg (object ) , tuc la co the thay doi dc cac thuc tinh cua doi tuong


class test
{
	int value1;
	int value2;
	public test(int n, int m  ) {
		this.value1= n;
		this.value2= m;
	}
	public test() {
		super();
	}
	
	public void display()
	{
		System.out.println("value 1 :"+this.value1);
		System.out.println("value 2 :"+this.value2);
	}
	
}

public class ObjectOrReference {
	
	public static void change1(test temp)
	{// ham change1 nay se k lam thay doi doi tuong chuyen vao vi ben trong ham da thay doi vung nh moi cho doi tuong
		
		
		// khi doi tuong dc truyen vao thi temp se giu tham chieu cua doi tg dc truyen vao do 
		// sau do neu temp bi thay doi vung nho (tuc la giu tham chieu toi vung khac) thi moi thay doi cua temp sau do k lien qua j toi doi tg dc turyenn vao 		
		temp = new test(); // cap vung nho moi
		temp.value1= 0;
		temp.value2=0;
		
		
	}
	
	public static void change2(test temp)
	{// ham nay co the lam thay doi cac thuoc tinh  cua doi tuong , vi k co cau lenh cap phat vung ho moi cho doi tuog
		// tromg ham nay , temp k bij doi vung tham chieu nen moi thay doi cua temp deu anh huong toi doi tg chuyen vao 
		
		
		
		temp.value1= 0;
		temp.value2=0;
		// neu thay bang temp= new test(0,0); thi se k thay doi dc doi tg, boi vi cau lenh nay se khien cho temp tham chieu den doi tg khac chu k p la doi tg dc chuyen vao nua
	}
	
	public static void change3(test t1, test t2) // ham nay se k the doi gia tri 2 doi tuong dc truyen vao 
	{
		test x= new test(t1.value1, t1.value2); // tao doi tg x tham chieu den doi tuong moi dc tao co cac gia tri giong nhu t1
		t1= t2;//  t1 tham chieu dem doi tg truyen vao tung ung  , nh sau lenh nay t1 da tham chieu toi bien t2
		t2=x; // t2 dang tham chieu toi doi tuong chuyen vao tuong ung , sau lenh nay n tham chieu den doi tg x 
		// vay nen sau cac lenh tren thi t1, t2 da thay doi vung tham chieu nen su thay doi cua t1 , t2 k anh huoong j toi 2 doi tg dc truyen vao trk do
	}
	
	
	public static void change4(test t1 , test t2) // ham doi cho 2 doi trg cho nhau
	{
		int v1= t2.value1;
		int v2= t2.value2;
		
		t2.value1=t1.value1;
		t2.value2=t1.value2;
		
		t1.value1=v1;
		t1.value2=v2;
			
		// lam nhu the nay la thao tac voi cac thuoc tinh cua doi tuong chu k lam thay doi tham chieu cua t1 , t2
	}
	
	public static void main(String[] args) {
		test a  = new test(1,1);
				
		change1(a);
		System.out.println("a after change1() method : ");
		a.display();
		change2(a);
		System.out.println("a  after change2() method : ");
		a.display();
		
		test b= new test(2,2);
		test c= new test(3,3);
		System.out.println("b ,c  before change4() method :");
		b.display();
		c.display();
		change4(b, c);
		
		System.out.println("b ,c  after change4() method :");
		b.display();
		c.display();

		System.out.println("hieu ro hon ve tham chieu doi tg :\n");
		test d = new test(4,4);
		test e = new test(5,5);
		System.out.println("d khi chua lam j :");
		d.display();
		
		d=e; // d tham chieu den e
		
		d.display(); // in ra cac thuoc tinh cua d , cx chinh la cac thuoc tinh cua e dang giu vi d tham chieu toi e
		
		// thay doi cac thuoc tinh cua d , vi d tham chieu toi e nen luk nay e cx bi thay doi theo 
		d.value1=0;
		d.value2=0;
		System.out.println("after changes");
		
		e.display();
		
		d.display();
	}

}
