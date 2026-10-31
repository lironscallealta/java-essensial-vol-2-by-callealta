package english.cp05polymorphism.codingtask.doing.codingtaskone;

public class PartialScholar extends Student {

    private float discountRate;
    private float payableAmount;

    PartialScholar(String name, String course, float tuitionFee, float discountRate) {
        super(name, course, tuitionFee);
        this.discountRate = discountRate;
        this.payableAmount = super.getTuitionFee() - (super.getTuitionFee() * discountRate);

    }

    public float getDiscountRate() {
        return discountRate;
    }

    public float getPayableAmount() {
        return payableAmount;
    }

    public String getName() {
        return super.getName();
    }

    public float getTuitionFee() {
        return super.getTuitionFee();
    }

    public String getCourse() {
        return super.getCourse();
    }

    @Override
    public String toString() {
        return String.format("%sDescount: %.2f %% ", super.toString(), discountRate);
    }

}
