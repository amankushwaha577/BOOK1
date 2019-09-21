import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //sc.next();
        Book[] b=new Book[n];
        if(n<1){
            System.out.println("N/A");
        }
        else
        {
            //sc.nextLine().trim();
            sc.nextLine();
            for(int i=0;i<n;i++){
                String bookName=sc.nextLine();
                String authorName=sc.nextLine();
                String isbnNumber=sc.nextLine();
                b[i] =new Book(bookName,authorName,isbnNumber);
            }
        }
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }}