package CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist {

    public static void main(String[] args) {
        
        ArrayList<Integer> list=new ArrayList<>();

        // boolean add(int) returns true if succesfully added at last of list
        System.out.println(list.add(5));  //true
        System.out.println("list = " + list);  // [5]  overrides toString method

        // void add(int index,int element) for adding element at particular index
        list.add(0,4);         // [4,5]
        System.out.println("list = " + list);   //here size of list is 2
        list.add(2,7);            // so adding only at 0,1,2 is allowed otherwise IndexOutOfBoundsException
        System.out.println("list = " + list);       // [4,5,7]

        // boolean addAll(Collection) for adding another collection at end of list
        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(list);
        System.out.println("list2 = " + list2);   // [4,5,7]

        // boolean addAll(int index,Collction) for adding another collection at particular index
        list2.addAll(2,list);
        System.out.println("list2 = " + list2);    // [4,5,4,5,7,7]

        // void clear() for removing all elements from the list
        list2.clear();
        System.out.println("list2 = " + list2);    // []

        // Object clone() for creating copy of list
        ArrayList<Integer> list3 = (ArrayList)list.clone();  //returning Object so casting to ArrayList
        System.out.println("list3 = " + list3);   // [4,5,7] as same as list

        // Imp: for creating copy or conversion to diff Collection, Constructor is used
        // ArrayList<Integer> list3 = new ArrayList<>(list);
        // LinkedList<Integer> list4 = new LinkedList<>(list);

        // boolean contains(Object) returns true if Object(element) is present in list
        System.out.println(list3.contains(5));  //true
        System.out.println(list3.contains(1));  //false

        // boolean containsAll(Collection) returns true if all elements of Collection are present in list
        System.out.println(list.containsAll(list3));   //true as list contains 4,5 and 7

        // boolean equals(Object) returns true if both lists are exact equal
        System.out.println(list.equals(list3));  //true as both are [4,5,7]

        // Integer get(int index) returns element at particular index
        System.out.println(list3.get(2));   //7
        //System.out.println(list3.get(3));   //IndexOutOfBoundsException

        // int indexOf(Object) returns firstOccurrence of Object in list and -1 if not present
        System.out.println(list3.indexOf(5));  //1
        System.out.println(list3.indexOf(8));  //-1

        // int lastIndexOf(Object) returns lastOccurrence of Object in list and -1 if not present
        list3.add(5);
        System.out.println(list3.lastIndexOf(5));  //3
        System.out.println(list3.lastIndexOf(8));  //-1

        // boolean isEmpty() return true if list have no elements
        System.out.println(list3.isEmpty());  //false as it has 4,5 and 7

        // Iterator<Integer> iterator() gives iterator to traverse in list
        Iterator<Integer> it= list3.iterator();
        System.out.println("list3 elements: ");
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // Integer remove(int index) for removing element at particular index from list and returns the element removed
        // throws IndexOutOfBoundsException if index is not valid
        // list3.remove(1);
        System.out.println("list3 = " + list3);

        // boolean remove(Object) removes the given element from the list
        list3.remove(Integer.valueOf(5));   //removes the first occ of 5
        list3.remove("ishan");    // removes Object ishan in list

        // boolean removeAll(Collection) for removing all elements of list that are in Collection
        System.out.println("list = " + list);  
        System.out.println("list3 = " + list3);
        // list3.removeAll(list);
        // System.out.println("list3 = "+ list3);  //[]

        // boolean retainAll(Collection) for retaining only those elements that are in Collection
        list.add(8);
        System.out.println("list = " + list);  //[4,5,7,8]
        System.out.println("list3 = " + list3);  //[4,5,7,5]
        list.retainAll(list3);
        System.out.println("list = " + list);  //[4,5,7]

        // Integer set(int index,int element) for replacing the element at particular index
        // and returns the replaced element 
        System.out.println(list.set(1,3));
        System.out.println("list = " + list);

        // int size() returns the no. of elements in the list
        System.out.println(list.size());

        // void sort(null) for sorting the list
        list.sort(null);
        System.out.println("list = " + list);

        // List<Integer> subList(int start,int end) for creating sublist
        List<Integer> list4= list.subList(1, 3);
        System.out.println("list4 = " + list4);  //[4,7]

        // Object[] toArray() for converting arraylist to array
        Object[] arr = list.toArray();
        for(Object n : arr){
            System.out.print(n+" ");
        }

        // void trimToSize() trims the arraylist capacity to its size
        list.trimToSize();

        
        


    }
    
}
