package chapter_four;

import java.text.DecimalFormat;

public class Pet
{
    private String name;
    private int age; //in years
    private double weight; //in pounds
    private int type; // 0:cat, 1:dog

    public String toString()
    {
        return ("Name: " + name + " Age: " + age + " years"
                + "\nWeight: " + weight + " pounds" + " Type: " + getStringType());
    }

    public String getStringType()
    {
        if (type == 0)
            return "Cat";
        if (type == 1)
            return "Dog";
        System.out.println("Wrong Type");
        System.exit(0);
        return "Error";
    }

    public Pet(String initialName,int initialAge,
               double initialWeight, int initialType)
    {
        name = initialName;
        if ((initialAge < 0) || (initialWeight < 0) || initialType < 0 || initialType > 1)
        {
            System.out.println("Error: Wrong age, weight or type.");
            System.exit(0);
        }
        else
        {
            age = initialAge;
            weight = initialWeight;
            type = initialType;
        }
    }


    public void set(String newName,int newAge,double newWeight, int initialType)
    {
        name = newName;
        if ((newAge < 0) || (newWeight < 0) || initialType < 0 || initialType > 1)
        {
            System.out.println("Error: Wrong age, weight or type.");
            System.exit(0);
        }
        else
        {
            age = newAge;
            weight = newWeight;
            type = initialType;
        }
    }


    public Pet(String initialName)
    {
        name = initialName;
        age = 0;
        weight = 0;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public Pet(int initialAge)
    {
        name = "No name yet.";
        weight = 0;
        if (initialAge < 0)
        {
            System.out.println("Error: Negative age.");
            System.exit(0);
        }
        else
            age = initialAge;
    }

    public void setAge(int newAge)
    {
        if (newAge < 0)
        {
            System.out.println("Error: Negative age.");
            System.exit(0);
        }
        else
            age = newAge;
    }

    public void setType(int newType)
    {
        if (newType < 0 || newType > 1)
        {
            System.out.println("Error: Wrong type.");
            System.exit(0);
        }
        else
            type = newType;
    }

    public Pet(double initialWeight)
    {
        name = "No name yet";
        age = 0;
        if (initialWeight < 0)
        {
            System.out.println("Error: Negative weight.");
            System.exit(0);
        }
        else
            weight = initialWeight;
    }

    public void setWeight(double newWeight)
    {
        if (newWeight < 0)
        {
            System.out.println("Error: Negative weight.");
            System.exit(0);
        }
        else
            weight = newWeight;
    }

    public Pet()
    {
        name = "No name yet.";
        age = 0;
        weight = 0;
    }


    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public double getWeight()
    {
        return weight;
    }

    public String getType()
    {
        return getStringType();
    }

    public double acepromazine()
    {
        double mgPerKg = 0;
        if (type == 0)
            mgPerKg = 0.002;
        else if (type == 1)
            mgPerKg = 0.03;
        return (weight / 2.2) * (mgPerKg / 10);
    }

    public double carprofen()
    {
        double mgPerKg = 0;
        if (type == 0)
            mgPerKg = 0.25;
        else if (type == 1)
            mgPerKg = 0.5;
        return (weight / 2.2) * (mgPerKg / 12);
    }
}
