package pavaaaaaan;
	interface Demo{
		void display();
	}
	public class InterfaceDemo implements  Demo {
		public void display()
		{
			System.out.println("this is pavan ");	
		}

		public static void main(String[] args) {
			InterfaceDemo ii=new InterfaceDemo();
			ii.display();
		}

	}