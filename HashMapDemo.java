public class HashMapDemo{
  public static void main(String[] args){
    HashMap<String, String> hm = new HashMap<String, String>();
    
    hm.put("one","abc");
    hm.put("two","def");
    
    System.out.println(hm);
    
    String g = hm.get("two");
    System.out.println("The value is " + g);
    
 }
 }
