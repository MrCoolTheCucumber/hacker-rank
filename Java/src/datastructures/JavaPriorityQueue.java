package datastructures;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class JavaPriorityQueue {

}

class Student{
    private int token;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.token = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getToken() {
        return token;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalEvents = Integer.parseInt(in.nextLine());

        PriorityQueue<Student> pQ = new PriorityQueue<>((o1, o2) -> {
            if(o1.getCgpa() > o2.getCgpa()) {
                return -1;
            } else if(o1.getCgpa() < o2.getCgpa()) {
                return 1;
            } else {
                //Cgpa are equal
                int comparison = o1.getFname().compareTo(o2.getFname());
                if(!o1.getFname().equals(o2.getFname())) return comparison;

                if(o1.getToken() > o2.getToken()) {
                    return -1;
                } else {
                    return 1;
                }

            }
        });

        while(totalEvents>0){
            String event = in.next();
            switch (event) {
                case "ENTER":
                    String fName = in.next();
                    double token = in.nextDouble();
                    Student student = new Student(in.nextInt(), fName, token);
                    pQ.add(student);
                    break;
                case "SERVED":
                    pQ.poll();
                    break;
            }

            totalEvents--;
        }

        int s = pQ.size();

        if(s == 0) {
            System.out.println("EMPTY");
            return;
        }

        while (s-->0) {
            System.out.println(pQ.poll().getFname());
        }
    }
}
