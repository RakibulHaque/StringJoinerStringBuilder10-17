import java.util.StringJoiner;

// Java program to demonstrate use of  
// StringJoiner class over StringBuilder class 
public class Test {
	
	public static void main(String[] args)
	{
		//given string array
		
		String str[] = {"Prangon","akib","Rakibul"};
		 // By using StringJoiner class 
        
        // initializing StringJoiner instance with 
        // required delimiter, prefix and suffix 
		StringJoiner つなげる = new StringJoiner(":","[","]");
		
		つなげる.add("Prangon").add("akib").add("Rakibul");
		
		String desiredString = つなげる.toString();
		
		System.out.println(desiredString);
		
		StringBuilder ほかの方法 = new StringBuilder();
		
		ほかの方法.append("[");
		
		if(str.length>0)
		{
			ほかの方法.append(str[0]);
			
			for (int i=1; i<str.length;i++)
			{
				ほかの方法.append(":").append(str[i]);
			}
			
		}
		
		ほかの方法.append("]");
		
		String desiredString1 = ほかの方法.toString();
		
		System.out.println(desiredString1);
		
		
	}

}
