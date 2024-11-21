// import java.util.Scanner;

// public class Arrays {
    
// public static void main(String[] args) {


//     // 1d array 
//   int array[] = {10,20,30};
//     int[] myArray = {50,60,70};
   

//     // 2d array 
//     int[][] twoD = {{20,30} ,{40,50}}; 


//     // 3d array 
//     int [][][] threeD = {{{20},{20,30}}};


//     // dynamic array 
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the size of array");
//     int size = sc.nextInt();
//     int arr[] = new int[size];
// arr[0] = 10;
// System.out.println("Enter the size of the array");
// arr[1] = sc.nextInt();
// System.out.println("Enter the value to store in array");
// arr[2] = sc.nextInt();
// System.out.println("Enter the value to store in array");
// arr[3] = sc.nextInt();

// // System.out.println(arr[0] + " , " + arr[1]);
// // taking input in the array from user
// for(int i=0; i<arr.length;i++){
//     for(int j=0;j<arr.length;j++){
//     arr[1][j] = sc.nextInt();
//     System.out.println(arr[i]);
//     }
// }


// for(int i[] : arr){
//     for(int j : i)
//     System.out.println(j);
// }


// //    System.out.println(array[0]); 
// //    System.out.println(myArray); 
// //    System.out.println(twoD[1][1]); 
// //    System.out.println(threeD); 



// }


// }


import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        
        // 1D array 
        int array[] = {10, 20, 30};
        int[] myArray = {50, 60, 70};

        // 2D array 
        int[][] twoD = {{20, 30}, {40, 50}}; 

        // 3D array 
        int[][][] threeD = {{{20}, {20, 30}}};

        // Dynamic 1D array 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];

        // Taking input to populate elements of 1D array `arr`
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter value for element " + i + " in the array:");
            arr[i] = sc.nextInt();
        }

        // Printing the elements of the 1D array `arr`
        System.out.println("Elements in the 1D array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Printing elements of predefined arrays
        System.out.println("\nElements in array:");
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nElements in myArray:");
        for (int i : myArray) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nElements in 2D array twoD:");
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nElements in 3D array threeD:");
        for (int i = 0; i < threeD.length; i++) {
            for (int j = 0; j < threeD[i].length; j++) {
                for (int k = 0; k < threeD[i][j].length; k++) {
                    System.out.print(threeD[i][j][k] + " ");
                }
                System.out.println();
            }
        }

    }
}


