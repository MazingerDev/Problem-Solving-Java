// https://leetcode.com/problems/merge-two-sorted-lists/
#include <stdlib.h>
struct ListNode {
      int val;
      struct ListNode *next;
};

struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2){
    struct ListNode newlist;
    struct ListNode *tmp = &newlist;
    newlist.next = NULL;
    while(list1 != NULL && list2 !=NULL){
        if (list2->val <= list1->val){
            tmp->next = list2;
            list2 = list2->next;
        }else {
            tmp->next = list1;
            list1 = list1->next;
        }
        tmp = tmp->next;
    }
    tmp->next = (list1 !=NULL) ? list1 : list2;
    return newlist.next;
}
