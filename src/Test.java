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
		StringJoiner �Ȃ��� = new StringJoiner(":","[","]");
		
		�Ȃ���.add("Prangon").add("akib").add("Rakibul");
		
		String desiredString = �Ȃ���.toString();
		
		System.out.println(desiredString);
		
		StringBuilder �ق��̕��@ = new StringBuilder();
		
		�ق��̕��@.append("[");
		
		if(str.length>0)
		{
			�ق��̕��@.append(str[0]);
			
			for (int i=1; i<str.length;i++)
			{
				�ق��̕��@.append(":").append(str[i]);
			}
			
		}
		
		�ق��̕��@.append("]");
		
		String desiredString1 = �ق��̕��@.toString();
		
		System.out.println(desiredString1);
		
		
	}

}
