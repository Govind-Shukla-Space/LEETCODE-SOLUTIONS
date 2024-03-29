/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2)
{
    struct ListNode *l3=NULL;
    int s=0,c=0;
    while(l1!=NULL && l2!=NULL)
    {
        struct ListNode *new=malloc(sizeof(struct ListNode));
        s= (l1->val +l2->val +c)%10;
        
        c=(l1->val +l2->val +c)/10;
        new->val=s;
        if(l3==NULL)
        {
            l3=new;
            new->next=NULL;
        }
        else{
            struct ListNode *ptr=l3;
            while(ptr->next!=NULL)
            {
                ptr=ptr->next;
            }
            ptr->next=new;
            new->next=NULL;

        }
        l1=l1->next;
        l2=l2->next;
    }
    struct ListNode *rem;
    if (l1==NULL)
        rem=l2;
    else
        rem=l1;
    while(rem!=NULL)
    {
        struct ListNode *new=malloc(sizeof(struct ListNode));
        new->next=NULL;
        s=(rem->val +c)%10;
        c=(rem->val +c)/10;
        new->val=s;
        
        struct ListNode *ptr=l3;
            while(ptr->next!=NULL)
            {
                ptr=ptr->next;
            }
            ptr->next=new;
            new->next=NULL;            
        rem=rem->next;

    }
    if(c!=0)
    {
        struct ListNode *new=malloc(sizeof(struct ListNode));
        new->next=NULL;
        new->val=c;
        struct ListNode *ptr=l3;
            while(ptr->next!=NULL)
            {
                ptr=ptr->next;
            }
            ptr->next=new;
            new->next=NULL;     
    }
        return l3;
}