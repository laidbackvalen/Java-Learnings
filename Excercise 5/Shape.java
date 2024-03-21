
package vrp;
class Shape {
    int dim1;
    int dim2;

    Shape(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    int areaOfSquare(){
        int a;
        a = this.dim1 * this.dim1;
        return a;
    }
}