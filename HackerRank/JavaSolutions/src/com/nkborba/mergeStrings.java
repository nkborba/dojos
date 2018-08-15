package com.nkborba;

public class mergeStrings {

    public String merge(String a, String b){

        String result = "";

        for(int cont = 0; cont < a.length() || cont < b.length(); cont++){
            if(cont < a.length()){
                result += a.charAt(cont);
            }
            if(cont < b.length()){
                result += b.charAt(cont);
            }
        }

        return result;
    }

}
