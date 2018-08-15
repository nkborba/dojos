package com.nkborba;

public class Main {

    public static void main(String[] args) {

        VerifyLeapYear verificaAno = new VerifyLeapYear();
        mergeStrings mergeStrings = new mergeStrings();

//        Verificar se um ano é bisexto ou não
//        String result = Boolean.toString(verificaAno.isALeapOrNot(2000));

//        Concatenar duas strings intercalando primeiros chars
        String result = mergeStrings.merge("aaaa", "bbbbcSccc");


        System.out.print(result);

    }
}
