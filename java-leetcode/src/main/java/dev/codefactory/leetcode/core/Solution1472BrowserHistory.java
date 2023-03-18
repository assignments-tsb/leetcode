package dev.codefactory.leetcode.core;

import java.util.ArrayList;
import java.util.Stack;

/**
 * You have a browser of one tab where you start on the homepage and you can visit another url,
 * get back in the history number of steps or move forward in the history number of steps.
 *
 * Implement the BrowserHistory class:
 *
 * BrowserHistory(string homepage) Initializes the object with the homepage of the browser.
 *
 * void visit(string url) Visits url from the current page. It clears up all the forward history.
 *
 * string back(int steps) Move steps back in history.
 *      If you can only return x steps in the history and steps > x,
 *      you will return only x steps. Return the current url after moving back in history at most steps.
 *
 * string forward(int steps) Move steps forward in history.
 *      If you can only forward x steps in the history and steps > x,
 *      you will forward only x steps. Return the current url after forwarding in history at most steps.
 */
public class Solution1472BrowserHistory {

    public ArrayList<String> execute(ArrayList<String> operation, ArrayList<ArrayList<Object>> parameters) {
        BrowserHistory history = null;
        ArrayList<String> results = new ArrayList<>();

        for (int i=0; i<operation.size(); i++) {
            var ops = operation.get(i);

            if (ops.equalsIgnoreCase("BrowserHistory")) {
                history = new BrowserHistory((String) parameters.get(i).get(0));
                results.add(i, null);
            } else if (history == null) {
                throw new IllegalStateException("Attempted operation on null History");
            } else if (ops.equalsIgnoreCase("visit")) {
                history.visit((String) parameters.get(i).get(0));
                results.add(i, null);
            } else if (ops.equalsIgnoreCase("back")) {
                var r = history.back((Integer) parameters.get(i).get(0));
                results.add(i, r);
            } else if (ops.equalsIgnoreCase("forward")) {
                var r = history.forward((Integer) parameters.get(i).get(0));
                results.add(i, r);
            }
        }

        return results;
    }
}

class BrowserHistory {

    private final Stack<String> backHistory = new Stack<>();
    private final Stack<String> forwardHistory = new Stack<>();

    public BrowserHistory(String homepage) {
        backHistory.push(homepage);
    }

    public void visit(String url) {
        backHistory.push(url);
        forwardHistory.clear();
    }

    public String back(int steps) {
        while (steps > 0 && backHistory.size() > 1) {
            forwardHistory.push(backHistory.pop());
            steps--;
        }
        return backHistory.peek();
    }

    public String forward(int steps) {
        while (steps > 0 && !forwardHistory.empty()) {
            backHistory.push(forwardHistory.pop());
            steps--;
        }
        return backHistory.peek();
    }
}