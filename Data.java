public class Data
{
    private int num;
    private String color;
    public Data(){}
    public Data (int num, String color)
    {
        this.num=num;
        this.color=color;
    }
    public String toString()
    {
        return  num + " " + color;
    }
}
