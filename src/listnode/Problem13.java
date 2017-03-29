package listnode;

import listnode.model.ListNode;

/**
 * 在O(1)时间删除链表节点
 * Swordoffer demo practice
 * Created by zhanglinhai on 2017/3/25.
 */
public class Problem13 {
    public static void deleteNode(ListNode headNode, ListNode deleteNode){
        if(headNode==null||deleteNode==null){
            return;
        }
        //链表只有一个节点，删除节点，并置为null
        if(deleteNode==headNode){
            headNode=null;
        }else{
            //节点为尾节点，遍历链表删除
            if(deleteNode.next==null){
                ListNode pointNode=headNode;
                while(pointNode.next!=null){
                   pointNode=pointNode.next;
                }
                pointNode=null;
            }else{
                //中间节点，复制后面的节点到当前节点，并删除后面的节点
                ListNode nextNode=deleteNode.next;
                deleteNode.data=nextNode.data;
                deleteNode.next=nextNode.next;
                nextNode=null;
            }
        }






    }
}
