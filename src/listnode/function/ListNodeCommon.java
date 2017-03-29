package listnode.function;


import listnode.model.ListNode;

/**
 * Swordoffer demo practice
 * Created by zhanglinhai on 2017/3/26.
 */
public class ListNodeCommon {

    /**
     * 遍历链表
     * @param head
     */
    public static void iteratorLinkNode(ListNode head){
        if(head==null){
            return;
        }
        if(head.next==null){
            System.out.println(head.data);
        }
        ListNode pointNode=head;
        while (pointNode.next!=null){
            System.out.print(pointNode.data+",");
            pointNode=pointNode.next;
        }
        System.out.print(pointNode.data+",");
    }

    /**
     * 测试链表1
     * 1->2->3->4
     * @return
     */
    public static ListNode getHead1Node(){
        ListNode num1=new ListNode();
        ListNode num2=new ListNode();
        ListNode num3=new ListNode();
        ListNode num4=new ListNode();

        num1.data=1;
        num1.next=num2;
        num2.data=2;
        num2.next=num3;
        num3.data=8;
        num3.next=num4;
        num4.data=10;
        num4.next=null;
        return num1;
    }

    /**
     * 测试链表2
     * 3->6->8->10
     * @return
     */
    public static ListNode getHead2Node(){
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
        return num1;
    }
}
