import java.util.Scanner;
public class Arrayoperations{


        public static int binarysearch (int arr[],int target)
        {
                int l=0;
                int u=arr.length-1;
                while(l<=u)
                {
                    int mid=l+(u-l)/2;
                    if(arr[mid]==target)
                    {
                          return mid;
                    }
                    else if(arr[mid]<=target)
                    {
                           l =mid+1;
                    }
                    else {

                        u=mid-1;
                    }
                }
                return-1;
        }



        public static int linearsearch(int arr[], int target){


            for(int i=0; i<=arr.length-1; i++)
            {
                 if(arr[i]==target)
                 {
                       return i;
                 }
            }

            return -1;



        }



        public static void bubblesort(int arr[])
        {
               for(int i=0; i<=arr.length-1;i++)
               {
                    for(int j=0;j<=arr.length-i-1; j++)

                    {
                        if(arr[j]>arr[j+1])
                        {
                              int temp=arr[j];
                              arr[j]=arr[j+1];
                              arr[j+1]=temp;
                        }

                    }
               }
        }

        public static void main(String[] args)

        {

                    Scanner sc = new Scanner(System.in);

                    System.out.print("Enter size of the array: ");
                    int n = sc.nextInt();

                    int[] arr = new int[n];
                    System.out.println("Enter " + n + " elements (integers):");
                    for (int i = 0; i < n; i++) {

                            arr[i] = sc.nextInt();
                    }

                 int target=4;

              //calling linearsearch 
              int linearresult=linearsearch(arr,target);
              if(linearresult==-1)
              {
                    System.out.println("element is not found in the array");

              }
              else {
                    System.out.println("  linearsearch-element is found in index  " +  linearresult);

              }


                    // Sort the array using bubble sort
                    bubblesort(arr);

                //calling binarysearch   

                int binaryresult=binarysearch( arr,target);
              if(binaryresult==-1)
              {
                     System.out.println("element is not found in the array");
              }
              else
              {
                    System.out.println(" binarysearch - element is found in the index  " +   binaryresult);




              }

                 //printng sorted array


               System.out.println("Sorted array:");
                    for (int num : arr)

                    {

                   System.out.print(num + " ");
                            
                }










        }





}

