public class AreaOfCircle{

    public static void main(String[] args){

        circleArea(1.0);

    }

    public static double circleArea(double radius){
        
        double area = Math.PI * radius * radius;
        System.out.printf("%.5f",area);
        return area;
    }

}
