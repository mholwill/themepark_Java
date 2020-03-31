package behaviours;

import people.Visitor;

public interface ITicketed {

    double priceFor(Visitor visitor);

    double defaultPrice();

}
