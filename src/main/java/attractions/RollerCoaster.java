package attractions;
import behaviours.ITicketed;
import attractions.Attraction;
import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ITicketed, ISecurity {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        if(visitor.getHeight() >= 1.45 && visitor.getAge() >= 12){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 2) {
            return defaultPrice() * 2;
        }
        return defaultPrice();
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }


}
