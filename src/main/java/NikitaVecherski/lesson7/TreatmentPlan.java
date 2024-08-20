package NikitaVecherski.lesson7;


public class TreatmentPlan {

    Integer treatmentPlan;

    void treatment(int s){
        if (s ==1){
            treatmentPlan =s;
            System.out.println("Пациент направлен к Хирургу");
            Surgeon surgeon = new Surgeon();
            surgeon.docIsHere();
        }
        if(s==2){
            treatmentPlan = s;
            System.out.println("Пациент направлен к Дантисту");
            Dentist dentist = new Dentist();
            dentist.docIsHere();
        }
        if (s>=3){
            treatmentPlan = s;
            System.out.println("Пациент направлен к Терапевту");
            Therapist therapist = new Therapist();
            therapist.docIsHere();
        }
    }


}





