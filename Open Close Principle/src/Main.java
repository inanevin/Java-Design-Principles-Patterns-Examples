import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        PricePolicy defaultPolicy = new PricePolicy();
        PricePolicy halfDiscountPolicy = new PricePolicy(0.5f);
        PricePolicy quarterDiscountPolicy = new PricePolicy(0.25f);
        Part mem = new Memory(defaultPolicy, "Kingston Memory", 500);
        Part disk = new HardDisk(halfDiscountPolicy, "HDD", 500);
        Part cpu = new CPU(defaultPolicy, "CPU", 500);

        ArrayList<Part> myList = new ArrayList<Part>();
        myList.add(mem);
        myList.add(disk);
        myList.add(cpu);

        Iterate example = new Iterate(myList);
        example.display();
        example.totalPrice();

    }
}
