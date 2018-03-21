package object.oriented;
// https://www.geeksforgeeks.org/overriding-tostring-method-in-java/
// https://www.geeksforgeeks.org/?p=15616
class complex
{
	float re;
	float im;
	
	
	
	public complex(float re, float im) {
		super();
		this.re = re;
		this.im = im;
	}


	// override phuong thuc toString() cho class complex
	@Override
	public String toString() {
		return String.format("%g+%g*i", re,im);
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(im);
		result = prime * result + Float.floatToIntBits(re);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		
		// kiem tra xem co dem doi tg di so sanh voi chinh n hay k 
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) // neu doi tuong hien tai khac class ovi obj thi sai 
			return false;// trong cau lenh if nay cx co the dung  if(obj instanceof complex != true)
		complex other = (complex) obj;// neu obj la mot the hien (instance) cua class complex thi ta ep kieu de tien so sanh 
		
		// so sanh 
		
		return Float.compare(this.im, other.im)== 1 && Float.compare(this.re, other.re)==1;
	}
	
	
	
}

public class Overridig_ToString_Equal_InJava {

	public static void main(String[] args) {
		complex z= new complex(1, 2);
		
		System.out.println(z.toString()); // hai cau lenh sau co cung 1 chua nang 
		System.out.println(z);
		
		
		complex z2= new complex(2, 2);
		System.out.println("z = z2 ? "+z.equals(z2));
		
	}
	
}
