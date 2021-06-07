public class Shape {
    public static double value1;
    public static double value2;
    public static double getValue1() {
        return value1;
    }
    public static void setValue1(double value1) {
        Shape.value1 = value1;
    }
    public static double getValue2() {
        return value2;
    }
    public static void setValue2(double value2) {
        Shape.value2 = value2;
    }
    public static class Rectangle 
    {
        public static void setValue1(double value1) {
            Shape.value1 = value1;
        }
        
        public static void setValue2(double value2) {
            Shape.value2 = value2;
        }
        
        public double computeRectangleArea()
        {
            return getValue1()*getValue2();
        }
        
    }
    public static class Triangle 
    {
        
        public static void setValue1(double value1) {
            Shape.value1 = value1;
        }
        
        public static void setValue2(double value2) {
            Shape.value2 = value2;
        }
        
        public Double computeTriangleArea()
        {
            return 0.5*(getValue1()*getValue2());
        }
        
    }    
}