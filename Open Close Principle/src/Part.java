public class Part {
    private double m_Price;
    private PricePolicy m_PricePolicy;
    private String m_Name;

    public Part()
    {
        m_Price = 0;
        m_PricePolicy = new PricePolicy();
        m_Name = "EMPTY";
    }
    public Part(PricePolicy policy, String name, double defaultPrice)
    {
        m_Price = defaultPrice;
        m_PricePolicy = policy;
        m_Name = name;
    }

    public void setPricePolicy(PricePolicy pricePolicy) {
        m_PricePolicy = pricePolicy;
    }
    public void setPrice(double price) { m_Price = price; }
    public double getPrice() {
        return m_PricePolicy.getPrice(m_Price);
    }
    public String getName() {return m_Name;}

}
