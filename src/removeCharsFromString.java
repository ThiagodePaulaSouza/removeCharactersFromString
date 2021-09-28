
public class removeCharsFromString {

	public static String removeCharsFromString(String str, String charsRemove, String delimiter) {
        
        if (str!=null && charsRemove!=null && charsRemove.length()>0) {
         
	        String[] remover = charsRemove.split(delimiter);
	         
	        for(int i =0; i < remover.length ; i++) {
	            System.out.println("i: " + i + " ["+ remover[i]+"]");
	            if (str.indexOf(remover[i]) != -1)
	                str = str.replace(remover[i], "");
	        }
        }
     
        return str;
	}

}
