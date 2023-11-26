public class PersonService {
    public void validatePerson(Person person) throws Exception{
        if(person.getAge() < 0){
            throw new PersonSetAgeException("Varsta negativa", person.getAge());
        }
        if (person.getName() != null && person.getName().length() == 0){
            throw new PersonNameException("Numele este gol", person.getName());
        }
        if(person.getAge()>100){
            throw new RuntimeException("Varsta este prea mare");
        }
        if (person.getName().length()<10){
            throw new Exception("Numele prea mic.");
        }
    }
}
