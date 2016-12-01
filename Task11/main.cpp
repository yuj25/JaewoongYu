#include <iostream>


class Node
{
public:
    //  variable initialised
    int value; //This could really be any type

    Node* next;

    Node* prev;

    Node(int val)
    {
        // prints out sentence
        std::cout << "Node constructor!" << std::endl;
        // val contains the value.
        this->value=val;
        //next node is initalised but empty.
        this->next=(Node*)0;
        //previous node is initialised but empty.
        this->prev=(Node*)0;
    }
    //
    ~Node()
    {
       // prints out sentence
        std::cout << "Node destructor" << std::endl;
        //prints out current value node.
        std::cout << "I had the value "<<this->value << std::endl;
    }
};

class List
{
public:
    //  variable initialised
    Node* head;
    // tail variable is initialised.
    Node* tail;

    List()
    {
        //prints out sentence
        std::cout << "List Constructor!" << std::endl;
        //head node is empty.
        this->head=0;
        //tail node is empty.
        this->tail=0;
    }
    ~List()

    {
        //prints out sentence
        std::cout << "List destructor!" << std::endl;
        // prints out sentence
        std::cout << "Todo: properly delete nodes..." << std::endl;
    }

    void insert(Node* n, Node* x)
    {

        //if the node is not empty.
        if (n!=0)
        {
            //x.next becomes n.next
            x->next=n->next;
            //n.next contains x value.
            n->next=x;
            //x.previous value becomes n value.
            x->prev=n;
            //if x.next is not empty, then x.next.previous becomes x value.
            if (x->next!=0)

                x->next->prev=x;
        }

        //if head is empty.
        if (this->head==0)
        {
            //head becomes the x value.
            this->head=x;
            //tail also becomes the x value.
            this->tail=x;

            //x.previous is empty as well as its next.
            x->prev=0;

            x->next=0;
        }

        //if tail is equals to n value.
        else if (this->tail==n)

        {
            //tail becomes x value.
            this->tail=x;
        }
    }

    void display()
    {
        //node i is initialised with head value.
        Node* i=this->head;

        std::cout << "List: " ;

        //while i is not empty.
        while(i!=0)
        {
            //prints out the i value.
            std::cout << i->value << ",";

            //i position is moved to next position.
            i=i->next;
        }
        std::cout << std::endl;
    }
    void Delete(Node* n, Node* x)
    {

        //if x.previous is not empty.
        if(x->prev!=0)
        {
            //x.previous.next becomes x.next value.
            x->prev->next = x->next;
        }
        else
        {
            //head value becomes x.next value.
            this->head = x->next;
        }

        //if x.next is not empty.
        if(x->next!=0)
        {
            //x.next.previous becomes x.previous value.
            x->next->prev = x->prev;
        }
        else
        {
            //tail becomes x.previous value.
            this->tail = x->prev;
        }
    }
};
int main(int argc, char *argv[])
{
    List* l=new List();
    l->insert(0,new Node(5));
    l->insert(l->head,new Node(6));
    l->insert(l->head->next,new Node(7));
    l->insert(l->head->next->next,new Node(8));
    l->insert(l->head->next->next,new Node(9));
    l->insert(l->head->next->next->next->next,new Node(10));
    l->display();
    l->Delete(l->head,l->head->next);
//    l->eliminate(l->head,l->head);
    l->display();
    delete l;
    return 0;
}
