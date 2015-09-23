package programming.assignments;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Arundeep Singh";
		char[] c = s.toCharArray();
		int size = c.length;
		
		int i = 0; //Number at index
		int j = 0; //Number to compare with
		int counter = 0; //Number of times character occur
		
		for( i =0; i<size; i++){
			counter = 0;
			for(j=0; j< size; j++){
				
				if( j<i && c[i]==c[j]){
					break;
				}
				
				if(c[j]==c[i]){
					counter++;
				}
				if(j == size-1){
					System.out.println("The Character  "+c[i]+" comes "+ counter + " times");
					
				}
			
			} //end of j loop
			
		} // end of i loop
	
	}	// end of main

} //end of class
