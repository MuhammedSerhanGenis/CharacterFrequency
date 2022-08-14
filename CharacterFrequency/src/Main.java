/**
  *Finding number of repetitions of each character in a sentence using Map Interface.
  * 
  *Muhammed Serhan Genis
  *14.08.2022
  *
*/
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Main {
    
    
    
    public static void main(String args[]){
        
        Map<Character,Integer> charFrequency=new TreeMap<Character,Integer>();
        
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter a sentence : ");
        String sentence= scanner.nextLine();
        System.out.println();
        for(int i=0;i<sentence.length();i++){
            
            char c= sentence.charAt(i);
            
            if(charFrequency.containsKey(c)){
                charFrequency.put(c, charFrequency.get(c)+1);
            }
            else{
                charFrequency.put(c, 1);
            }
            
        }
        
        for(Character key: charFrequency.keySet()){
            
            System.out.println("Character "+key+" : "+charFrequency.get(key)+" times.");
            
        }
        
        
        
    }
    
    
    
}
