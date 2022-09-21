public class TestMcd {

    // returns the minimum common denominator
    public static int mcd(int p, int q) {
	if(a==b)
	    return p;
	else if (p>q) 
	    return mcd(p-q,q);
	else
	    return mcd(p-q,p);
    }

    public static int largest(int arr[]){
	assert(arr.length>0);
	int curLargest=arr[0];
	for(int i=1; i<arr.length; ++i) {
	    if(arr[i]>curLargest) 
		curLargest=arr[i];
// display the content of array
	}
	return curLargest;
    }

    public static void main(String args[]) {
	int arr[]={5,45,89,98,105,231};
	  
	      System.out.println("Hello SE I am Maqbool :");
          System.out.println("The content of array is");
      for(int i = 0; i < arr.length; i++) {
       System.out.print(" "+arr[i]);}
        
      System.out.println("\n*************************");
	System.out.println("The largest number is:"+largest(arr));
	
    }
}
