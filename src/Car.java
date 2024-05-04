public class Car {
private int year;
private Model model;
private Color color;

public Car(int yr, Model m, Color cto){
    year=yr;
    model=m;
    color=cto;
}
public void display(){
    System.out.print(color+" ");
    System.out.print(model +" ");
    System.out.print(year+" \n");
}
}