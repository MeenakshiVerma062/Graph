package learnDijekstra;

import java.util.ArrayList;

//public class BellmanFordAlgorithm {
//
//        static class Egde {
//            int src;
//            int dest;
//            int wt;
//
//            public Egde(int s, int d, int w) {
//                this.src = s;
//                this.dest = d;
//                this.wt = w;
//            }
//        }
//
//        public static void createGraph(ArrayList<Egde> graph[]) {
//            for (int i = 0; i < graph.length; i++) {
//                graph[i] = new ArrayList<>();
//            }
//            graph[0].add(new Egde(0, 1, 2));
//            graph[0].add(new Egde(0, 2, 4));
//            graph[1].add(new Egde(1, 2, -4));
//            graph[2].add(new Egde(2, 3, 2));
//            graph[3].add(new Egde(3, 4, 4));
//            graph[4].add(new Egde(4, 1, -1));
//        }
//
//        public static void bellmanFord(ArrayList<Egde> graph[], int src, int v) {
//            int dist[] = new int[v];
//            for (int i = 0; i < v; i++) {
//                if (i != src) {
//                    dist[i] = Integer.MAX_VALUE;
//                }
//            }
//                for (int k = 0; k < v - 1; k++) {
//                    for (int i = 0; i < v; i++) {
//                        for (int j = 0; j < graph[i].size(); j++) {
//                            Egde e = graph[i].get(j);
//                            int m = e.src;
//                            int n = e.dest;
//
//                            if (dist[m] != Integer.MAX_VALUE && dist[m] + e.wt < dist[n]) {
//                                dist[n] = dist[m] + e.wt;
//                            }
//                        }
//                    }
//                }
//                for (int i = 0; i < dist.length; i++) {
//                    System.out.println(dist[i] + " ");
//                }
//
//                System.out.println();
//
//            }
//
//
//
//        public static void main(String[] args) {
//            int k = 5;
//            ArrayList<Egde> graph[] = new ArrayList[k];
//            createGraph(graph);
//            bellmanFord(graph, 0, k);
//        }
//    }
//
