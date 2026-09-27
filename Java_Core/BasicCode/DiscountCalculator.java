package Java_Core.BasicCode;

public class DiscountCalculator {
    private double cartTotal;
    private String customerType;

    public void setCartTotal(double cartTotal){
        this.cartTotal = cartTotal;
    }

    public void setCustomerType(String customerType){
        this.customerType = customerType;
    }

    public double calculateDiscount(){
        if("REGULAR".equalsIgnoreCase(this.customerType)){
            if(this.cartTotal>=100){
                double discountAmount;
                discountAmount = this.cartTotal - (this.cartTotal * (5.0/100.0));
                return discountAmount;
            }
            return this.cartTotal;
        }
        else if("PREMIUM".equalsIgnoreCase(this.customerType)){
            double discountAmount;
            if(this.cartTotal<200){

                discountAmount = this.cartTotal - (this.cartTotal * (10.0/100.0));
                return discountAmount;
            }
            else{

                discountAmount = this.cartTotal - (this.cartTotal * (15.0/100.0));
                return discountAmount;
            }

        }
        else if("EMPLOYEE".equalsIgnoreCase(this.customerType)){
            double discountAmount;


                discountAmount = this.cartTotal - (this.cartTotal * (25.0/100.0));
                return discountAmount;



        }
        else{
            return this.cartTotal;
        }
    }


}


