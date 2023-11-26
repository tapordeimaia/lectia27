import automobil.AutoCombustibilException;
import automobil.Automobil;
import automobil.Bmw;
import figuri.Figura;
import figuri.Patrat;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(20, "");
        PersonService personService = new PersonService();
        try {
            personService.validatePerson(person);
//        } catch (PersonSetAgeException a) {
//            // se va executa daca vom avea eroare
//            System.out.println(a.getMessage());
//            System.out.println("Varsta" + a.getAge() + "este negativa");
//            person.setAge(22);
        } catch (PersonNameException | PersonSetAgeException a){
            System.out.println(a.getMessage());
//            System.out.println("Numele " + a.getName() + " este gol.");
//            person.setName("ABC");
        } catch (PersonAgeTooHighException a){
            System.out.println("Age too high catch");
        } catch (RuntimeException a){
            System.out.println(a.getMessage());
        } catch (Exception a){
            System.out.println("Exception catch");
        } finally {

        }
        try{
            person.setAge(10);
            person.setName("Ion");
        } catch (PersonNameException a){
            System.out.println("Numele este gol");
            throw new RuntimeException("Specific error");
        } finally {
            System.out.println("Am ajuns la finally.");
        }
        System.out.println(person.getAge());
        System.out.println("Am ajuns aici.");

        Figura patrat = new Patrat();
//        patrat.deseneaza();

        Automobil automobil = new Bmw(0, false);

        try{
            automobil.accelereaza();
            automobil.franeaza();
        } catch (AutoCombustibilException a) {
            Bmw bmw = (Bmw) automobil;
            bmw.setCombustibil(30);
            bmw.accelereaza();
        } catch (RuntimeException a){
            Bmw bmw = (Bmw) automobil;
            bmw.setServiceEfectuat(true);
            bmw.franeaza();
        } finally {
            System.out.println("Mereu se executa");
        }
    }
}