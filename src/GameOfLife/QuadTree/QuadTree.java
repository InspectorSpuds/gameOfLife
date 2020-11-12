package GameOfLife.QuadTree;

import GameOfLife.Comp.Cell;

/*
    @Author: Ishan Parikh
    class name: QuadTree
    Purpose: a quadtree ADT implementation for storing grid-based information in regions
    Data:
        QuadTreeNode root: the root of the quadtree
    Methods:

 */
public class QuadTree {
    public QuadTreeNode root;
    public void add(Cell cell){

    }

    public QuadTree() {

    }
    class QuadTreeNode{
        QuadTreeNode topLeft;
        QuadTreeNode topRight;
        QuadTreeNode bottomLeft;
        QuadTreeNode bottomRight;
    }
}
