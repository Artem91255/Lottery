import java.util.UUID;

public class Lego extends Toy
{
    protected String type; //Technic, creator, duplo, friends, city, no category
    public Lego(String idOfToy, String name, String numberOfToys, String probability, String type)
    {
        super(idOfToy, name, numberOfToys, probability);
        this.type = type;

    }
}