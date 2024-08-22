public class pp {
    public static boolean [] map = new boolean[26];
   public static String []keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
   public static void printcom(String str , int idx, String comb){
    if(idx==str.length()){
        System.out.println(comb);
        return;
    }
   
    for(int i =0;i<keypad[str.charAt(idx)-'0'].length();i++){
        char curr = keypad[str.charAt(idx)-'0'].charAt(i);
        printcom(str, idx+1, comb+curr);
    }
   }
        
 
    public static void main(String[] args) {
        String str ="23";
        printcom("23", 0, "");
       
       
      
       


       
    }
}

