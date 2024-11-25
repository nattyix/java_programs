import java.util.Scanner;
class Student1{
String usn;
String name;
String branch;
String phone;
void read()
{
Scanner s=new Scanner(System.in);
System.out.println(&quot;Enter usn&quot;);
usn=s.next();
System.out.println(&quot;Enter name&quot;);
name=s.next();
System.out.println(&quot;Enter branch&quot;);
branch=s.next();
System.out.println(&quot;Enter phone&quot;);
phone=s.next();

}
// Method to display student details
void display() {
System.out.println(&quot;USN: &quot; + usn);

System.out.println(&quot;Name: &quot; + name);
System.out.println(&quot;Branch: &quot; + branch);
System.out.println(&quot;Phone: &quot; + phone);
System.out.println(); // Empty line for better formatting
}
}
public class Student {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println(&quot;Enter number of students&quot;);
int n=s.nextInt();
Student1[] s1=new Student1[n];
for (int i = 0; i &lt; n; i++)
{
s1[i] = new Student1();
}
for(int i=0;i&lt;n;i++)
{
s1[i].read();
}
for(int i=0;i&lt;n;i++)
{
s1[i].display();
}
}
}
