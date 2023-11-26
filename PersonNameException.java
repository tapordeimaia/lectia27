public class PersonNameException extends RuntimeException{
    String name;
    public PersonNameException (String message, String name){
        super(message);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
