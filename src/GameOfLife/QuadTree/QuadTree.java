package GameOfLife.QuadTree;

import GameOfLife.Comp.Cell;

/*
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

    private void traverse() {

    }

    public QuadTree() {

    }
    static class QuadTreeNode{
        private int usedQuads =0;//amount of used quadrants in the quadtree node
        private int rightX;
        private int leftX;
        private int topY;
        private int bottomY;

        QuadTreeNode topLeft;
        QuadTreeNode topRight;
        QuadTreeNode bottomLeft;
        QuadTreeNode bottomRight;


    }
}
