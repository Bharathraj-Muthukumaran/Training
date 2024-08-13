package Assignment;

public class variable_types {

		int b = 20;
		static int c = 30;
		
		public static void main(String[] args) {
			int a = 10;
			System.out.println("Local Variable : " +a);
			
			variable_types obj = new variable_types();
			System.out.println(obj.b);
			
			System.out.println(variable_types.c);
		}

	}


