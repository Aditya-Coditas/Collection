import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class List_Example {
    ArrayList<String> Array_List1;
    LinkedList<Integer> linked_List1;
    Iterator it;


      public void operationOnArrayList() {
          Array_List1 = new <String>ArrayList();
          ArrayList<String> le = new ArrayList<String>();
          Array_List1.add("Adi");
          Array_List1.add("Ron");
          Array_List1.add("chang");
          System.out.println("Original ArrayList");
          it = Array_List1.iterator();
          while (it.hasNext()) {
              System.out.println(it.next());
          }
          System.out.println("---------------------------------------");

          le.add("ravi");
          le.add("raju");

          System.out.println("Secound Array List is");
          for(String s:le)
          {
              System.out.println(s);
          }
          System.out.println("---------------------------------------");
          Array_List1.addAll(le);
          System.out.println("After Adding Two Array list");
          for (String il : Array_List1) {
              System.out.println(il);
          }
          System.out.println("---------------------------------------");


          System.out.println("Index of Adi is "+Array_List1.indexOf("Adi"));

      }

      public void operationOnLinkedList()
      {
          linked_List1=new LinkedList<Integer>();
            for(int i=1;i<=5;i++)
            {
                linked_List1.add(i);
            }
            System.out.println("the original linked list is");
              for(int j:linked_List1)
              {
                  System.out.println(j);
              }
          System.out.println("---------------------------------------");

          linked_List1.add(1,100);
              System.out.println("The Linked List After adding Elements on 2nd position");
          for(int j:linked_List1)
          {
              System.out.println(j);
          }
          System.out.println("---------------------------------------");

          linked_List1.addFirst(200);
            linked_List1.addLast(300);

            System.out.println("Linked List By adding the first and last element in linked list ");
          for(int j:linked_List1)
          {
              System.out.println(j);
          }
          System.out.println("---------------------------------------");

          System.out.println("Linked After removing 1st and last elment");
           linked_List1.removeFirst();
           linked_List1.removeLast();
           it=linked_List1.iterator();
            while(it.hasNext())
            {
                System.out.println(it.next());
            }
          System.out.println("---------------------------------------");

          int poll_first_ele=linked_List1.pollFirst();
            int poll_last_ele=linked_List1.pollLast();
            System.out.println("The 1st element was "+poll_first_ele+"\n The last ele was "+poll_last_ele);
            System.out.println("After Polling");
          for(int j:linked_List1)
          {
              System.out.println(j);
          }

      }



}
