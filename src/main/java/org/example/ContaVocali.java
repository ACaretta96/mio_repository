package org.example;

import java.util.function.Function;

public class ContaVocali implements Function<String, Integer> {
    @Override
    public Integer apply(String s) {
        Integer count=0;
       char[] parola=s.toCharArray();
       for(char c: parola){
           if(c=='a' || c=='e'|| c=='i'|| c=='o' || c=='u'){
               count++;
           }
       }
       return count;
    }
}
