import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List_Example le=new List_Example();
        Set_Eample se=new Set_Eample();
        Map_Eample me=new Map_Eample();
        Comparable_Example ce=new Comparable_Example();

        Scanner sc=new Scanner(System.in);
         int Choice;
           while(true)
           {
             System.out.println("1.ArrayList\n2,LinkedLsit\n3.HahSet\n4.LinkedHashSet\n5.TreeSet\n6.HashMap\n7.LinkedHashMap\n8.TreeMap\n9.Comparable\n10.Exit");
             System.out.println("Enter your choice :");
              Choice=sc.nextInt();
              switch (Choice)
             {
                 case 1:le.operationOnArrayList();
                         break;
                 case 2:le.operationOnLinkedList();
                        break;
                 case 3:se.operationOnHashset();
                        break;
                 case 4:se.operationOnLinkedHashSet();
                        break;
                 case 5:se.operationOnTreeSet();
                        break;
                 case 6:me.oprationOnHashMap();
                        break;
                 case 7:me.operationOnLinkedHashMap();
                        break;
                 case 8:me.operationOnTreeMap();
                        break;
                 case 9: ce.oprationOnComparable();
                     break;

                 case 10:System.exit(0);
             }
            }

    }
}
