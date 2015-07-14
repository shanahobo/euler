public class AddFloats{
	
    public static void main(String[] args) {
    	
    	float a = (float) 12.12341234132;
    	
    	float b = (float) 23412.1325345;
    	
    	System.out.println(AddNums(a, b));
    }
	
	
	static int AddNums(float num1, float num2){
		
		float sum = num1 + num2;
		return (int)Math.floor(sum);
	}
}