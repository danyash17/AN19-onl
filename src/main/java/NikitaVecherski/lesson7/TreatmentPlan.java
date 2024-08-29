package NikitaVecherski.lesson7;


public class TreatmentPlan {

    private Integer code;

    public TreatmentPlan(Integer illness) {
        switch (illness) {
            case 3:
                code = 1;
                break;
            case 4:
                code = 2;
                Doctor dentist;
                break;
            default:
                code = 3;
                Doctor therapist;
        }
    }

    public Integer getCode() {
        return code;
    }
}




