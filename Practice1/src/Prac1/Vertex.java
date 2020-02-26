
package Prac1;
import java.util.Queue;
import java.util.LinkedList;

public class Vertex {
    public char level;
    public boolean wasvisited;
    
    public Vertex(char lev ){
    level=lev;
    wasvisited=false;
    }
    
}
class graph{
    private final int maxvertex=20;
    private final Vertex Vertexlist[];
    private final int adjmat[][];
    private  int verts;
    private final Queue<Integer> q;
    
    public graph(){
    Vertexlist=new Vertex[maxvertex];
    adjmat=new int[maxvertex][maxvertex];
    verts=0;
    q=new LinkedList<Integer>();}
    
    void addvertex(char lev){
    Vertexlist[verts++]=new Vertex(lev);
    }
    void addedge(int start,int end){
        adjmat[start][end]=1;
        adjmat[end][start]=1;
    }
    void displayvertex(int v){
        System.out.println(Vertexlist[v].level);}
    
    int getunvisitedvertex(int v){
    for(int j=0;j<verts;j++){
    if(adjmat[v][j]==1 && Vertexlist[j].wasvisited==false)
        return j;
 
    }
    return -1;
    }
    
   public void bfs(){
   Vertexlist[0].wasvisited=true;
   displayvertex(0);
   q.add(0);
   int v2;
   
   while(!q.isEmpty()){
   int v1=q.remove();
   while((v2=getunvisitedvertex(v1))!=-1){
       Vertexlist[v2].wasvisited=true;
       displayvertex(v2);
       q.add(v2);
       
   }
       }
  }
    }
class bfsapp{
    public static void main(String[] args) {
        graph thegraph=new graph();
        thegraph.addvertex('A');
        thegraph.addvertex('G');
        thegraph.addvertex('C');
        thegraph.addvertex('H');
        thegraph.addvertex('E');
        thegraph.addvertex('L');
        
        thegraph.addedge(0,2);
        thegraph.addedge(1,2);
        thegraph.addedge(0,3);
        thegraph.addedge(3,4);
        thegraph.addedge(3,5);
        thegraph.addedge(1,3);
        System.out.println("visits:");  
        thegraph.bfs();
        System.out.println();
    }
}

