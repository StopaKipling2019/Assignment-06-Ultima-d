public class Main {

    public static int worldTime =6276;
    public static int year, minute, hour, day, cycleTram, cycleFelu, minExtra, minExtra2;

    public static void main(String[] args) {
        // write your code here

        yearCalculator();
        year = yearCalculator();

        dayCalculator();
        day = dayCalculator();

        hourCalculator();
        hour = hourCalculator();

        minuteCalculator();
        minute = minuteCalculator();

        trammelCalculator();
        cycleTram = trammelCalculator();

        feluccaCalculator();
        cycleFelu = feluccaCalculator();


        System.out.println("worldTime = " + worldTime);
        String minutesFormatted = String.format ("%02d", minute);
        System.out.println("It is " + hour + ":" + minutesFormatted + " on day " + day + " of the year " + year + ".");
        System.out.println("Trammel is in day " + cycleTram + " of its 9 day phase.");
        System.out.println("Felucca is in day " + cycleFelu + " of its 14 day phase.");




    }

    public static int yearCalculator() {


       return ((worldTime / (60 * 24 * 365)) + 1);

    }

    public static int dayCalculator()  {

       return (((worldTime % (60 * 24 *365))/(60*24))+1);

    }

    public static int hourCalculator() {

        return (((worldTime % (60 * 24 *365)) % (60 * 24)) / 60);



    }

    public static int minuteCalculator() {

        return (((worldTime % (60 * 24 *365)) % (60 * 24)) % 60);


    }


    public static int trammelCalculator() {

       return (((worldTime / (60 * 24)) % 9) + 1);
    }

    public static int feluccaCalculator() {

        return (((worldTime / (60 * 24)) % 14) + 1);
    }
}

