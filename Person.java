public class Person {
    Integer age;
    String name;
    public Person(Integer age, String nume){
        this.age = age;
        this.name = name;
    }
    public void setAge(int age) throws PersonSetAgeException {
        if (age<0){
            throw new PersonSetAgeException("Varsta este negativa", age);
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
