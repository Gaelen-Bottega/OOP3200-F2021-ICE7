package ca.durhamcollege;

public class Person
{
    // Private variables

    private String m_name;
    private int m_age;

    // Constructors

    public Person()
    {
        m_name = "Unknown";
        m_age = 0;
    }

    public Person(String name, int age)
    {
        this.m_name = name;
        this.m_age = age;
    }

    public Person(String name)
    {
        this.m_name = name;
        m_age = 0;
    }

    public Person(int age)
    {
        m_name = "Unknown";
        this.m_age = age;
    }

    // Public properties

    public String getName() {
        return m_name;
    }

    public void setName(String name) {
        this.m_name = name;
    }

    public int getAge() {
        return m_age;
    }

    public void setAge(int age) {
        this.m_age = age;
    }

    // Methods

    /**
     * This method tests the person class and returns a simple message to the console
     * @return {Void}
     */
    public void saysHello()
    {
        System.out.println(this.m_name + " says Hello!");
    }

    /**
     * This method overrides the built-in toString method and returns the person properties
     * @return {String}
     */
    @Override
    public String toString() {
        String outputString = "";
        outputString += "Name: " + this.m_name + " ";
        outputString += "Age: " + this.m_age;

        return outputString;
    }
}
