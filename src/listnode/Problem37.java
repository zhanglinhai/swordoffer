package listnode;

import listnode.model.ListNode;

import java.util.Stack;

/**
 * 两个链表的第一个公共节点
 * Swordoffer demo practice
 * Created by zhanglinhai on 2017/3/25.
 *
 * 都是单链表，从公共节点开始后续节点完全一致，也就是一个Y字型，而不是X型
 */
public class Problem37 {

    /**
     * 两个栈分别存放链表，同时pop，当两个节点不一致时，上一个节点就是第一个公共节点
     * @param head1
     * @param head2
     * 时间复杂度O(m+n)
     * 空间复杂度O(m+n)
     */
    public static void findFirstCommonNodeByStack(ListNode head1, ListNode head2){
        if(head1==null || head2==null){
            return;
        }
        Stack<ListNode> stack1=new Stack<ListNode>();
        while (head1.next!=null){
            stack1.push(head1);
            head1=head1.next;
        }
        stack1.push(head1);

        Stack<ListNode> stack2=new Stack<ListNode>();
        while(head2.next!=null){
            stack2.push(head2);
            head2= head2.next;
        }
        stack2.push(head2);

        ListNode commonNode=null;
        while (!stack1.isEmpty()&&!stack2.isEmpty()){
            ListNode pop1=stack1.pop();
            ListNode pop2=stack2.pop();
            if(pop1.equals(pop2)){
                commonNode=pop1;
            }else{
                break;
            }
        }
        System.out.println(commonNode.data);
    }

    /**
     * 不使用栈,先计算1和2的长度，假如1比2大n，则1指针先走n步，当1指针等于2指针的时候，就是第一个相等的节点
     * 时间复杂度O(m+n)
     * 空间复杂度0(1)
     */
    public static void findFirstCommonNodeNoStack(ListNode head1,ListNode head2){
        if(head1==null || head2==null){
            return;
        }
        //先分别遍历，计算长度，目的是计算差值
        ListNode pointNode1=head1;
        ListNode pointNode2=head2;
        int length1=1;
        while (pointNode1.next!=null){
            length1++;
            pointNode1=pointNode1.next;
        }
        int length2=1;
        while (pointNode2.next!=null){
            length2++;
            pointNode2=pointNode2.next;
        }


         pointNode1=head1;
         pointNode2=head2;
        //长度较长的链表，指针先走N步
        int diff=0;
        if(length1>length2){
            diff=length1-length2;
            for(int i=0;i<diff;i++){
                pointNode1=pointNode1.next;
            }
        }else if(length1<length2){
            diff=length2-length1;
            for(int i=0;i<diff;i++){
                pointNode2=pointNode2.next;
            }
        }

        while (pointNode1.next!=null && pointNode2.next!=null){
            if(pointNode1!=pointNode2){
                pointNode1=pointNode1.next;
                pointNode2=pointNode2.next;
            }else{
                break;
            }
        }
        if(pointNode1.next==null){//到尾节点未找到
            if(pointNode1==pointNode2){//比较尾节点
                System.out.println(pointNode1.data);
            }
        }else{//找到了，直接输出
            System.out.println(pointNode1.data);
        }
    }

    public static void testfindFirstCommonNodeByStack(){

        ListNode num1=new ListNode();
        ListNode num2=new ListNode();
        ListNode num3=new ListNode();
        ListNode num4=new ListNode();
        num1.data=3;
        num1.next=num2;
        num2.data=6;
        num2.next=num3;
        num3.data=8;
        num3.next=num4;
        num4.data=10;
        num4.next=null;

        ListNode node21=new ListNode();
        ListNode node22=new ListNode();
        ListNode node23=new ListNode();
        ListNode node24=new ListNode();
        node21.data=1;
        node21.next=node22;
        node22.data=2;
        node22.next=num3;

//        findFirstCommonNodeByStack(num1,node21);
        findFirstCommonNodeNoStack(num1,node21);
    }

    public static void main(String[] args){
        testfindFirstCommonNodeByStack();
    }
}
