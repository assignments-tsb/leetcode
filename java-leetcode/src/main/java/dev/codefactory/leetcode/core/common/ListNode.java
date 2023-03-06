package dev.codefactory.leetcode.core.common;


import java.util.LinkedList;
import java.util.List;

public class ListNode {
     public int val;
     public ListNode next;

     public ListNode() {}
     public ListNode(int val) {
         this.val = val;
     }

     public ListNode(int val, ListNode next) {
         this.val = val; this.next = next;
     }

     public static ListNode from(int[] arr) {
         if (arr==null || arr.length<1) return null;

         ListNode head = new ListNode(arr[arr.length-1]);

         for (int i=arr.length-2; i>=0; i--) {
             ListNode newNode = new ListNode(arr[i]);
             newNode.next = head;
             head = newNode;
         }

         return head;
     }

     public int[] toArray() {
         List<Integer> temp = new LinkedList<>();
         temp.add(val);

         ListNode current = next;
         while (current!=null) {
             temp.add(current.val);
             current = current.next;
         }

         return temp.stream().mapToInt(Integer::intValue).toArray();
     }

    @Override
    public String toString() {
        return "" + val;
    }
}
