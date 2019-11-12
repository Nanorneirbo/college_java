
// class is a steatement that creates a new class in java
// the basic data types like int etc arelimiting
// class can be thought of as a powerful user defined data type
// class usually starts with a capital;

// public means unrestricted access to the class can also use private - protected - remove
// class is a Blueprint for an object we will be creating

// when it comes to fields use private to suit encapsulation. 

//main class

public class Main {

    public static void main(String[] args) {

        //build an object based on the class

        Car porsche = new Car();
        Car ford = new Car();
        porsche.setModel("Carrera");
        System.out.println("model is: " + porsche.getModel());

    }
}
//Car class

public class Car {

    private int doors;      //defining 5 fields in the class
    private int wheels;     //private is not allowing them to go out
    private String model;
    private String engine;
    private String colour;


    //setter
    public void setModel(String model)

    {                               // have 2 versions of model - the field one and this parameter
        this.model = model;          //this keyword is picking the field from above
    }
    //getter
    public String getModel() {// be careful with your ;;;;;;;;;

        return this.model;

    }
}

// why use getters and setters - can do validation

public class Car {

    private int doors;      //defining 5 fields in the class
    private int wheels;     //private is not allowing them to go out
    private String model;
    private String engine;
    private String colour;


    //setter
    public void setModel(String model)
    {                               
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera")|| validModel.equals ("Commodore")){//validation
        this.model = model;          
    }
    else{
        this.model = "Unknown";
        }
    }
    //getter
    public String getModel()
    {
        return this.model;
    }
}



