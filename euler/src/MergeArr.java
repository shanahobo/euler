import java.util.Arrays;

public class MergeArr{
	
    public static void main(String[] args) {
    	
     	
    	String [] words = {"cat", "cviic"};
    	
    	for(int i = 0; i<words.length; i++){
             
             
             String [] chars = words[i].split("(?!^)");
             
             for(int x = 0 ; x < chars.length; x++){
            	 System.out.println(chars[x]);
             }
             
             
         }
    
    }

}