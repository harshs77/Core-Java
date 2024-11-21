public class Loops{
    public static void main(String[] args) {
       
  outer : for(int i=1;i<10;i++){
    internal : for(int k=0;k<1;k++){
        System.out.println("Hello Good Morning " +k);
        if(i == 5) continue internal;
    }
  }



//------------------
// int i=1;
// while (i<5) {
//     System.out.println(i);
//     i++;
// }

//-------------------
// System.out.println("-----------");
// int a = 0;
// do{
//     System.out.println(a);
//     a++;
// }while(a<5);


//-------------------
// int arr[] = {1,2,3,4,5};
// for(int j=0;j<arr.length;j++){
//     System.out.println(arr[j]);
// }


// for(int e : arr){
//     System.out.println(e);
// }





    }
}