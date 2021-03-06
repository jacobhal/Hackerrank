/*
  Print elements of a linked list on console 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
void Print(Node *head)
{
    if(head != NULL) {
        while(head->next != NULL) {
            std::cout << head->data << std::endl;
            head = head->next;
        }
        std::cout << head->data << std::endl;
    }
   
    
  // This is a "method-only" submission. 
  // You only need to complete this method. 
}