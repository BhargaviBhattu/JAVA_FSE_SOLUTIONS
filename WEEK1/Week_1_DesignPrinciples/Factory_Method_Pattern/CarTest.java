public class CarTest{
  public static void main(String[] args){
    CarFactory factory=new CarFactory();
    Car suvCar=factory.getCar("SUV");
    suvCar.assemble();
