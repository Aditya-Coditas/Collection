import java.util.ArrayList;
import java.util.Collections;

public class Comparable_Example implements Comparable<Comparable_Example> {
    String name;
    int age;
      Comparable_Example(String name,int age)
      {
          this.name=name;
          this.age=age;
      }
      Comparable_Example(){}

      public int compareTo(Comparable_Example c)
      {
          if(age==c.age)
              return 0;
          else if(age>c.age)
              return 1;
          else
              return -1;
      }
      public void oprationOnComparable()
      {
          ArrayList<Comparable_Example> li=new ArrayList<Comparable_Example>();
          li.add(new Comparable_Example("Adi",22));
          li.add(new Comparable_Example("Ron",20 ));
          li.add(new Comparable_Example("vini",21));
          Collections.sort(li);

          for(Comparable_Example c:li)
          {
              System.out.println(c.name+"  "+c.age);
          }
      }
}
