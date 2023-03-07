package Decision_Making;

import java.util.Scanner;

public class LifeMaxi {
    public static void main(String[] args) {
        System.out.println("Welcome to LifeMaxi Insurance Company");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name below");
        System.out.print(">> ");
        String name = input.next();

        while (true) {
            if (name.length() > 2) {
                System.out.println("Enter your age below");
                System.out.print(">> ");
                int age = input.nextInt();

                if (age >= 16 && age <= 25) {
                    System.out.println("Enter your gender M for Male / F for Female");
                    System.out.print(">> ");
                    String gender = input.next();
                    switch (gender) {
                        case "F":
                        case "M": {
                            System.out.println("Are you self-employed or a professional");
                            System.out.print(">> ");
                            String prof = input.next();
                            switch (prof) {
                                case "self-employed" -> {
                                    System.out.println("How much do you make");
                                    System.out.print(">> ");
                                    int netCap = input.nextInt();
                                    if (netCap >= 25000) {
                                        System.out.println("You are eligible for a loan amount of $10000");
                                    }
                                    else {
                                        System.out.println("I'm sorry you are not eligible for loan");
                                    }
                                }
                                case "professional" -> {
                                    System.out.println("How much do you make");
                                    System.out.print(">> ");
                                    int netCap = input.nextInt();
                                    if (netCap >= 25000) {
                                        System.out.println("You are eligible for a loan amount of $15000");
                                    }
                                    else {
                                        System.out.println("I'm sorry you are not eligible for loan");
                                    }
                                }
                                default -> {
                                    System.out.println("Enter a correct profession");
                                }
                            }
                        }
                        default:
                            System.out.println("Please enter a correct gender");
                            break;
                    }
                }

                else if (age >= 26 && age <= 40) {
                    System.out.println("Enter your gender M for Male / F for Female");
                    System.out.print(">> ");
                    String gender = input.next();
                    switch (gender) {
                        case "F": {
                            System.out.println("Are you self-employed or a professional");
                            System.out.print(">> ");
                            String prof = input.next();
                            switch (prof) {
                                case "self-employed", "professional" -> {
                                    System.out.println("How much do you make");
                                    System.out.print(">> ");
                                    int netCap = input.nextInt();
                                    if (netCap >= 40000) {
                                        System.out.println("You are eligible for a loan amount of $30000");
                                    } else {
                                        System.out.println("I'm sorry you are not eligible for loan");
                                    }
                                }
                                default -> {
                                    System.out.println("Enter a correct profession!");
                                }
                            }
                        }
                        case "M": {
                            System.out.println("Are you self-employed or a professional");
                            System.out.print(">> ");
                            String prof = input.next();
                            switch (prof) {
                                case "self-employed", "professional" -> {
                                    System.out.println("How much do you make");
                                    System.out.print(">> ");
                                    int netCap = input.nextInt();
                                    if (netCap >= 40000) {
                                        System.out.println("You are eligible for a loan amount of $25000");
                                    } else {
                                        System.out.println("I'm sorry you are not eligible for loan");
                                    }
                                }
                                default -> {
                                    System.out.println("Enter a correct profession!");
                                }
                            }
                        }
                        default:
                            System.out.println("Please enter a correct gender");
                            break;
                    }
                }

                else if (age >= 41 && age <= 60) {
                    System.out.println("Enter your gender M for Male / F for Female");
                    System.out.print(">> ");
                    String gender = input.next();
                    switch (gender) {
                        case "F", "M" -> {
                            System.out.println("Are you self-employed or a professional");
                            System.out.print(">> ");
                            String prof = input.next();
                            switch (prof) {
                                case "self-employed", "professional" -> {
                                    System.out.println("How much do you make");
                                    System.out.print(">> ");
                                    int netCap = input.nextInt();
                                    if (netCap >= 50000) {
                                        System.out.println("You are eligible for a loan amount of $40000");
                                    } else {
                                        System.out.println("I'm sorry you are not eligible for loan");
                                    }
                                }
                                default -> {
                                    System.out.println("Enter a correct profession!");
                                }
                            }
                        }
                        default -> {
                            System.out.println("Please enter a correct gender");
                        }
                    }
                }

                else if (age > 60) {
                    System.out.println("Enter your gender M for Male / F for Female");
                    System.out.print(">> ");
                    String gender = input.next();
                    switch (gender) {
                        case "F", "M" -> {
                            System.out.println("Are you self-employed or a professional");
                            System.out.print(">> ");
                            String prof = input.next();
                            switch (prof) {
                                case "self-employed" -> {
                                    System.out.println("How much do you make");
                                    System.out.print(">> ");
                                    int netCap = input.nextInt();
                                    if (netCap >= 25000) {
                                        System.out.println("You are eligible for a loan amount of " + (35000 - age * 100));
                                    } else {
                                        System.out.println("I'm sorry you are not eligible for loan");
                                    }
                                }
                                case "retired" -> {
                                    System.out.println("How much do you make");
                                    System.out.print(">> ");
                                    int netCap = input.nextInt();
                                    if (netCap >= 25000) {
                                        System.out.println("You are eligible for a loan amount of " + (25000 - age * 100));
                                    } else {
                                        System.out.println("I'm sorry you are not eligible for loan");
                                    }
                                }
                                default -> {
                                    System.out.println("Enter a correct profession!");
                                }
                            }
                        }
                        default -> {
                            System.out.println("Please enter a correct gender");
                        }
                    }
                }

                else {
                    System.out.println("I'm sorry you are not eligible for loan");
                }
            }
            else {
                System.out.println("Enter a name that is not less than 2 characters short");
            }
        }
    }
}
