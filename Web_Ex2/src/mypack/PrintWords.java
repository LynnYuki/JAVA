package mypack;


import java.util.TreeSet;
import java.util.Iterator;

public class PrintWords {
	
     public static  StringBuilder  Print(String s) {
    	 
    	 String words[] =s.split(" ");
    	 TreeSet<String> dictionary=new TreeSet<String>();
         for(int i=0;i<words.length;i++){
           dictionary.add(words[i]);
         } 
    	 
    	 Iterator<String>   te=dictionary.iterator();
    	 StringBuilder    strings=new StringBuilder();
    	 while(te.hasNext()){
             String word=te.next();
             if(!word.equals("null")){
            	 strings.append(word+" "); 
             }
            }
         return strings;
     }
     
    
}
