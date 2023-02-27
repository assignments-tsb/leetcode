package dev.codefactory.leetcode.core;

import java.util.Objects;

public class Solution0427ConstructQuadTree {
    public Node construct(int[][] grid) {
        if (grid.length==0) return null;
        if (grid.length==1) return new Node(grid[0][0]==1, true);

        var firstValue = grid[0][0];
        var sameValue = true;

        for (int[] ints : grid) {
            for (int anInt : ints) {
                if (anInt != firstValue) {
                    sameValue = false;
                    break;
                }
            }
        }

        var node = new Node(firstValue==1, true);

        if (sameValue) {
            return node;
        }

        node.topLeft = construct(take(grid, true, true));
        node.topRight = construct(take(grid, true, false));
        node.bottomLeft = construct(take(grid, false, true));
        node.bottomRight = construct(take(grid, false, false));
        if (node.topLeft!=null
                || node.topRight!=null
                || node.bottomLeft!=null
                || node.bottomRight!=null) {
            node.isLeaf = false;
        }

        return node;
    }

    int[][] take(int[][] grid, boolean top, boolean left) {
        int mid = grid.length/2;

        int[][] subArray = new int[mid][mid];

        int iStart = top ? 0 : mid;
        int jStart = left ? 0 : mid;

        for (int i=0, i2=iStart; i<mid ;i++,i2++) {
            for (int j=0, j2=jStart; j<mid; j++,j2++) {
                subArray[i][j] = grid[i2][j2];
            }
        }

        return subArray;
    }
}

class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;


    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;

        if (isLeaf) {
            return node.isLeaf && val == node.val;
        }

        return Objects.equals(topLeft, node.topLeft)
                && Objects.equals(topRight, node.topRight)
                && Objects.equals(bottomLeft, node.bottomLeft)
                && Objects.equals(bottomRight, node.bottomRight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, isLeaf, topLeft, topRight, bottomLeft, bottomRight);
    }

    @Override
    public String toString() {
        if (isLeaf) {
            return "[" + (val?"1":"0") + "]";
        }

        return "[" + topLeft + "-" + topRight + "]\n[" + bottomLeft + "-" + bottomRight + "]";
    }
}