import java.util.*;

public class Map_Eample {
    HashMap<Integer,String> hash_map;
    LinkedHashMap<String,String> Link_map;
    TreeMap<Integer,Integer> tree_map;
    Iterator it;

    public void oprationOnHashMap()
    {
        hash_map=new HashMap<Integer, String>();
        hash_map.put(1,"Adi");
        hash_map.put(2,"ron");
        hash_map.put(3,"chang");
        hash_map.put(4,"ravi");
        hash_map.put(5,"ram");
        System.out.println("map :"+hash_map);
        System.out.println("---------------------------------------");
        Set<Integer> s=hash_map.keySet();
        it=s.iterator();
         while(it.hasNext())
         {
             //System.out.println(it.next());
             Object k=it.next();
             System.out.println(k+"  "+hash_map.get(k));
         }
         hash_map.remove(2);
        System.out.println("---------------------------------------");
        System.out.println("After Removing key 2 the map is");
         Set se=hash_map.entrySet();
         it=se.iterator();
         while(it.hasNext())
         {
             Map.Entry me=(Map.Entry)it.next();
             System.out.println(me.getKey()+"   "+me.getValue());
         }
    }

    public void operationOnLinkedHashMap()
    {
        Link_map=new LinkedHashMap<String, String>();
         Link_map.put("one","apple");
         Link_map.put("Two","Microsoft");
         Link_map.put("three","Amazon");
         Link_map.put("Four","Filpkart");
        System.out.println("map :"+Link_map);
        System.out.println("---------------------------------------");
        Set se=Link_map.entrySet();
         it=se.iterator();
         while(it.hasNext())
        {
           Map.Entry me=(Map.Entry)it.next();
           System.out.println(me.getKey()+"  "+me.getValue());
        }
        System.out.println("---------------------------------------");
        System.out.println("Checkin Microsoft value is preset or not");
        if(Link_map.containsValue("Microsoft"))
         {
             System.out.println("The given value is present");
         }
        System.out.println("---------------------------------------");
        System.out.println("Replacing value of third key");
        Link_map.replace("three","Xiomi");
         System.out.println("The replaced value for three key is "+Link_map.get("three"));
    }

    public void operationOnTreeMap(){
        tree_map=new TreeMap<Integer, Integer>();
        tree_map.put(1,101);
        tree_map.put(5,105);
        tree_map.put(2,102);
        tree_map.put(3,103);
        tree_map.put(4,104);
        System.out.println("map :"+tree_map);
        System.out.println("---------------------------------------");
        System.out.println("The elements in tree map are");
        Set se=tree_map.entrySet();
        it=se.iterator();
        while(it.hasNext())
        {
            Map.Entry me=(Map.Entry)it.next();
            System.out.println(me.getKey()+"  "+me.getValue());
        }


    }
}
