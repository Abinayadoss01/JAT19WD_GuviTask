package Day9;

public class pattern2 {
	
	
	public void pat1() {
		int j ;
		for(int i=2;i<5;i++){
			if(i==3) {
				System.out.print("**");
				
			break;
			}
			else if(i>3){
				System.out.print("**");
				
			break;
			}
					
			for( j=1;j<=2;j++) {
							
			System.out.print("* ");	
				}
			System.out.println("");
			}
		System.out.println();}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern2 obj = new pattern2();
		obj.pat1();
		for( int k=0;k<3;k++) {
			if(k==2) {
				System.out.print("* *");
				
			break;
			}
			
			for(int l=0; l<=k; l++)   
			{  
			
			System.out.print("*");   
			}   
			System.out.println();  
			}
	
	

		
}}

