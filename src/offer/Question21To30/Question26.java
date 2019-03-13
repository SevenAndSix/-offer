package offer.Question21To30;

import offer.tree.DoubleBinaryTree;

public class Question26 {
    public boolean subTree(DoubleBinaryTree doubleTree1,DoubleBinaryTree doubleTree2){
        boolean isInclude=false;

        if(doubleTree1!=null&&doubleTree2!=null){
            double number1=doubleTree1.getTreeValue();
            double number2=doubleTree2.getTreeValue();

            if(doubleEqual(number1,number2)){
                isInclude=hasSubTree(doubleTree1,doubleTree2);
            }
            if(!isInclude){
                isInclude=subTree(doubleTree1.getLeftTree(),doubleTree2);
            }
            if(!isInclude){
                isInclude=subTree(doubleTree1.getRightTree(),doubleTree2);
            }
        }

        return isInclude;
    }

    public boolean hasSubTree(DoubleBinaryTree doubleTree1,DoubleBinaryTree doubleTree2){
        if(doubleTree1==null&&doubleTree2==null)
            return true;
        if(doubleTree1!=null&&doubleTree2==null)
            return true;
        if(doubleTree1==null&&doubleTree2!=null)
            return false;

        double number1=doubleTree1.getTreeValue();
        double number2=doubleTree2.getTreeValue();
        if(!doubleEqual(number1,number2))
            return false;

        return hasSubTree(doubleTree1.getLeftTree(),doubleTree2.getLeftTree())
                &&hasSubTree(doubleTree1.getRightTree(),doubleTree2.getRightTree());
    }

    public boolean doubleEqual(double number1,double number2){
        if(((number1-number2)>(-0.000001))&&((number1-number2)<(0.000001)))
            return true;
        else
            return false;
    }
}

/*
*   Question26测试函数
*       DoubleBinaryTree aTree=new DoubleBinaryTree(8.0);
        DoubleBinaryTree bTree=new DoubleBinaryTree(8.0);
        DoubleBinaryTree cTree=new DoubleBinaryTree(7.0);
        DoubleBinaryTree dTree=new DoubleBinaryTree(9.0);
        DoubleBinaryTree eTree=new DoubleBinaryTree(2.0);
        DoubleBinaryTree fTree=new DoubleBinaryTree(4.0);
        DoubleBinaryTree gTree=new DoubleBinaryTree(7.0);

        aTree.setLeftTree(bTree);
        aTree.setRightTree(cTree);

        bTree.setLeftTree(dTree);
        bTree.setRightTree(eTree);

        eTree.setLeftTree(fTree);
        eTree.setRightTree(gTree);

        dTree.setLeftTree(null);
        dTree.setRightTree(null);

        cTree.setLeftTree(null);
        cTree.setRightTree(null);

        fTree.setLeftTree(null);
        fTree.setRightTree(null);

        gTree.setLeftTree(null);
        gTree.setRightTree(null);

        DoubleBinaryTree xTree=new DoubleBinaryTree(8.0);
        DoubleBinaryTree yTree=new DoubleBinaryTree(9.0);
        DoubleBinaryTree zTree=new DoubleBinaryTree(2.0);

        xTree.setLeftTree(yTree);
        xTree.setRightTree(zTree);

        yTree.setLeftTree(null);
        yTree.setRightTree(null);

        zTree.setLeftTree(null);
        zTree.setRightTree(null);

        Question26 question26=new Question26();
        System.out.println(question26.subTree(aTree,xTree));
* */
