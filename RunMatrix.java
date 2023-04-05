import java.util.Scanner;



public class RunMatrix {

  public static void main(String[] args) {

    Matrix m = new Matrix();

    m.createMatrixSample(); // create matrix filled with zero's

    m.printMatrix();
    m.createMatrix();

    m.printMatrix();  // print before the matrix is flipped

    m.flipMatrix();            //Flips matrix


    m.printMatrix(); // print after the matrix is flipped

  }

}
