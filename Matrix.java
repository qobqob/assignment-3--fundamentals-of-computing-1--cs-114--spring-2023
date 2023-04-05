import java.util.Scanner;



public class Matrix {

    private int [][]matrix;



    public Matrix(){

        int size;



        Scanner scan = new Scanner(System.in);

        System.out.println("  Matrix size number : "); // insert size number for matrix

        size = scan.nextInt();

        System.out.println(" assigned number for matrix size: " + size); // assign number then print

        matrix = new int [size][size];

    }



    public void createMatrixSample(){



        Scanner populate = new Scanner(System.in);

        int row;

        int col;



        System.out.println("Creating the sample ");
        // sample of martrix without all the numbers


        for(row = 0; row < matrix.length; row++){

            for(col = 0; col < matrix.length; col++){

                matrix[row][col] = 0;

                // initialize all elements of the matrix to zero
            }

        }



    }



    public void createMatrix(){



        Scanner populate = new Scanner(System.in);

        int row;

        int col;

        int matrixCount = 1;



        System.out.println("Creating Matrix ");



        for(row = 0; row < matrix.length; row++){

            for(col = 0; col < matrix.length; col++){

                matrix[row][col] = matrixCount++;


            }

        }



    }







    public void printMatrix(){

        int row;

        int col;

        int x1 = 0;

        int y1 = matrix.length - 1;

        System.out.println();



        for(row = 0; row < matrix.length; row++){

            for(col = 0; col < matrix.length; col++){

                if(row == x1 && col == y1){

                    System.out.print("\u001B[33m");

                }

                System.out.printf("%4d ", matrix[row][col]);

                System.out.print("\u001B[0m"); // print matrix with yellow color

            }

            x1++;

            y1--;

            System.out.println();

        }

        System.out.println();

    }



    private void swap(int x1, int y1, int x2, int y2){ // swap the values of two elements in the matrix

        int temp = matrix[x1][y1];

        matrix[x1][y1] = matrix[y2][x2];

        matrix[y2][x2] = temp;

    }



    public void flipMatrix(){

        int row;

        int col;

        int n = matrix.length;

        for(row=0; row<n; row++){

            for(col=0; col < n - 1 - row; col++){ // runs the loop of the numbers in the matrix

                swap(row, col, n-1-col, n-1-row); // swap and flip the matrix diagonally

            }

        }



    }




}
