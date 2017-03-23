package funky_übung;

public class startklasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0;
		
		
		int[] aArray= {1,2,3,4,5};
		
		//System.out.println(aArray[i]);
		
		
		int[]bArray= {3,4,4,4,4};
		
		//System.out.println(bArray[i]);
		
		for(int b = 0; b < bArray.length; b++){
			
		bArray[b] = aArray[b];
		System.out.println(bArray[b]);
		
		}
	}

}
