import java.util.*;
public class CollectionPractice 
{

	public static void main(String[] args) 
	{
		//ArrayList
        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Ananya");
        students.add("Rohit");
        students.add("Rahul"); 

        System.out.println("ArrayList - Students:");
        System.out.println(students);

        System.out.println("Student at index 1: " + students.get(1));


        //LinkedList
        LinkedList<String> songs = new LinkedList<>();

        songs.add("Shape of You");
        songs.add("Believer");
        songs.add("Perfect");
        songs.add("Faded");

        System.out.println("\nLinkedList - Songs Playlist:");
        System.out.println(songs);


        //HashSet
        HashSet<String> usernames = new HashSet<>();

        usernames.add("kunal123");
        usernames.add("rahul_dev");
        usernames.add("ananya01");
        usernames.add("kunal123");

        System.out.println("\nHashSet - Usernames:");
        System.out.println(usernames);


        //HashMap
        HashMap<Integer, String> employees = new HashMap<>();

        employees.put(101, "Amit");
        employees.put(102, "Neha");
        employees.put(103, "Raj");
        employees.put(104, "Sneha");

        System.out.println("\nHashMap - Employees:");
        System.out.println(employees);

        System.out.println("Employee with ID 102: " + employees.get(102));

	}

}
