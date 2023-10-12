import java.util.*;
public class project{
   static  Node head;
    static class Node{
        int admno;
        int id;
        String name_student,name_book;
        String date_taking,date_return;
        Node next;
        Node(String name_student,int admno){
            this.name_student=name_student;
            this.admno=admno;
            next=null;

        }
        Node(int admno){

            this.admno=admno;
            next=null;
        }
        
        
        
    }
void enter(String name,int id){
    
    Node new1=new Node(name,id);
    if(head==null){
       head= new1;
       
    }
    
new1.next=null;
Node n=head;
while(n.next!=null){
    n=n.next;
}
n.next=new1;
    }
void exit(int id){
Node n=head;
while(n.next!=null){
    if(n.admno==id){
        n.next=n.next.next;
    }

        n=n.next;
    
}

}
void take(int id){
    Node n=head;
    while(n!=null){
        if(n.id==id ){
            n.next=n.next.next;
        }
        
            n=n.next;
        
    }

}
void returnbook(int id){
    Node new1=new Node(id);
    Node n=head;
    new1.next=null;
    while(n.next!=null){
n=n.next;
    }
    n.next=new1;

}
void displays(){
    Node n=head;
    System.out.println();
    System.out.println("==================================================");
    System.out.println("\t THE STUDENTS DIVING INTO THE BOOKS ARE");
    System.out.println("==================================================");
    System.out.println();
    System.out.println("ID\tNAME OF STUDENT \t ");
    while(n!=null&&n.admno!=0){
      System.out.println(n.admno+"\t"+n.name_student);
        System.out.println("...............................................");
        n=n.next;
        
    }
}
void displaybooks(){
    System.out.println();
    System.out.println("==================================================");
    System.out.println("\t THE GEMS OF THE LIBRARY ARE");
    System.out.println("==================================================");
    System.out.println();
    System.out.println("ID\t AUTHOR\t\t NAME OF THE BOOK");
    System.out.println();
    System.out.println();
    System.out.println("123\tFARIYAL MUJEEB KHAN\tI WISH I WAS AN EXTROVERT " );
   System.out.println(".........................................................");
   System.out.println();
    System.out.println("124\tDr.JOSEPH\tTHE POWER OF SUBCONSCIOUS MIND" );
    System.out.println(".........................................................");
    System.out.println();
    System.out.println("113\tJAPANESE\tIKIGAI" );
    System.out.println(".........................................................");
    System.out.println();
    System.out.println("114\t STUTI CHANGLE\tYOU ONLY LIVE ONCE" );
    System.out.println(".........................................................");
    System.out.println();
    System.out.println("134\tGARIMA PRADHAN\t A GIRL WHO KNEW TOO MUCH" );
    System.out.println(".........................................................");
    System.out.println();
    System.out.println("135\tJAY SHETTY\t THINK LIKE A MONK" );
    System.out.println(".........................................................");
    System.out.println();
    System.out.println("122\t CHETHAN BHAGAT\t  THE GIRL IN ROOM 105" );
    System.out.println(".........................................................");
    System.out.println();
    System.out.println("139\t JAPANESE\t A LITTLE BOOK OF HAPPINESS -" );
    System.out.println(".........................................................");
    System.out.println();
    System.out.println("129\tNOVONEEL CHAKRABORTHY\t A THING BEYOND FOREVER " );
    System.out.println(".........................................................");
    System.out.println();
    System.out.println("143\t NAPOLEAN HILL\tTHINK AND GROW RICH" );


}



    public static void main(String args[]){
        System.out.println(" ========================================");
        System.out.println("  WELCOME TO ALOCHANA READER'S CLUB");
        System.out.println(" ========================================");
        System.out.println();
        System.out.println("\t1) Enter into the library ");
        System.out.println("\t2)Exit from the library");
        System.out.println("\t3)Take out a book");
        System.out.println("\t4)Return back the book");
        System.out.println("\t5)Dispaly Books present in the library");
        System.out.println("\t6)Dispaly Students present in the library");
        System.out.println();
        Scanner sc=new Scanner(System.in);
        project l=new project();
       Node fir= new Node("Vinaya",27);
        Node sec=new Node("Mujeeb",45);
        Node thir=new Node("JAya",43);
        head=fir;
        fir.next=sec;sec.next=thir;
        while(true){
        System.out.println("Enter your choice........");
        int n=sc.nextInt();
        switch(n){
            case 1:
            System.out.println("ENTER YOUR ROLL NUMBER................");
            int rn=sc.nextInt();
            System.out.println("ENTER YOR NAME.............");
            String nm=sc.next();
            l.enter(nm, rn);
            System.out.println();
            System.out.println();
            System.out.println("HAPPY READING...........");
            break;
            case 2:
            System.out.println("ENTER YOUR ROLL NUMBER................");
            int rn1=sc.nextInt();
            l.exit(rn1);
            System.out.println();
            System.out.println();
            System.out.println("HAPPY HAVING YOU...........");
            break;
            case 3:
            l.displaybooks();
            System.out.println("ENTER THE ID OF THE BOOK...... ");
            int i=sc.nextInt();
            l.take(i);
            System.out.println();
            System.out.println();
            System.out.println("HAPPY READING..........");
            break;
            case 4:
            System.out.println("ENTER THE ID OF THE BOOK...... ");
            int i1=sc.nextInt();
            l.returnbook(i1);
            System.out.println();
            System.out.println();
            System.out.println("HOPE YOU ENJOYED READING..........");
            break;
            case 5:
            l.displaybooks();
            break;
            case 6:
            l.displays();
            break;
        }
        System.out.println();
        System.out.println("PRESS ANY KEY TO CONTINUE.......");
String str=sc.next();
if(!(Character.isLetterOrDigit(str.charAt(0))))
break;
}
}
}
