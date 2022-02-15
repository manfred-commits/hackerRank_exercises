package com.manfredipiraino.lexicographical;

import java.util.Arrays;
import java.util.Scanner;

public class Program {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String[] arrayString=new String[s.length()];
        char[] sToChar=s.toCharArray();
        for (int i =0; i <sToChar.length; i++){
            for(int j=i;j<i+k;j++){
                if(arrayString[i]==null){
                    arrayString[i]="";
                }
                if(j<s.length() ){
                    arrayString[i]+=sToChar[j];
                }
            }
            if(arrayString[i].length()<k){
                arrayString[i]="";
            }
        }
//        for(int i=0;i<arrayString.length;i++){
//            String tmp="";
//            for(int j=0;j<arrayString.length;j++){
//                if(arrayString[i]!="" && arrayString[j]!=""){
//                    char[] tmpC1=arrayString[i].substring(0, arrayString[i].length()).toCharArray();
//                    char[] tmpC2=arrayString[j].substring(0, arrayString[j].length()).toCharArray();
//                    if(tmpC1[0]<tmpC2[0]){
//                        tmp=arrayString[j];
//                        arrayString[j]=arrayString[i];
//                        arrayString[i]=tmp;
//                    }
//                }
//            }
//        }
        Arrays.sort(arrayString);
//        for(String str: arrayString){
//            System.out.println(str);
//        }
        for(int i=0;i<arrayString.length;i++){
            if(smallest==""){
                smallest=arrayString[i];
            }else if(i>0 && arrayString[i]!=""){
                largest=arrayString[i];
            }
        }
        if(largest==""){
            largest=smallest;
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {

        String s = "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
        int k = 144;

        System.out.println(getSmallestAndLargest(s, k));
    }
}
