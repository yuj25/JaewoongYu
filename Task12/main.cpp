#include <iostream>
using namespace std;
class Node
{
public:
       //variables initialized to construct a tree graph.
       int data;
       Node *left;
       Node *right;
       Node()
       {
              //each variables are assigned with different values.
              data = -1;
              left = 0;
              right = 0;
       };
};
class SortTree
{
private:
       //root of the tree is declared.
       Node *root;
public:
       SortTree()
       {
              //the root is assigned with 0 which indicates it is the first node of the tree.
              root = 0;
       };
       void Midpoint(Node * tree)
       {
              //if the tree is not empty.
              if(tree!=0)
              {
                     //the pointer moves to left and the function is recalled.
                     Midpoint(tree->left);
                     //prints out the data of the node.
                     cout << tree->data << " ";
                     //the pointer then moves to right and the function is recalled.
                     Midpoint(tree->right);
              }
       };
       void Insert( int data)
       {
              //tree node with its root is declared.
              Node *tree;
              tree = root;
              //temporary node is declared.
              Node * NodepointOne = new Node();
              //the temporary node is assigned with 'data'.
              NodepointOne->data = data;

              //if the tree is empty.
              if (tree == 0)
              {
                     //tree and its root are assigned with NodepointOne.
                     tree = NodepointOne;
                     root = NodepointOne;
                     return;
              }

              // 'NodepointTwo' node is assigned with the tree object and its parent node.
              Node *NodepointTwo = tree, *parent;
              do {
                     //the parent node is assigned with NodepointTwo node.
                     parent = NodepointTwo;
                     //if the data of the parent node is bigger than the data.
                     if (parent->data > data)
                            //'NodepointTwo' is assigned with the left node of the parent node.
                            NodepointTwo = parent->left;
                     else
                            //'NodepointTwo' is assigned with the right node of the parent node.
                            NodepointTwo = parent->right;
              }
              //while NodepointTwo is not empty.
              while (NodepointTwo != 0);
              //if the parent data is bigger than data.
              if (parent->data > data)
                     //left node of the parent is assigned with NodepointOne node.
                     parent->left = NodepointOne;
              else
                     //right node of the parent is assigned with NodepointOne node.
                     parent->right = NodepointOne;
       };
       void Middle()
       {
              //calls the function called Midpoint with root as a parameter.
              Midpoint(root);
       }
};
int main()
{
       int SizeOfArray[] = { 4,5,7,1,2,6,3};
       int len = sizeof(SizeOfArray) / sizeof(int);
       SortTree sort;
       for (int i = 0; i<len; i++)
       {
              sort.Insert(SizeOfArray[i]);
       }
       sort.Middle();
       return 0;
}
