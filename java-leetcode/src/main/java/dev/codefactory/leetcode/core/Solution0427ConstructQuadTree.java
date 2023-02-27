package dev.codefactory.leetcode.core;

import java.util.Objects;

public class Solution0427ConstructQuadTree {
    public Node construct(int[][] grid) {
        return new Node(true, true);
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