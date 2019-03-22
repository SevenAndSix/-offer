import com.sun.org.apache.xpath.internal.SourceTree;
import offer.Question51_60.*;
import offer.Question61_66.*;
import offer.dataStruct.LNode;
import offer.sortAlgorithm.*;
import offer.tree.BinaryTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class Main {

    public static int numUniqueEmails(String[] emails) {
        Set<String> realEmail=new HashSet();

        for(int i=0;i<emails.length;i++){
            String[] temp=emails[i].split("@");
            temp[0]=temp[0].replaceAll("\\.","");
            int plusLocation=temp[0].indexOf('+');
            String localName=temp[0].substring(0,plusLocation-1);

            String finalEmail=localName+"@"+temp[1];
            realEmail.add(finalEmail);
        }
        System.out.println(realEmail.size());

        for(String email:realEmail){
            System.out.print("\""+email+"\" ");
        }
        System.out.println("actually receive mails ");

        return realEmail.size();
    }



    public static void main(String[] args){
        Question65 question65=new Question65();
        int sum=question65.calculateSum(7,15);
    }

}



