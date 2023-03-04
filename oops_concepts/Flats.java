package oops_concepts;

public class Flats extends Residential_Properties{

    //Method Overriding
    @Override
    void garden() {

        System.out.println("Property do not have garden.");
    }

    void ownership(){
        System.out.println("Property is leasehold.");
    }

}
