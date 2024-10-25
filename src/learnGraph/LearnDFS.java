package learnGraph;

//public class LearnDFS {
//    static class Edge {
//        int src;
//        int dest;
//        int wt;
//
//        public Edge(int s, int d, int w) {
//            this.src = s;
//            this.dest = d;
//            this.wt = w;
//        }
//    }

//    static void createGraph(ArrayList<LearnDFS.Edge> graph[]) {
//        for (int i = 0; i < graph.length; i++) {
//            graph[i] = new ArrayList<>();
//        }
//        graph[0].add(new LearnDFS.Edge(0, 1, 1));
//        graph[0].add(new LearnDFS.Edge(0, 2, 1));
//        graph[1].add(new LearnDFS.Edge(1, 0, 1));
//        graph[1].add(new LearnDFS.Edge(1, 3, 1));
//        graph[2].add(new LearnDFS.Edge(2, 0, 1));
//        graph[2].add(new LearnDFS.Edge(2, 4, 1));
//        graph[3].add(new LearnDFS.Edge(3, 1, 1));
//        graph[3].add(new LearnDFS.Edge(3, 4, 1));
//        graph[3].add(new LearnDFS.Edge(3, 5, 1));
//        graph[4].add(new LearnDFS.Edge(4, 2, 1));
//        graph[4].add(new LearnDFS.Edge(4, 3, 1));
//        graph[4].add(new LearnDFS.Edge(4, 5, 1));
//        graph[5].add(new LearnDFS.Edge(5, 3, 1));
//        graph[5].add(new LearnDFS.Edge(5, 4, 1));
//        graph[5].add(new LearnDFS.Edge(5, 6, 1));
//
//    }
//    public static  void dfs(ArrayList<Edge> graph[],int curr,boolean vis[]){
//        System.out.print(curr+" ");
//        vis[curr] = true;
//        for(int i = 0 ; i<graph[curr].size(); i++){
//            Edge e = graph[curr].get(i);
//            if(vis[e.dest] == false){
//                dfs(graph,e.dest,vis);
//            }
//        }
//    }

  //  public static void main(String[] args) {
//        int v = 7;
//        ArrayList<Edge> graph[] = new ArrayList[v];
//        createGraph(graph);
//        boolean vis[] = new boolean[v];
//        dfs(graph,0,vis);
//        System.out.println();



        // If graph divided into different parts

//        int v  = 7;
//        ArrayList<Edge> graph[] = new ArrayList[v];
//        createGraph(graph);
//        boolean vis[] = new boolean[v];
//        for(int  i = 0; i<v; i++){
//            if(vis[i] == false){
//                dfs(graph,i,vis);
//            }
//        }
//        System.out.println();
//    }
//}
