public class PersonSetAgeException extends RuntimeException{
    private final Integer age;
    public PersonSetAgeException(String message, Integer age){
        super(message);
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }
}
