package com.bridgelabz.DLS_Assinment_Program.Day3;

public class EmpWage {
    static final int FULL_DAY_HOUR=8;
    static final int PART_DAY_HOUR=4;
    static final int WAGE_PER_HOUR=20;
    static final int TOTAL_WORKING_DAYS=20;
    static final int TOTAL_WORKING_HOUR=100;


    public void employeeWage(int FULL_DAY_HOUR,int PART_DAY_HOUR,int WAGE_PER_HOUR,int TOTAL_WORKING_DAYS,int TOTAL_WORKING_HOUR){
        int day=1;
        int workingHour=0;
        int totalWage=0;

        while (day<=TOTAL_WORKING_DAYS && workingHour<TOTAL_WORKING_HOUR ){
            int dayWage=0;
            System.out.println(day + " day");
            int isPresent=(int) (Math.random()*10%3);
            switch (isPresent){
                case 1:
                    dayWage= PART_DAY_HOUR*WAGE_PER_HOUR;
                    System.out.println("Part time: ");
                    workingHour+=PART_DAY_HOUR;
                    break;
                case 2:
                    dayWage=FULL_DAY_HOUR*WAGE_PER_HOUR;
                    System.out.println("Full time: ");
                    workingHour+=FULL_DAY_HOUR;
                    break;
                default:
                    System.out.println("absent");
            }
            totalWage=totalWage+dayWage;
            System.out.println(workingHour + " working hour: ");
            System.out.println(dayWage + " day wage");

            day++;
        }
        System.out.println(totalWage + " total wage: ");
    }

    public static void main(String[] args) {
        EmpWage company1 = new EmpWage();
        company1.employeeWage(12,6,20,20,100);
        System.out.println("for company one");
    }

}
