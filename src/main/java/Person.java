import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String middleName;
    private String lastName;
    private int age;
    private String sex;
    private Person mother;
    private Person father;
    private List<Person> siblings;
    private List<Person> children;
    private List<Pet> pets;

    public Person(String name, String lastName, int age, String sex) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public Person(String name, String middleName, String lastName, int age, String sex) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.children = new ArrayList<Person>();
        this.pets = new ArrayList<Pet>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public void setSiblings(List<Person> siblings) {
        this.siblings = siblings;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public void addParent( Person person ) {
        if ( person.getSex().equals("V") )
            this.mother = mother;
        else
            this.father = father;
        // should this person automatically be added as a child for mother and father?
    }

    public void addChild( Person child ) {
        this.children.add(child);
    }

    public void addPet( Pet pet ) {
        this.pets.add(pet);
    }

    public void addSibling( Person sibling ) {
        siblings.add(sibling);
    }

    public List<Person> getGrandChildren() {
        List<Person> grandChildren = new ArrayList();

        if ( this.children.size() > 0 ) {
            for( Person child : this.children ) {
                if ( child.children.size() > 0 )
                    for ( Person grandChild : child.children ) {
                        grandChildren.add( grandChild );
                    }
            }
        }
        return grandChildren;
    }
}
