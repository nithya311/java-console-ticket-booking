import java.io.*;
import java.util.*;
import static java.lang.System.exit;
     enum gender{MALE, FEMALE}
     enum seatPreference{silver, golden, platinum}
     enum movie{kabali,snowden,alice,sully}
    public class Person2
    {
        int age;
        String name;
        gender g;
        seatPreference sp;
        movie mov;
        public void getDetails()
        {
	    Scanner scnr = new Scanner(System.in);
            System.out.println("enter your name");
            name = scnr.next();
            System.out.println("enter your gender (male/female)");
            String ip= scnr.next();
            switch (ip)
            {
                case "male":
                    g = gender.MALE;
                    break;
                case "female":
                    g = gender.FEMALE;
                    break;
                default:
                    System.out.println("enter male or female");
                    break;
            }
            System.out.println("enter your seat preference (silver/golden/platinum)");
            ip = scnr.next();
            switch (ip)
            {
                case "silver":
                    sp = seatPreference.silver;
                    break;
                case "golden":
                    sp = seatPreference.golden;
                    break;
                case "platinum":
                    sp = seatPreference.platinum;
                    break;
                default:
                    System.out.println("enter silver, golden or platinum");
            }
            System.out.println("enter your age");
            age = scnr.nextInt();
            if (age <= 18) {
                System.out.println("under 18 cannot book this movie...\nBOOKING CANCELLED");
            }else
            {            
                System.out.println("The Movies running are \nkabali \nsnowden \nalice \nsully");
                System.out.println("--------------------------------------");
                System.out.println("enter the movie name to book ticket");
                ip = scnr.next();
                switch (ip)
                {
                case "kabali":
                    mov = movie.kabali;
                    break;
                case "snowden":
                    mov = movie.snowden;
                    break;
                case "alice":
                    mov = movie.alice;
                    break;
                case "sully":
                    mov = movie.sully;
                    break;
                default:
                    System.out.println("The entered movie is not screening/unavailable \nBooking Unsuccessful");
                }
            }
        }
	
	public String DispString()
	{
		return "name:"+name+" age:"+age+" gender:"+g+" seat:"+sp+" movie:"+mov+"\n";
}

    public static void main(String args[])
    {
        int counter = 100;
        
         ArrayList<Person2> people = new ArrayList<Person2>(); 
        
	Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Book tickets?(y/n)");
            String book = sc.next();
            if(book.equals("n")) {
                System.out.println("view bookings? (y/n)");
                String in = sc.next();
                if(in.equals("y"))
                {
		    for(int i=0;i<people.size();i++)
                    {
			System.out.println(people.get(i).DispString());
		     }
		    exit(1);
                }
                else
                {
                    System.out.println("thank you");
                    exit(1);
                }
            }
            else {
	    Person2 person = new Person2();
            person.getDetails();
           
                if(counter ==0)
                {
                    System.out.println("tickets not available...\nHOUSE FULL");
                }
                    else
                    {
                        people.add(person);
			System.out.println("Booking successful");
                    }
                }   
                
                System.out.println("Thank You!");
                counter --;
            }
	  }
        
    }

