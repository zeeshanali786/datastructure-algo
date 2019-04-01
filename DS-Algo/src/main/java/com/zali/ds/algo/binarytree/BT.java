package com.zali.ds.algo.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BT {

    Node root ;
    int remainingTolevel = 0;

    public BT()
    {

       //for(int i = 0; i < 10; i++)
        //{
            this.root = new Node(10);
            this.root.LeftNode = new Node(9);
            this.root.RightNode = new Node(11);
            this.root.Parent = null;
        this.root.LeftNode.Parent   = this.root;
        this.root.RightNode.Parent   = this.root;
            //Sec Level
        this.root.LeftNode.LeftNode = new Node(8);
        this.root.LeftNode.RightNode = new Node(12);
        this.root.LeftNode.LeftNode.Parent   = this.root.LeftNode;
        this.root.LeftNode.RightNode.Parent   = this.root.LeftNode;

        this.root.RightNode.LeftNode = new Node(5);
        this.root.RightNode.RightNode = new Node(13);
        this.root.RightNode.LeftNode.Parent   = this.root.RightNode;
        this.root.RightNode.RightNode.Parent   = this.root.RightNode;


        Queue q = new LinkedList<Node>();
        q.offer(this.root);
        System.out.print("Here is BreadthFirstSearch traversal: ");
        BFS(q);
       // postOrder(this.root,q);
       // int height = 1;
        //height = HeightOfTree(this.root,  height);
      //  System.out.print(height);


//System.out.print(isBFS(q));
    }



    public boolean isBFS(Queue q)
    {

            while(!q.isEmpty())
            {
                Node temp = (Node)q.poll();


                if((temp.LeftNode !=null && temp.Key <= temp.LeftNode.Key) ||(temp.RightNode != null && temp.Key >= temp.RightNode.Key))
                    return false;

                if(temp.LeftNode != null)
                    q.offer(temp.LeftNode);
                if(temp.RightNode != null)
                    q.offer(temp.RightNode);

            }

            return true;


        }

    public void BFS( Queue q)
    {
            while(!q.isEmpty())
            {
                Node temp = (Node)q.poll();
                System.out.print(temp.Key + " ");
                if(temp.LeftNode != null)
                q.offer(temp.LeftNode);
                if(temp.RightNode != null)
                q.offer(temp.RightNode);

            }





    }
    public void postOrder(Node root)
    {
        if(root != null)
        {
            //if(root.LeftNode !=null)
                postOrder(root.LeftNode);

           // if(root.RightNode !=null)
                postOrder(root.RightNode);

            System.out.print(root.Key + " ");


        }
    }

    public void inorderTraversal(Node root) {


       // List<Integer> res = new ArrayList<>();
        traverse(null);
        //return res;
    }

    public void traverse(Node root)
    {
       if(root != null)
        {
            if (root.LeftNode != null)
                traverse(root.LeftNode);
        }
        System.out.print(root.Key +" ");

        if (root.RightNode!= null)
            traverse(root.RightNode);
    }

    public int HeightOfTreeReCur(Node root, int height)
    {
        if(remainingTolevel ==0) {
            remainingTolevel = height * 2 ;
            height++;
        }

       if(root.LeftNode  != null)
         //  HeightOfTree(root.LeftNode, height);
      // else
         //  remainingTolevel --;

       if(root.RightNode != null)
         //  HeightOfTree(root.RightNode, height);
      // else
         //  remainingTolevel --;

        if(remainingTolevel != 0 )
        remainingTolevel --;


 return height;
    }

    public void HeightOfTreeIte(Node root)
    {
        while(true)
        {
            Node currNode = root;

            while(root.LeftNode == null && root.RightNode == null)
            {
             //   curr
            }


        }

    }

}


