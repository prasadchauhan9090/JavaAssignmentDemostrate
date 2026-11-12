package Demo.com;

import java.util.Scanner;

public class SwitchStatements {


    public static void main(String args[])
    {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Days from 1 to 7");

        String days=sc.nextLine();


        switch (days){

            case "Monday":
                case "Tuesday":
                    case "Wednesday":
                        case "Thursday":
                            case "Friday":
                                System.out.println("OFF IT'S WEEK DAY");
                                break;

            case "SATURDAY":
                case "SUNDAY":
                    System.out.println("YEYEYEY IT'S WEEKEND DAY");
                    break;

                    default:
                        System.out.println("INVALID DAYS");
        }



    }
}
