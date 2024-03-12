class Solution {
public:
    ListNode* removeZeroSumSublists(ListNode* head) {
        ListNode* dummy = new ListNode(0);
        map<int, ListNode*> hashMap;
        hashMap[0]  = dummy;
        dummy->next = head;
              int sum = 0;
        ListNode* ptr = head;

        while(ptr!=NULL){
            sum+=ptr->val;
            if(hashMap.find(sum)!=hashMap.end()){
                ListNode* prevadd = hashMap[sum];
                int prevsum= sum;
                ListNode* temp = prevadd->next;
                while(temp!=ptr){
                    prevsum+=temp->val;
                    hashMap.erase(prevsum);
                    temp=temp->next;
                }
                prevadd->next = ptr->next;
            }
            else{
                hashMap[sum]=ptr;
            }
            ptr = ptr->next;
        }

        return dummy->next;
    }
};
