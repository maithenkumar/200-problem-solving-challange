package LinkedList;

public class MergeTwoSortedLists {

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
            while (list1 != null && list2 != null) {
                if (list1.val<=list2.val) {
                    ListNode temp=list1.next;
                    list1.next=list2;
                    list1.next.next=temp;
                    list2=list2.next;

                }else{
                    ListNode temp=list1.next;
                    list1.next=list2;
                    list1.next.next=temp;
                    list2=list2.next;

                }
            }
            while (list2!=null) {
                list1.next=list2;
                list2=list2.next;
            }

            return list1;
        }
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    list1.next = mergeTwoLists(list1.next, list2);
                    return list1;
                } else {
                    list2.next = mergeTwoLists(list2.next, list1);
                    return list2;
                }
            }
            return list1 == null ? list2 : list1;
        }
    }
}
