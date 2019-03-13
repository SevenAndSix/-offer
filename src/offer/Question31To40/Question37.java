package offer.Question31To40;

import offer.tree.BinaryTree;

public class Question37 {
    public String getSerializeString() {
        return serializeString;
    }

    public void setSerializeString(String serializeString) {
        this.serializeString = serializeString;
    }

    private String serializeString;

    public Question37(){
        serializeString="";
    }

    public void serialize(BinaryTree binaryTree){
        if(binaryTree!=null){
            System.out.print(binaryTree.getTreeValue()+"\t");
            serializeString+=binaryTree.getTreeValue();
        }
        else{
            System.out.print("$"+"\t");
            serializeString+="$";
            return;
        }

        serialize(binaryTree.getLeftTree());
        serialize(binaryTree.getRightTree());
    }

    public BinaryTree deSerialize(BinaryTree binaryTree){
        if(serializeString==null||serializeString=="")
            return null;

        if(isDigit(serializeString)){
            int nodeValue=readFirstChar(serializeString);
            BinaryTree curNode=new BinaryTree(nodeValue);

            serializeString=serializeString.substring(1,serializeString.length());
            curNode.setLeftTree(deSerialize(curNode.getLeftTree()));
            curNode.setRightTree(deSerialize(curNode.getRightTree()));
            return curNode;
        }
        else{
            serializeString=serializeString.substring(1,serializeString.length());
            return null;
        }
    }

    //判断第一个字符是否是数字
    public boolean isDigit(String str){
        if(str==null||str=="")
            return false;

        char firstChar=str.charAt(0);
        if(firstChar=='$')
            return false;
        else
            return true;
    }

    //将第一个字符转换成数字
    public int readFirstChar(String str){
        char firstChar=str.charAt(0);
        int result=(int)(firstChar-'0');

        return result;
    }

}

/*
*   Question37测试函数
*       Question37 question37=new Question37();
        BinaryTree binaryTree1=new BinaryTree(1);
        BinaryTree binaryTree2=new BinaryTree(2);
        BinaryTree binaryTree3=new BinaryTree(3);
        BinaryTree binaryTree4=new BinaryTree(4);
        BinaryTree binaryTree5=new BinaryTree(5);
        BinaryTree binaryTree6=new BinaryTree(6);

        binaryTree1.setLeftTree(binaryTree2);
        binaryTree1.setRightTree(binaryTree3);
        binaryTree2.setLeftTree(binaryTree4);
        binaryTree3.setLeftTree(binaryTree5);
        binaryTree3.setRightTree(binaryTree6);

        question37.serialize(binaryTree1);
        question37.getSerializeString();
        BinaryTree headNode=question37.deSerialize(null);
* */
