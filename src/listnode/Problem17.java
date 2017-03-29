package listnode;

import listnode.function.ListNodeCommon;
import listnode.model.ListNode;

/**
 * 合并两个排序的链表
 * Swordoffer demo practice
 * Created by zhanglinhai on 2017/3/25.
 */
public class Problem17 {
    //返回两个链表头结点较小的头结点节点，拼接到新链表
    public static ListNode mergerList(ListNode head1, ListNode head2){
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        ListNode newLinkNode=null;
        if(head1.data<head2.data){
            newLinkNode=head1;
            newLinkNode.next=mergerList(head1.next,head2);
        }else{
            newLinkNode=head2;
            newLinkNode.next=mergerList(head1,head2.next);
        }
        return newLinkNode;
    }

    public static void main(String[] args){
        ListNode head1= ListNodeCommon.getHead1Node();
        ListNode head2=ListNodeCommon.getHead2Node();
        ListNode newNode=mergerList(head1,head2);
        ListNodeCommon.iteratorLinkNode(newNode);
    }

}
