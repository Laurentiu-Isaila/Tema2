
public class Exercitii {
	
	//ex1 rec
	public static int rec (int nr, int rev) {
		if (nr != 0) {
			rev = rev * 10;
			rev = rev + nr % 10;
			nr = nr / 10;
		}else {
			return rev;
		}
		return rec(nr,rev);
	}
	
	//ex2
	public static int pow (int nr, int pow) {
		
		if ( pow == 0) {
			return 1;			
		}
		return (nr * pow(nr, pow - 1));
	}
	
	//ex3
	
	public static void moveZero(int[] array) {
		int aux = array.length - 1;
	    for (int i = array.length - 1; i >= 0; i--) {
	      if (array[i] != 0) {
	        array[aux] = array[i];
	        aux--;
	      }
	    }	 
	    while(aux >= 0) {
	      array[aux] = 0;
	      aux--;
	    }	 
	    for (int i = 0; i < array.length; i++) {
	      System.out.print(array[i] + " ");
	    }
	  }
	
	//ex 4
	
	public static double[] bbleSort(double[]array) {		
		int n = array.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (array[j] > array[j+1]) {                   
                    double temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
			}
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		return array;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
