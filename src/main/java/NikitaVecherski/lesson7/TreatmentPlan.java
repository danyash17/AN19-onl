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
                break;
            case 1:
            case 2:
            default:
                code = 3;
        }
    }

    Integer getCode() {
        return code;
    }

}





