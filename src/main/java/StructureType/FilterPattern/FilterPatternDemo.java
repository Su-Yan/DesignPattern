package StructureType.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 结构型模式-过滤器模式
 * 使用不同的标准来过滤一组对象
 */

public class FilterPatternDemo {
    public static void main(String[] args) {
        List<Person>persons = new ArrayList<>();

        persons.add(new Person("Robert","Male","Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single,male);
        Criteria singleOrFemale = new OrCriteria(single,female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));

    }

    public static void printPersons(List<Person> personList){
        for (Person p :
                personList) {
            System.out.println("Person : [ Name: "+p.getName()+
                    ", Gender: "+p.getGender()+
                    ", Marital Status: "+p.getMaritalStatus());
        }
    }
}
