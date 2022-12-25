package Review3;

public class Peru extends Country {

    double salary;

    public static void main(String[] args) {
        Peru peru = new Peru();
        peru.name = "Peru";
        peru.capital = "Lima";
        peru.population = 22000000;
        peru.salary = 1000;
//      peru.president = "Somebody"; - not availabe because it is private.
    }

}
