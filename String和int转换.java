class D{ 
		static int a,b,c;
		public static String C;
		public static void main(String args[]){
			add("456","879");
			System.out.println(C);
		}
		public static String add(String A ,String B){
			try{
				a=Integer.parseInt(A);
				b=Integer.parseInt(B);
				c=a+b;
				}
			catch(Exception e){
				System.out.println("ERROR");
			}
		C=Integer.toString(c);
		return C;
		}
}
