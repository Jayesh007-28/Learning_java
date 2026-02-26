class PropertyTax{

    public double calculateTax(double areaSq){
        return areaSq * 10;
    }

    public double calculateTax(int propertyValue){
        return propertyValue * 0.02;
    }
    
    public double calculateTax(double areaSq , double propertyValue){
        return areaSq * propertyValue;
    }
}

public class overloading {
    public static void main(String[] args) {
        PropertyTax obj = new PropertyTax();

        System.out.println("PRoperty tax as per area : "+obj.calculateTax(700.12));
        System.out.println("PRoperty tax as per propertyValue : "+obj.calculateTax(7000000));
        System.out.println("PRoperty tax as per area and propertyvlaue : "+obj.calculateTax(700, 700));

        
    }
}
