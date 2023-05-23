package CollectionsFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<>();

        // boolean add(int) returns true if succesfully added at last of list
        System.out.println(list.add(5));  //true
        System.out.println("list = " + list);  // [5]  overrides toString method

        // void add(int index,int element) for adding element at particular index
        list.add(0,4);         // [4,5]
        System.out.println("list = " + list);   //here size of list is 2
        list.add(2,7);            // so adding only at 0,1,2 is allowed otherwise IndexOutOfBoundsException
        System.out.println("list = " + list);       // [4,5,7]

        // boolean addAll(Collection) for adding another collection at end of list
        LinkedList<Integer> list2=new LinkedList<>();
        list2.addAll(list);
        System.out.println("list2 = " + list2);   // [4,5,7]

        // boolean addAll(int index,Collction) for adding another collection at particular index
        list2.addAll(2,list);
        System.out.println("list2 = " + list2);    // [4,5,4,5,7,7]

        // void addFirst(Integer) for adding to beginning of the list
        list2.addFirst(1);
        System.out.println("list2 = " + list2);

        // void clear() for removing all elements from the list
        list2.clear();
        System.out.println("list2 = " + list2);    // []

        // Object clone() for creating copy of list
        LinkedList<Integer> list3 = (LinkedList)list.clone();  //returning Object so casting to LinkedList
        System.out.println("list3 = " + list3);   // [4,5,7] as same as list

        // boolean contains(Object) returns true if Object(element) is present in list
        System.out.println(list3.contains(5));  //true
        System.out.println(list3.contains(1));  //false

        // boolean containsAll(Collection) returns true if all elements of Collection are present in list
        System.out.println(list.containsAll(list3));   //true as list contains 4,5 and 7

        // Integer element() gives the head of the list that is first element
        System.out.println(list.element());

        // boolean equals(Object) returns true if both lists are exact equal
        System.out.println(list.equals(list3));  //true as both are [4,5,7]

        // Integer get(int index) returns element at particular index
        System.out.println(list3.get(2));   //7
        //System.out.println(list3.get(3));   //IndexOutOfBoundsException

        // Integer getFirst() gives the first element of the list that is head of the list
        System.out.println(list3.getFirst());

        // Integer getLast() gives the last element of the list that is tail of the list
        System.out.println(list3.getLast());

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

        // boolean offer() adds to the last
        
        // boolean offerFirst() adds to the first
        
        // boolean offerLast() adds to the last

        // Integer peek() returs the head of the list and return null if empty

        // Integer peekLast() return the tail of the list and return null if empty

        // Integer poll() removes the head of the list

        // Integer pollLast() removes the tail of the list

        // Integer pop() removes the head of the list
        
        // void push(Integer) adds at head of the list

        // Integer remove() removes the head of the list

        // boolean removeFirstOccurrence(Object) removes the firstocc of element

        // boolean removeLastOccurrence(Object) removes the lastocc of element

        // Integer removeFirst() 

        // Integer removeLast()

        // Integer remove(int index) for removing element at particular index from list and returns the element removed
        // throws IndexOutOfBoundsException if index is not valid
        // list3.remove(1);
        System.out.println("list3 = " + list3);

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
        // List<Integer> list4= list.subList(1, 3);
        // System.out.println("list4 = " + list4);  //[4,7]

        // Object[] toArray() for converting arraylist to array
        Object[] arr = list.toArray();
        for(Object n : arr){
            System.out.print(n+" ");
        }


    }
    
}
