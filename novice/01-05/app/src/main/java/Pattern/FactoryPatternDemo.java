package Pattern;


public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory ShapeFactory = new ShapeFactory();

        //get an object of circle and call its draw method.
        Circle shape1 = (Circle) ShapeFactory.getShape("Circle");

        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and call its draw method.
         Shape shape2 = ShapeFactory.getShape("Rectangle");

        //call draw method of Rectangle
        shape2.draw();

        //get an object of Square and call its draw method.
        Shape shape3 =  ShapeFactory.getShape("SQUARE");

        //call draw method of square
        shape3.draw();
    }

}
