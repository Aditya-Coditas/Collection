import java.util.*;

public class Set_Eample {
    HashSet<Double> hash_set1;
    LinkedHashSet<Integer> hash_set2;
    TreeSet<Integer> tree_set;
    Iterator it;

     public void operationOnHashset()
     {
         hash_set1=new HashSet<Double>();
         hash_set1.add(55.23);
         hash_set1.add(66.00);
         hash_set1.add(11.22);
         System.out.println("The elements in Hash Set are");
         it=hash_set1.iterator();
          while(it.hasNext())
          {
              System.out.println(it.next());
          }
         System.out.println("---------------------------------------");

         System.out.println("The size of Hash Set is "+hash_set1.size());
         System.out.println("---------------------------------------");

         hash_set1.clear();
            if(hash_set1.isEmpty())
            {
                System.out.println("The Hash Set is Empty");
            }

     }

     public void operationOnLinkedHashSet()
     {
         hash_set2=new LinkedHashSet<Integer>();
         hash_set2.add(25);
         hash_set2.add(2);
         hash_set2.add(99);
         hash_set2.add(25);
         hash_set2.add(100);
         System.out.println("elements in Linked Hash Set are");

         for(int i:hash_set2)
          {
              System.out.println(i);
          }
         System.out.println("---------------------------------------");

         hash_set2.remove(25);
          System.out.println("Hash Set after removing the value=24");
         for(int i:hash_set2)
         {
             System.out.println(i);
         }
     }

     public void operationOnTreeSet()
     {
       tree_set=new TreeSet<Integer>();
         for(int i=100;i>=10;i=i-10)
         {
             tree_set.add(i);
         }
         System.out.println("Elements in tree set are");
         it=tree_set.iterator();
          while(it.hasNext())
          {
              System.out.println(it.next());
          }
          System.out.println("---------------------------------------");
          System.out.println("The Closet element for 19 in tree set is "+tree_set.ceiling(19));
         System.out.println("---------------------------------------");
         System.out.println("The Descending Order ");
          it=tree_set.descendingIterator();
          while (it.hasNext())
          {
              System.out.println(it.next());
          }
         System.out.println("---------------------------------------");
         System.out.println("The Lower Element for 54 is "+tree_set.lower(54)+"\nThe higher Element for 54 is"+tree_set.higher(54));
           if(tree_set.contains(40))
           {
               System.out.println("The element is present");
           }
         System.out.println("---------------------------------------");
         System.out.println("The Sub Set in between 20 to 60");
           Set<Integer> ts=tree_set.subSet(20,true,60,false);
           for(Integer i:ts)
           {
               System.out.println(i);
           }


     }

}
