package lialiuika;

public class Plan {

    static Doctor doctorT = new Therapist();
    static Doctor doctorS = new Surgeon();
    static Doctor doctorD = new Dantist();

    int number;

    public Plan(int number){
        this.number = number;
    }

    public Plan() {

    }

    public void checkdoc() {
            if (number == 1) {
                doctorS.treat();
            } else if( number == 2){
                doctorD.treat();
                }
            else (){
                doctorT.treat();
            }
        }
    }

}
