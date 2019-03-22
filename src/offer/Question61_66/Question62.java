package offer.Question61_66;

import java.util.LinkedList;

public class Question62 {
    public int lastRemain(int n,int m){
        if(n<1||m<1)
            return -1;

        LinkedList<Integer> linkedList=new LinkedList<>();
        for(int i=0;i<n;i++)
            linkedList.addLast(i);

        int cur=0;   //指向计数开始的节点
        while(linkedList.size()!=1){
            for(int j=0;j<m-1;j++){
                if(cur==linkedList.size())  //适用于删除的数据为LinkedList末尾元素
                    cur=0;

                cur++;

                if(cur==linkedList.size())  //适用于在改变索引过程中超出LinkedList的大小
                    cur=0;
            }
            linkedList.remove(cur);
        }

        return linkedList.getFirst();
    }
}

/*
* 测试函数
*       Question62 question62=new Question62();
        int result=question62.lastRemain(5,6);
* */
