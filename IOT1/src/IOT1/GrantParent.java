package IOT1;
class GrandParent
{
	void bp()
	{
		System.out.println(" understain   bp");
	}
}
class Father extends GrandParent{
	void cancer()
	{
		System.out.println(" understain");
	}
	
}
 class Demo extends Father{

	public static void main(String[] args) {
 		Demo  bb= new Demo();
 		bb.bp();
 		bb.cancer();
	}
}
