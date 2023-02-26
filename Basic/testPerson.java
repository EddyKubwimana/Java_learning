public class testPerson{

    public static void main(String[] args){
        //creating different persons with different ages
        Person person1 = new Person("Eddy", 21, "Male");
        Person person2 = new Person("Aline", 16, "Female");
        Person person3 = new Person("Edouard", 1, "Male");
        Person person4 = new Person("Clarisse", 3, "Male");
        Person person5 = new Person("Noa", 19, "Male");

        // setting voting, marrying, and driving age

        Person.setMarriageAge(16);
        Person.setDrivingAge(18);
        Person.setVotingAge(21);

        // testing if a person is allowed to vote

        System.out.println("Is person1 allowed to vote?: "+ person1.canVote());
        System.out.println("Is person2 allowed to vote?: "+ person2.canVote());

        // look up for voting, driving and marrying age
        System.out.println("================================================");
        System.out.println("voting age is : "+ Person.getVotingAge());
        System.out.println("Marrying age is : "+ Person.getMarriageAge());
        System.out.println("Driving age is : "+ Person.getDrivingAge());
        
        // testing if a  person is allowed to drive
        System.out.println("================================================");
        System.out.println("Is person1 allowed to drive?: "+ person1.canDrive());
        System.out.println("Is person2 allowed to drive?: "+ person2.canDrive());

        // testing if a  person is allowed marry
        System.out.println("================================================");
        System.out.println("Is person1 allowed to Marry?: "+ person1.canMarry());
        System.out.println("Is person4 allowed to Marry?: "+ person4.canMarry());

        // testing a  person is adult
        System.out.println("================================================");
        System.out.println("Is person1 an adult?: "+ person1.isAdult());
        System.out.println("Is person2 an adult?: "+ person2.isAdult());

        // creating a new person using createadult method
        System.out.println("================================================");
        Person person7 = Person.createAdult("Boniface", "Male");
        System.out.println("Adult created is?: "+ person7.getName() + " and his age:"+ person7.getAge());

        // testing if a person is  an infant
        System.out.println("================================================");
        System.out.println("Is person4 an infant?: "+ person4.isInfant());
        System.out.println("Is person 3 an infant ?: "+ person3.isInfant());

        // testing if a person  is toddler
        System.out.println("================================================");
        System.out.println("Is person4 a Toddler?: "+ person4.isToddler());
        System.out.println("Is person 3 a Toddler ?: "+ person3.isToddler());


        // testing if a person  is child
        System.out.println("================================================");
        System.out.println("Is person4 a child: "+ person4.isChild());
        System.out.println("Is person 1 a child ?: "+ person1.isChild());

        // testing if a person is a teenager
        System.out.println("================================================");
        System.out.println("Is person4 an teenager?: "+ person4.isTeenager());
        System.out.println("Is person5 an teenager ?: "+ person5.isTeenager());

        // testing if a person is youth
        System.out.println("================================================");
        System.out.println("Is person3 a youth?: "+ person3.isYouth());
        System.out.println("Is person 5 a youth ?: "+ person5.isYouth());





    }
}