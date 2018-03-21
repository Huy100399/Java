package object.oriented;


class InstanceInitializerBlock
{
	//https://www.geeksforgeeks.org/instance-initialization-block-iib-java/
	//// https://www.geeksforgeeks.org/g-fact-26-the-initializer-block-in-java/ 
	
	
	int a=1;
	//InstanceInitializerBlock
	// InstanceInitializerBlock luon thu thi trc moi loai ham tao khi khoi tao doi tg 
	// k qun trong InstanceInitializerBlock dat trc hay sau cac contructor 
	{
		System.out.println("InstanceInitializerBlock executed !");
	}
	
	public InstanceInitializerBlock(int a) {
		super();
		this.a = a;
		System.out.println("contrucctor 1 !");
	}

	public InstanceInitializerBlock() {
		super();
		System.out.println("contructor 2 !");
	}
	
}


class MultipleInstanceInitializerBlock
{//https://www.geeksforgeeks.org/instance-initialization-block-iib-java/
	// khi co nhieu IIB trong mot class thi n cac IIB nay de dc thuc hien tu tren xuong duoi va luon trc cac contructor moi khi cac doi tg dc tao ra
	int a;
	
	{
		System.out.println("IIB 1");
	}

	public MultipleInstanceInitializerBlock(int a) {
		super();
		this.a = a;
		System.out.println("contructor 1");
	}

	public MultipleInstanceInitializerBlock() {
		super();
		System.out.println("contructor 2");
		
	}
	
	{
		System.out.println("IIB 2");
	}
	
	{
		System.out.println("IIB 3");
	}
	
}


class InstanceInitializationBlockWithParentClass  
{
	public InstanceInitializationBlockWithParentClass() {
		System.out.println("contructor of supper class called !");
	}
	
	{
		System.out.println("IIB1 of supper  class !");
	}
	
	{
		System.out.println("IIB2 of supper class !");
	}
	
}


class sub extends InstanceInitializationBlockWithParentClass
{
	int n;

	public sub(int n) {
		super();
		this.n = n;
	}
	
	{
		System.out.println("IIB1 of sub class !");
	}
	
	{
		System.out.println("IIB2 of sub class !");
	}
	
}




public class InitializerBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("InstanceInitializerBlock \n\n");
		InstanceInitializerBlock a= new InstanceInitializerBlock(1);
		InstanceInitializerBlock b= new InstanceInitializerBlock();
		
		System.out.println("IMultiplenstanceInitializerBlock\n\n");
		MultipleInstanceInitializerBlock c= new MultipleInstanceInitializerBlock();
		MultipleInstanceInitializerBlock d= new MultipleInstanceInitializerBlock(1);
		
		
		System.out.println("InstanceInitializationBlockWithParentClass\n\n");
		
		sub f= new sub(0);
	}

}
