package listnode;

import listnode.function.ListNodeCommon;
import listnode.model.ListNode;

/**
 * 反转链表
 * Swordoffer demo practice
 * Created by zhanglinhai on 2017/3/25.
 *
 */
public class Problem16 {

    public static ListNode reverseNodelist(ListNode head){
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode p1=head;
        ListNode p2=p1.next;
        ListNode p3=p2.next;
        p1.next=null;
        while(p3!=null){
            p2.next=p1;//reverse
            p1=p2;
            p2=p3;
            p3=p3.next;
        }
        //p3为null，p2为尾节点
        p2.next=p1;
        return p2;//反转结束，再遍历链表即可
    }

    public static void main(String[] args){
        ListNode num1= ListNodeCommon.getHead1Node();

        ListNode tail=reverseNodelist(num1);
        ListNodeCommon.iteratorLinkNode(tail);


    }
}
