public class Triangle extends Shape{
    private double size1 = 1.0;
    private double size2 = 1.0;
    private double size3 = 1.0;

    public double getSize1() {
        return size1;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }

    public Triangle(){}
    public Triangle(double size1,double size2,double size3){
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }
    public Triangle(double size1,double size2,double size3,String color){
        setColor(color);
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public double getArea (){
        double p = (size1 + size2 + size3)/2;
        return Math.sqrt(p*(p-size1)*(p-size2)*(p-size3));
    }
    public boolean isValid() {
        if (((size1 + size2) > size3) &&
                ((size1 + size3) > size2) &&
                ((size3 + size2) > size1)) {
            return true;
        }
        return false;
    }
    public double getPerimeter (){
        return size1 + size2 + size3;
    }

    @Override
    public String toString() {
        if (!isValid()){
            return "Not a valid triangle!";
        }else {
        return "size1=" + size1 + ", size2= " + size2 + ", size3= " + size3 + super.toString()
                + "Perimeter = "+getPerimeter() + " Area = "+this.getArea();
        }
    }
}
