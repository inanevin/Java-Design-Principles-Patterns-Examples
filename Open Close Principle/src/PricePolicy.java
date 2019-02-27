public class PricePolicy {

    public PricePolicy()
    {
        m_Factor = 1.0f;
    }

    public PricePolicy(double f)
    {
        m_Factor = f;
    }
    private double m_Factor;
    public double getPrice(double price) { return price * m_Factor;}

}
