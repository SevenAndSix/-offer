import offer.Question51_60.Question52;
import offer.Question51_60.Question53;
import offer.Question51_60.Question54;
import offer.dataStruct.LNode;
import offer.sortAlgorithm.*;
import offer.tree.BinaryTree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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



    public static void main(String[] args) {
        BinaryTree head=new BinaryTree(5);
        BinaryTree node1=new BinaryTree(3);
        BinaryTree node2=new BinaryTree(7);
        BinaryTree node3=new BinaryTree(2);
        BinaryTree node4=new BinaryTree(4);
        BinaryTree node5=new BinaryTree(6);
        BinaryTree node6=new BinaryTree(8);

        head.setLeftTree(node1);
        head.setRightTree(node2);

        node1.setLeftTree(node3);
        node1.setRightTree(node4);

        node2.setLeftTree(node5);
        node2.setRightTree(node6);

        Question54 question54=new Question54(3);
        BinaryTree resultNode=question54.findKthNode(head,3);
    }

}



