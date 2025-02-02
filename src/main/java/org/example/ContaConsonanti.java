package org.example;

import java.util.function.Function;

public class ContaConsonanti implements Function<String, Integer> {
    @Override
    public Integer apply(String s) {
        String alphanumeric = s.replaceAll("[^a-zA-Z]", "");
        ContaVocali cont=new ContaVocali();
        return alphanumeric.length()-cont.apply(alphanumeric);
    }
}
