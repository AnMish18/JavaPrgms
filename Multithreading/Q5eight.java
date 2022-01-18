//qn 5
//Anwesha Mishra-11
 class Q5eight
{
	public static void main(String[] args) {
	    String str = "india is great";
	    String words[]=str.split("\\s");  
        String newWord ="";
        
        for(String w: words){
            String top = w.substring(0,1); //obtain first letter  
            String left = w.substring(1);    //the rest of the letter    
            
            newWord+=top.toUpperCase()+ left + " ";  
        }  
        System.out.println(newWord.trim());
	}
}