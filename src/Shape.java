class Shape {
    int GetCorner(){
        return 0;
    }
}

class Rectangle extends Shape {
    int GetCorner(){
        return 4;
    }

    int GetParentCorner(){
        return super.GetCorner();
    }
}