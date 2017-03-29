package listnode;

import listnode.model.ListNode;

/**
 * 链表中的倒数第K个节点
 * Swordoffer demo practice
 * Created by zhanglinhai on 2017/3/25.
 */
public class Problem15 {

    public static void findKtoTail(ListNode head, int k){
        if(head==null || k==0){
            return;
        }
        ListNode quickNode=head;
        ListNode slowNode=head;
        for(int i=0;i<k-1;i++){
            if(quickNode.next!=null){
                quickNode=quickNode.next;//快指针先走K-1步,两个指针相差K-1
            }else{
                return;
            }
        }
        //两个指针一起走，当快指针到达最后一个节点时，结束，慢指针返回倒数第K个节点
        while (quickNode.next!=null){
            quickNode=quickNode.next;
            slowNode=slowNode.next;
        }
        System.out.println(slowNode.data);

    }

    public static void testFindKtoTail(){
        ListNode num1=new ListNode();
        ListNode num2=new ListNode();
        ListNode num3=new ListNode();
        ListNode num4=new ListNode();

        num1.data=1;
        num1.next=num2;
        num2.data=2;
        num2.next=num3;
        num3.data=3;
        num3.next=num4;
        num4.data=4;
        num4.next=null;

        findKtoTail(num1,0);

    }
    public static void main(String[] args){
        testFindKtoTail();
    }

}
