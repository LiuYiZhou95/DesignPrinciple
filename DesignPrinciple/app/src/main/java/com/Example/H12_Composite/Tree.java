package com.Example.H12_Composite;

public class Tree {
    TreeNode root=null;

    public Tree(String name){
        root=new TreeNode(name);
    }

    public static void main(){
        Tree tree=new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");

        nodeB.add(nodeC);

        tree.root.add(nodeB);
        System.out.println("build tree finished!");
    }
}