import java.util.*;
class User implements Comparable<User>
{
	private String firstName;
    private String lastName;
    private int salary;

    public User(String firstName, String lastName, int salary) 
	{
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
	}
    public String getFirstName() 
	{
        return firstName;
    } 

    public void setFirstName(String firstName) 
	{
        this.firstName = firstName;
    } 

    public String getLastName() 
	{
        return lastName;
    } 

    public void setLastName(String lastName) 
	{
        this.lastName = lastName;
	}

    public int getSalary() 
	{
        return salary;
    }
    public void setSalary(int salary) 
	{
        this.salary = salary;
    }
 
    public String toString() 
	{
        return firstName + " " + lastName + " " + salary;
    } 

    public int compareTo(User o) 
	{
        return this.firstName.compareTo(o.firstName);
    }
}

public class JavaTreeMapExample 
{	
	private static void diplayMap(Map userMap) 
	{
        Set<User> keySet = userMap.keySet();
        for (User user : keySet)
            System.out.println(user.toString());
   	}

    private static void populateUserMap(Map userMap) 
	{
        userMap.put(new User("Ani","Bha",12), "My Name1");
        userMap.put(new User("Cal","YYY",15), "My Name2");
        userMap.put(new User("XYZ","WER",22), "My Name3");
        userMap.put(new User("SSS","TER",1), "My Name4");
    }
	
	public static void main(String[] args) 
	{
        //Natural ordering of User
        Map userMap = new TreeMap();
        populateUserMap(userMap);
        System.out.println(userMap.toString());
        diplayMap(userMap);
    }   
}
