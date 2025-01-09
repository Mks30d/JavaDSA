package DSA_Questions.Leetcode.LinkedList;

import DSA_Questions.Leetcode.ListNode;

import java.util.ArrayList;
import java.util.Collections;

public class MergeTwoSortedLists {
    // Time Complexity: O(n + m)
    // Space Complexity: O(1)

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1, temp2 = list2;
        ListNode head = new ListNode(-1);
        ListNode temp = head;

        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) {
                temp.next = temp1;
                temp = temp1;
                temp1 = temp1.next;
            } else {
                temp.next = temp2;
                temp = temp2;
                temp2 = temp2.next;
            }
        }

        if (temp1 != null) {
            temp.next = temp1;
        } else {
            temp.next = temp2;
        }

        return head.next;
    }

    // Time Complexity: O(n + m) -----------------------------------
    // Space Complexity: O(n + m)
    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        // Handle edge cases where one or both lists are null
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        ListNode temp1 = list1, temp2 = list2;
        int k = 1;
        ListNode head = null, temp = head;

        if (temp1.val <= temp2.val) {
            head = temp1;
            temp1 = temp1.next;
        } else {
            head = temp2;
            temp2 = temp2.next;
        }
        temp = head;

        while (temp1 != null && temp2 != null) {
            if (temp1.val < temp2.val) {
                ListNode newnode = new ListNode(temp1.val);
                temp.next = newnode;
                temp = newnode;
                temp1 = temp1.next;
            } else {
                ListNode newnode = new ListNode(temp2.val);
                temp.next = newnode;
                temp = newnode;
                temp2 = temp2.next;
            }
        }

        if (temp1 != null) {
            temp.next = temp1;
        } else {
            temp.next = temp2;
        }

        return head;
    }

    // n = (n1 + n2) ----------------------------------------------
    // Time Complexity: O(n1) + O(n2) + O(n log n) +O(n)
    // Space Complexity: O(n1 + n2)
    public ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
        if(list1 == null && list2== null) {
            return null;
        }
        ListNode temp1 = list1, temp2 = list2;
        ArrayList<Integer> arr = new ArrayList<>();

        while (temp1 != null) {
            arr.add(temp1.val);
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            arr.add(temp2.val);
            temp2 = temp2.next;
        }

        Collections.sort(arr);

        ListNode newnode = new ListNode(arr.get(0));
        ListNode head = newnode, temp = newnode;

        for(int i=1; i<arr.size(); i++) {
            newnode = new ListNode(arr.get(i));
            temp.next = newnode;
            temp = newnode;
        }

        return head;
    }
}