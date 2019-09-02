import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Tilføjer personale
        List<Person> administration = new ArrayList<Person>();
        administration.add(new Administration("Oliver","010101-1337",37,23000,5));

        List<Person> instructors = new ArrayList<Person>();
        instructors.add(new Instructor("Jonas la flame","240797-1337",5,5*456));

        List<Person> members = new ArrayList<Person>();
        members.add(new Member("Shredzilla Far","133707-1337",true));

        for (Person member: members)
        {
            if (member instanceof Member)
            {
                System.out.println("Name            CPR       Membership Fee");
                System.out.println(member.getName() + " " + member.getCpr() + " "+ ((Member) member).getMemberShipType() + "    " + ((Member) member).getFee() + "DKK");
            }

        }

        for (Person instructor: instructors)
        {
            if (instructor instanceof Instructor)
            {
                System.out.println(instructor.getName() + " " + instructor.getCpr() + " " + ((Instructor) instructor).getHours() + " " + ((Instructor) instructor).getSalary ());
            }
        }
    }
}
