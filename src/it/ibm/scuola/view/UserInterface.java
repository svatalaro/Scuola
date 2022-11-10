package it.ibm.scuola.view;

import it.ibm.scuola.data.CourseRepository;
import it.ibm.scuola.model.Course;

import java.util.Scanner;

public class UserInterface {
    public void menu(){
        System.out.println("menù:");
        System.out.println("digita V per vedere i corsi disponibili");
        System.out.println("digita S per vedere gli studenti registrati");
        System.out.println("digita C per inserire un nuovo corso");
        System.out.println("digita A per iscrivere un nuovo studente");
        System.out.println("digita X per uscire");
        start();
    }

    public void start() {
        System.out.print("digita la tua scelta: ");
        Scanner choice = new Scanner(System.in);
        if (choice.toString() == "V"){
            CourseRepository showCourses = new CourseRepository();
            showCourses.getCourse();
        } else if (choice.toString() == "S") {
            Course showStudents = new Course();
            showStudents.getStudents();
        } else if (choice.toString() == "C") {
            System.out.print("inserire il titolo del corso: ");
            Scanner choiceTitle = new Scanner(System.in);
            System.out.print("inserire la durata del corso: ");
            Scanner choiceDuration = new Scanner(System.in);
            System.out.print("inserire il costo del corso: ");
            Scanner choicePrice = new Scanner(System.in);
        } else if (choice.toString() == "A") {

        } else if (choice.toString() == "X") {
            System.exit(0);
        } else {
            System.out.println("scelta non corretta, selezionare la giusta opzione");
            menu();
        }
    }
}
