package listnode;

import listnode.model.ListNode;

import java.util.Stack;

/**
 * 从尾到头打印一个链表
 * Swordoffer demo practice
 * Created by zhanglinhai on 2017/3/25.
 * 1、用栈
 * 2、递归，如果一个节点next不为空，则先打印next【注意链表过长，递归过深】
 * 3、改变链表的结构，直接逆序【优点是空间复杂度O(1),缺点是改变了结构】
 */
public class Problem5 {

    /**
     * 使用栈
     */
    public static void printListReverseByStack(ListNode headNode){
        Stack<ListNode> stack=new Stack<ListNode>();
        while(headNode!=null){
            stack.push(headNode);
            headNode=headNode.next;
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop().data);
        }
    }

    /**
     * 递归
     */
    public static void printListReverseIterative(ListNode headNode){
        if(headNode!=null){
            if(headNode.next!=null){//next不为空，先打印next
                printListReverseIterative(headNode.next);
            }
            System.out.println(headNode.data);//再打印local

        }
    }



    /**
     * 测试【使用栈】
     */
    public static void testPrintListReverseByStack(ListNode headNode){

        printListReverseByStack(headNode);
    }

    /**
     * 测试【递归】
     */
    public static void testPrintListReverseIterative(ListNode headNode){
        printListReverseIterative(headNode);
    }

    public static void main(String[] args){
        Problem5 mainClass=new Problem5();
        ListNode headNode=new ListNode();
        headNode.data=1;
        ListNode secondNode=new ListNode();
        secondNode.data=2;
        ListNode thirdNode=new ListNode();
        thirdNode.data=3;
        ListNode forthNode=new ListNode();
        forthNode.data=4;
        headNode.next=secondNode;
        secondNode.next=thirdNode;
        thirdNode.next=forthNode;
//        testPrintListReverseByStack(headNode);
        testPrintListReverseIterative(headNode);
    }
}
