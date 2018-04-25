package entity;

public class NewClass
{
    private String someText;

    public NewClass(String someText)
    {
        this.someText = someText;
    }

    public String getSomeText()
    {
        return someText;
    }

    public void setSomeText(String someText)
    {
        this.someText = someText;
    }
    
    public String doubleUp()
    {
        return someText + someText;
    }
}
