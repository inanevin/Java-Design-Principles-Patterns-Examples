import java.util.ArrayList;
import java.util.Iterator;

public class Iterate {

    private ArrayList<Part> m_PartList;

    public Iterate()
    {

    }
    public Iterate(ArrayList<Part> partList)
    {
        m_PartList = partList;


    }

    public double totalPrice()
    {
        double totalPrice = 0;
        if(m_PartList == null) return 0;
        Iterator<Part> listIterator = m_PartList.iterator();

        while(listIterator.hasNext())
        {
            Part part = listIterator.next();
            totalPrice+= part.getPrice();
        }
        System.out.println("Total Price: " + totalPrice);
        return totalPrice;
    }

    public void display()
    {
        if(m_PartList == null) return;

        Iterator<Part> listIterator = m_PartList.iterator();

        while(listIterator.hasNext())
        {
            Part part = listIterator.next();
            System.out.println("Part Name: " + part.getName());
        }
    }
}
