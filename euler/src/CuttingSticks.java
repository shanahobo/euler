public class CuttingSticks {
	
    public static void main(String[] args) {
    	
    	int[]arr = {12, 34, 12, 56, 3, 7};
        	
    	cutSticks(arr);
    }
    
    static void cutSticks(int[]lengths){
    	
    	if(lengths.length==0){
    		return;
    	}
    	
    	int smallCut=Integer.MAX_VALUE;
    	for(int i = 0; i<lengths.length-1; i ++){
    		if(smallCut>lengths[i]&&lengths[i]>0){
    			smallCut = lengths[i];
    		}
    	}
    	
    	// min length of cut must be 1
    	if(smallCut==0){
    		smallCut=1;
    	}
    	
    	int count = 0;
    	for(int i = 0; i<lengths.length; i ++){
    		
    		if(lengths[i]>0){
    			lengths[i]=lengths[i]-smallCut;
    			count++;
    		}
    	}
    	
    	if(count==0){
    		return;
    	}
    	else{
    		System.out.println(count);
    	}
    	
    	cutSticks(lengths);    	
    }
}