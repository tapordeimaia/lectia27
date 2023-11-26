package figuri;

public class FiguraService {
    public void deseneaza(Figura figura ){
        try {
            figura.deseneaza();
        } catch (Exception a){
            System.out.println("Exception catch");
        }

    }
}
