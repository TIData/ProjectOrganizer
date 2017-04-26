package domein;

public class ExternalTask extends Task {

       // private final static double VAT = 0.21;
        
    public ExternalTask(String name, String description, double taskTimeRequired, double rate) {
        super(name, description, rate, taskTimeRequired);
    }

    @Override
    protected boolean vatInclusive(){
        return true;
    }
}