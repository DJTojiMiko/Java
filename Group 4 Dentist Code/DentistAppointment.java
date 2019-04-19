import  java.util.Scanner;

public class DentistAppointment{

    // this was the only sensible way i could think of checking for numerical input
    // used for the setting m later in the program

    public static boolean isNumber(String str){
        if (str.equals("")){
            return false;
        }
        for (char c : str.toCharArray()){
            if (!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
    
    // Attributes
    public Person patient;
    public Date day;
    public Time appointment;
    public int duration;
    public Time end;
    // Constructors
    public void setdentistAppointment(Person patient, Date day, Time appointment){
        this.patient = patient;
        this.day = day;
        this.appointment = appointment;
        this.duration = 30;
        Time X = new Time();
        X.time(appointment.getHour(), appointment.getMinute());
        X.addMinutes(this.duration);
        this.end = X; 
    }

    public void setdentistAppointment(Person patient, Date day, Time appointment, int duration){
        this.patient = patient;
        this.day = day;
        this.appointment = appointment;
        this.duration = duration;
        Time X = new Time();
        X.time(appointment.getHour(), appointment.getMinute());
        X.addMinutes(this.duration);
        this.end = X;
    }

    public void appointmentEntry(){
        Scanner sc = new Scanner(System.in);
        String x, y, z, lastName, firstName;
        String[] list1, list2, list3;
        int month, day, year, hour, minute, m;

        Person patient1 = new Person();
        Date day1 = new Date();
        Time clock1 = new Time();
            
        // Enter patient info
        System.out.print("Enter Patient's Name (Last,First): ");
        x = sc.nextLine();
        list1 = x.split(",");
        lastName = list1[0];
        firstName = list1[1];
        patient1.person(lastName, firstName);

        System.out.print("Enter Appointment Date (Month/Day/Year): ");
        y = sc.nextLine();
        list2 = y.split("/");
        month = Integer.parseInt(list2[0]);
        day = Integer.parseInt(list2[1]);
        year = Integer.parseInt(list2[2]);
        day1.date(month, day, year);

        System.out.print("Enter Appointment Time (Hour:Minute): ");
        z = sc.nextLine();
        list3 = z.split(":");
        hour = Integer.parseInt(list3[0]);
        minute = Integer.parseInt(list3[1]);
        clock1.time(hour, minute);

        System.out.print("Enter Appointment Duration (Minutes): ");
        // create input as a string instead of reading the next number as an integer
        String firstm = sc.nextLine();
        boolean checker = isNumber(firstm);
        // Check if input is numeric. If true, parse the string as an int and set it for m. Sets m as 30 otherwise
        if (checker){
            m = Integer.parseInt(firstm);
        }
        else{
            m = 30;
        }
        while(m > 240){
            System.out.println("Duration cannot exceed 240 minutes");
            System.out.print("Please Enter Duration (Minutes): ");
            m = sc.nextInt();
        }
        System.out.println("");
        
        this.patient = patient1;
        this.day = day1;
        this.appointment = clock1;
        this.duration = m;
    }
    
    public void appointmentDisplay(){
        this.patient.display();
        this.day.displayValues();
        this.appointment.displayTime();
        System.out.print(" to ");
        this.end.displayTime();
    }

    public static void main(String[] args){
        DentistAppointment[] client = new DentistAppointment[3];

        for(int i = 0; i < 3; i++){
            System.out.printf("Enter Client #%d Information\n", i+1);
            client[i] = new DentistAppointment();
            client[i].appointmentEntry();
        }

        // Display Dentist appointment
        for(int i = 0; i < 3; i++){
            System.out.printf("Client #%d\n", i+1);
            DentistAppointment A = new DentistAppointment();
            A.setdentistAppointment(client[i].patient, client[i].day, client[i].appointment, client[i].duration);
            A.appointmentDisplay();
            System.out.println("\n");
        }
    }
}