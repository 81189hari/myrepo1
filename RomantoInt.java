import java.util.Scanner;
class RomantoInt{
        public static void main(String[] args)

        {
              Scanner sc=new Scanner (System.in);
              System.out.println("1.to show roman number  for 1");
            System.out.println("2.to show roman number  for 5");
            System.out.println("3.to show roman number  for 10");
            System.out.println("4.to show roman number  for 50");
            System.out.println("5.to show roman number  for 100");
            System.out.println("6.to show roman number  for 500");
            System.out.println("7.to show roman number for 1000");
            System.out.println("choose one from the above to show roman for that number");
            System.out.println("enter operation :");
            int operation=sc.nextInt();
            switch(operation)
            {
                case 1: System.out.println("roman number for '1' is I");

                break;

                case 2: System.out.println("roman number for '5' is V");

                    break;

                case 3: System.out.println("roman number for '10' is X");

                    break;

                case 4: System.out.println("roman number for '50' is L");

                    break;

                case 5: System.out.println("roman number for '100' is C");

                    break;

                case 6: System.out.println("roman number for '500' is D");

                    break;

                case 7: System.out.println("roman number for '1000' is M");

                    break;

                default:System.out.println("please enter valid operation");



            }


        }
}