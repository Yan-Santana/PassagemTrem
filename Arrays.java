
public class Arrays{

	int[] arr; 
	
	Arrays(int n){ 
		arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i]= -1;
		}		
	}
	
	Arrays(int n, int v){ 
		arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]= v;
		}   		
	}

    void resetaArray(){ 
		for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }    		
    }

	int somaValores(){ 
		int soma = 0;
        for (int i = 0; i < arr.length; i++) {
            soma += arr[i];
        }
        return soma;
    }
}