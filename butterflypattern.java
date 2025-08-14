
            public class butterflypattern{
                public static void main(String[] args)

                {
                    int a=4;
                    for(int i=1;i<=a;i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");

                        }

                        for (int j = 1; j <= 2 * (a - i); j++) {
                            System.out.print(" ");

                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");

                        }


                        System.out.println();


                    }




                    for(int i=a-1; i>=1;i--) {


                        for (int j = 1; j <= i; j++) {


                            System.out.print("*");

                        }

                        for (int j = 1; j <= 2 * (a - i); j++) {
                            System.out.print(" ");

                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");

                        }


                        System.out.println();


                    }

                }
            }
            }