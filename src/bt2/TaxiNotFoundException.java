package bt2;

public class TaxiNotFoundException extends  RuntimeException{
    public TaxiNotFoundException(String messenger){
        System.out.println(messenger);
    }
}
