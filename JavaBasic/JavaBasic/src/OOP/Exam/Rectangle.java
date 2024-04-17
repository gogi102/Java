package OOP.Exam;

public class Rectangle {
    int width;
    int length;

    int calculateArea(){
        return width * length;
    }
    int calculatePerimeter(){
        return 2*(width * length);
    }
    boolean isSquare(){
        return this.width == this.length;
    }
    }
