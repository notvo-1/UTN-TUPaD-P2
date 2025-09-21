/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadsatic;

/**
 *
 * @author notvo
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ticket t1 = new Ticket(12314, "1990-02-13");
        System.out.println(t1);
        Ticket t2 = new Ticket(5523312);
        System.out.println(t2);
        Ticket t3 = new Ticket(678678, "2000-08-23");
        System.out.println(t3);
        Ticket t4 = new Ticket(3345345, "2020-03-21");
        System.out.println(t4);
        Ticket t5 = new Ticket(7878978);
        System.out.println(t5);
        Ticket t6 = new Ticket(111111111);
        System.out.println(t6);
        Ticket t7 = new Ticket(333333);
        System.out.println(t7);
        Ticket t8 = new Ticket(99999,"1928-02-01");
        System.out.println(t8);
        Ticket t9 = new Ticket(512312312);
        System.out.println(t9);
        
        System.out.println(t1.getContTicket());
    }
        
}
