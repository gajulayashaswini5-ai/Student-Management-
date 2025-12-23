import java.util.*;
class Student{
   int id;
   String name;
   int age;
   String course;
   Student(int id,String name,int age,String course){
    this.id=id;
    this.name=name;
    this.age=age;
    this.course=course;
   }
}
public class StudentManagementSystem{
   static ArrayList<Student> students=new ArrayList<>();
   static Scanner sc=new Scanner(System.in);
   public static void addStudent(){
      System.out.println("Enter ID:");
      int id=sc.nextInt();
      sc.nextLine();
      System.out.println("Enter name: ");
      String name=sc.nextLine();
      System.out.println("Enter age: ");
      int age=sc.nextInt();
      sc.nextLine();
      System.out.println("Enter course: ");
      String course=sc.nextLine();

      students.add(new Student(id, name, age, course));
      System.out.println("Student added Succesufully!!");

   }
   public static void viewStudent(){
      if(students.isEmpty()){
         System.out.println("No studenst found!!");
         return;
      }
       for(Student s:students){
         System.out.println("ID: "+s.id+" Name: "+s.name+" Age: "+s.age+"Cousre:  "+s.course);
       }
   }
   public static void serachStudent(){
      System.out.println("Enter the id to serach");{
         int idtoserach=sc.nextInt();
         for(Student s:students){
            if(s.id==idtoserach){
               System.out.println("Student Found: "+s.name);
               return;
            }
         }
         System.out.println("Student no found");
      }
   }
   public static void updateStudent(){
      System.out.println("Enter the id to update");
         int id=sc.nextInt();
         sc.nextLine();
         for(Student s:students){
            if(s.id==id){
               System.out.println("Eter new Name:");
               s.name=sc.nextLine();
               System.out.print("Enter new Age: ");
               s.age = sc.nextInt();
               sc.nextLine();

               System.out.print("Enter new Course: ");
               s.course = sc.nextLine();

               System.out.println("Student Updated!");
               return;
        }
    }
    System.out.println("Student not found!");
            }
         

   public static void deleteStudent(){
      System.out.println("Enter ID to delete: ");
      int id=sc.nextInt();

      Iterator<Student> it=students.iterator();
      while(it.hasNext()){
         if(it.next().id==id){
            it.remove();
            System.out.println("Student deleted");
            return;
         }
      }
      System.out.println("Student not found");
   }
   public static void main(String[] args) {
     
      while(true){
         System.out.println("----Student Details----");
         System.out.println("1.Add Student");
         System.out.println("2.view Student");
         System.out.println("3.Search Student");
         System.out.println("4.Update Student");
         System.out.println("5.Delete Student");
         System.out.println("6.EXit");

         System.out.println("Enter Choice: ");
         int choice=sc.nextInt();
         switch(choice){
            case 1:
               addStudent();
               break;
            case 2:
               viewStudent();
               break;
            case 3:
               serachStudent();
               break;
            case 4:
               updateStudent();
               break;
            case 5:
               deleteStudent();
               break;
            case 6:
               System.out.println("Thank u");
               return;
            default:
               System.out.println("Invalid choice");
         }
      }
   }
}
