package Main;

import Brands.Blackbeery;
import Brands.Iphone;
import Brands.SamsungPhone;
import java.util.Scanner;

public class Cell_phone {
    public static void main(String[] args)
    {
        boolean isCheck=true;
        // create Scanner obj to take the input.
        Scanner sc = new Scanner(System.in);

        // create a class objects fo accessing there methods.
        Iphone iphone_obj = new Iphone();
        SamsungPhone samsung_obj = new SamsungPhone();
        Blackbeery blackberry_obj = new Blackbeery();

        System.out.println("\n\n **** Welcome to cell-phone store **** ");

        do
        {
            System.out.println("-----------------------------------------------");
            // create a design to ask there choice.
            System.out.println("\n1. Iphone");
            System.out.println("2. Samsung");
            System.out.println("3. Blackberry");
            System.out.println("4. Exit");

            // take a input choice from user.
            System.out.print("\nEnter your choice : ");
            String input = sc.next();
            System.out.println("\n-----------------------------------------------");

            try
            {
                // create a switch case for showing choice related data.
                int choice = Integer.parseInt(input);

                switch(choice)
                {
                    case 1:
                        System.out.println("Following are the features of Iphone Brand !!!");
                        iphone_obj.sms();
                        iphone_obj.phoneDialer();
                        iphone_obj.battery();
                        iphone_obj.calculator();
                        iphone_obj.simCard();
                        iphone_obj.camera();
                        System.out.println("\n*Extra Feature : ");
                        iphone_obj.ituneStore();
                        iphone_obj.icloudDrive();
                        break;

                    case 2:
                        System.out.println("Following are the features of Samsung Brand !!!");
                        samsung_obj.sms();
                        samsung_obj.phoneDialer();
                        samsung_obj.battery();
                        samsung_obj.calculator();
                        samsung_obj.simCard();
                        samsung_obj.camera();
                        System.out.println("\n*Extra Feature : ");
                        samsung_obj.samsung_pay();
                        samsung_obj.memory_card();
                        break;

                    case 3:
                        System.out.println("Following are the features of Blackberry Brand !!!");
                        blackberry_obj.sms();
                        blackberry_obj.phoneDialer();
                        blackberry_obj.battery();
                        blackberry_obj.calculator();
                        blackberry_obj.simCard();
                        blackberry_obj.camera();
                        System.out.println("\n*Extra Feature : ");
                        blackberry_obj.mi_store();
                        blackberry_obj.mi_remote();
                        blackberry_obj.memory_card();
                        break;

                    case 4:
                        System.out.println("Thank you for visiting us !!!");
                        isCheck=false;
                        break;

                    default:
                        System.out.println("Invalid Input");
                        isCheck=true;
                        break;
                }
            }
            catch(NumberFormatException e)
            {
                System.out.println("Please enter valid option");
                isCheck = true;
            }
        }while(isCheck);
        System.out.println("-----------------------------------------------");
    }
}
