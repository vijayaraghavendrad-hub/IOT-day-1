package IOT1;

public class parent {
		void property()
		   {
			   System.out.println("Property");
		   }
		   void marry()
		   {
			   System.out.println("famaily selected girl/boy");
		   }

	 public static class override extends parent{
			void marry()
			{
				System.out.println("campus selected girl/boy");
			}
			public static void main(String[] args) {
				override test = new override();// object
				test.marry();
				test.property();
			
			}
	   }
	}


