/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
Node* Insert(Node *head,int data)
{
    Node *newNode = new Node;
    newNode->data = data;
    newNode->next = NULL;
    
    if(head == NULL) {
        return newNode;
    }
    
    Node *currentNode = head;
    
    while (currentNode->next) {
        currentNode = currentNode->next;
    }

    currentNode->next = newNode;

    return head;
    
  // Complete this method
}