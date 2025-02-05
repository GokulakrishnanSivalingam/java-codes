import java.util.*;
class  graph
{
    ArrayList<ArrayList<Integer>>avs=new ArrayList<>();
    public graph(int v)
    {
        for(int i=0;i<v;i++)
        {
            avs.add(new ArrayList<Integer>());
        }
    }
    public void addEdge(int v ,int w)
    {
        avs.get(v).add(w);
        avs.get(w).add(v);

    }
    public void display()
    {
        for(int i=0;i<avs.size();i++)
        {
            System.out.println("element:"+i);
            for(int j=0;j<avs.get(i).size();j++)
            {
                System.out.println(avs.get(i).get(j));
            }


        }
    }
}
public class grapth {
    public static void main(String[] args) {
        graph g =new graph(5);
        g.addEdge(0,1);
        g.addEdge(0,2);

        g.addEdge(1,3);
        g.addEdge(1,4);
        g.addEdge(4,2);

        g.display();



    }
}
