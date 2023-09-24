import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerOfficer managerOfficer = new ManagerOfficer();
        while (true){
            System.out.println("Application Manager Officer");
            System.out.println("Enter 1: To Insert officer");
            System.out.println("Enter 2: To search officer by name:");
            System.out.println("Enter 3: To show information officer");
            System.out.println("Enter 4: To exit:");
            String line = scanner.nextLine();
            switch (line){
                case "1" : {
                    System.out.println("Enter a: To insert Enginner");
                    System.out.println("Enter b: To insert Staff");
                    System.out.println("Enter c: To insert Worker");
                    String type = scanner.nextLine();
                    switch (type){
                        case "a" : {
                            System.out.println("Enter Name: ");
                            String name = scanner.nextLine();
                            System.out.println("Enter Age: ");
                            int age = scanner.nextInt();
                            System.out.println("Enter Sex: ");
                            scanner.nextLine();
                            String sex = scanner.nextLine();
                            System.out.println("Enter Address: ");
                            String address = scanner.nextLine();
                            System.out.println("Enter Task: ");
                            String task = scanner.nextLine();

                            Office enginner = new Engineer(name, age ,sex,address,task);
                            managerOfficer.addOffice(enginner);
                            System.out.print(enginner);
                            break;
                        }
                        case "b" : {
                            System.out.println("Enter Name: ");
                            String name = scanner.nextLine();
                            System.out.println("Enter Age: ");
                            int age = scanner.nextInt();
                            System.out.println("Enter Sex: ");
                            scanner.nextLine();
                            String sex = scanner.nextLine();
                            System.out.println("Enter Address: ");
                            String address = scanner.nextLine();
                            System.out.println("Enter Task: ");
                            String task = scanner.nextLine();

                            Office staff = new Staff(name, age ,sex,address,task);
                            managerOfficer.addOffice(staff);
                            System.out.print(staff);
                            break;
                        }
                        case "c" : {
                            System.out.println("Enter Name: ");
                            String name = scanner.nextLine();
                            System.out.println("Enter Age: ");
                            int age = scanner.nextInt();
                            System.out.println("Enter Sex: ");
                            scanner.nextLine();
                            String sex = scanner.nextLine();
                            System.out.println("Enter Address: ");
                            String address = scanner.nextLine();
                            System.out.println("Enter Task: ");
                            String task = scanner.nextLine();

                            Office worker = new Worker(name, age ,sex,address,task);
                            managerOfficer.addOffice(worker);
                            System.out.print(worker);
                            break;
                        }
                        default:
                            System.out.println("Invalue");
                            break;
                    }
                    break;
                }
                case "2" : {
                    System.out.println("Enter name to search: ");
                    String name = scanner.nextLine();
                    managerOfficer.searchOfficeByname(name).forEach(office -> {
                        System.out.println(office);
                    });
                    break;
                }
                case "3" : {
                    managerOfficer.showListInforOfficer();
                    break;
                }
                case "4" : {
                    return;
                }
                default:
                    System.out.println("Invalue");
                    continue;
            }
        }


    }
}