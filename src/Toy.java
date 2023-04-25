import java.util.UUID;

public abstract class Toy
{
    protected String idOfToy;
    protected String name;
    protected String numberOfToys;
    protected String probability;

    public Toy(String idOfToy, String name, String numberOfToys, String probability)
    {
        this.idOfToy=idOfToy;
        this.name = name;
        this.numberOfToys=numberOfToys;
        this.probability=probability;
    }

}