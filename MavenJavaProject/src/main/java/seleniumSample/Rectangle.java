package seleniumSample;

class Rectangle {
    private int length;
    private int width;

    
    public Rectangle() {
        length = 0;
        width = 0;
    }

    
    public Rectangle(int side) {
        length = side;
        width = side;
    }

   
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    
    public void display() {
        System.out.println("Length: " + length + ", Width: " + width);
    }

   
    public int area() {
        return length * width;
    }

    public static void main(String[] args) {
        
        Rectangle rect1 = new Rectangle();  
        Rectangle rect2 = new Rectangle(5);  
        Rectangle rect3 = new Rectangle(10, 5);  

        
        rect1.display();
        rect2.display();
        rect3.display();

       
        System.out.println("Area of rect1: " + rect1.area());
        System.out.println("Area of rect2: " + rect2.area());
        System.out.println("Area of rect3: " + rect3.area());
    }
}
