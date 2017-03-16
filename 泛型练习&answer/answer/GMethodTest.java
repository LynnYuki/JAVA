package Ex;

import java.util.ArrayList;

public class GMethodTest {
	
	 public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		    ArrayList<E> result = new ArrayList<E>();
		    
		    for (E e: list) {
		      if (!result.contains(e)) 
		        result.add(e);
		    }

		    return result;
		  }
	 public static <E extends Comparable<E>> E max(E[] list) {
		    E max = list[0];

		    for (int i = 1; i < list.length; i++) {
		      if (max.compareTo(list[i]) < 0) {
		        max = list[i];
		      }
		    }

		    return max;
		  }
	 public static <E extends Comparable<E>> E max(ArrayList<E> list) {
		    E currentMax = list.get(0);
		    
		    for (int i = 1; i < list.size(); i++)
		      if (currentMax.compareTo(list.get(i)) < 0)
		        currentMax = list.get(i);
		    
		    return currentMax;
		  }
	 
	 public static void main(String[] args) {
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 ArrayList<String>  words = new ArrayList<String>();
		 ArrayList<Circle>  circles = new ArrayList<Circle>();
		    list.add(14);
		    list.add(24);
		    list.add(4);
		    list.add(42);
		    list.add(5);
		    words.add("red");
		    words.add("green");
		    words.add("blue");
		    words.add("blue");
		    circles.add(new Circle(3));
		    circles.add(new Circle(2.9));
		    circles.add(new Circle(5.9));
		    circles.add(new Circle(3));
		 ArrayList<Integer> newList = removeDuplicates(list);
		 ArrayList<String> newwords = removeDuplicates(words);
		 ArrayList<Circle> newcircles = removeDuplicates(circles);
		 
		 System.out.println(newList);
		 System.out.println(newwords);
		 System.out.println(newcircles);
		 
		 System.out.print(max(list));
		 
		 Integer[] numbers = {1, 2, 3};
		 System.out.println(max(numbers));
		    
		  String[]   s =  {"red", "green", "blue"};
		  System.out.println(max(s));
		    
		  Circle[]   c = {new Circle(3), new Circle(2.9), new Circle(5.9)};
		  System.out.println(max(circles));
	 }

}

class Circle implements Comparable<Circle> {
    private double radius;
    
    public Circle(double radius) {
      this.radius = radius;
    }
    
    @Override
    public int compareTo(Circle c) {
      if (radius < c.radius) 
        return -1;
      else if (radius == c.radius)
        return 0;
      else
        return 1;
    }
    
    @Override
    public String toString() {
      return "Circle radius: " + radius;
    }
    @Override
    public boolean equals(Object obj){
    	if(this == obj)
		{
			return true;
		}
    	
    	if (obj != null && obj.getClass() == Circle.class)
    		{
    		Circle target = (Circle)obj;
    			return (target.radius==this.radius);
    		}
    		return false;
    	}
    }

