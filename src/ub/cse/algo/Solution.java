package ub.cse.algo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import static ub.cse.algo.Traversals.bfsPaths;

public class Solution {

    private Info info;
    private Graph graph;
    private ArrayList<Client> clients;
    private ArrayList<Integer> bandwidths;

    /**
     * Basic Constructor
     *
     * @param info: data parsed from input file
     */
    public Solution(Info info) {
        this.info = info;
        this.graph = info.graph;
        this.clients = info.clients;
        this.bandwidths = info.bandwidths;
    }

    /**
     * Method that returns the calculated 
     * SolutionObject as found by your algorithm
     *
     * @return SolutionObject containing the paths, priorities and bandwidths
     */
    public SolutionObject outputPaths() {

         HashMap<Integer, Integer> priorities =  new HashMap<Integer, Integer>();
        for (Client client: clients) {
            priorities.put(client.id, client.priority);
        }
        HashMap<Integer, ArrayList<Integer>> paths = bfsPaths(graph, clients);
        SolutionObject sol = new SolutionObject(paths, priorities, bandwidths);
        /* TODO: Your solution goes here */
        return sol;
    }
}
