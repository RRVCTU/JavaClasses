package Review3_Package_2;

import Review3.Country;

public class USA extends Country {
    public static void main(String[] args) {
        USA usa = new USA();
        usa.name = "USA";   // public
        usa.capital ="DC";  // protected, could be inherited
//      usa.population - not visiable because it is a default variable
    }
}
