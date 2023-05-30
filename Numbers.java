public class Numbers implements Actions {
    public double number1;
    public double number2;

    public Numbers(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    @Override
    public void summation() {
        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
    }

    @Override
    public void subtraction() {
        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
    }

    @Override
    public void multiplication() {
        
        System.out.println(number1 + " * " + number2 + " = " + number1 * number2);
    }

    @Override
    public void division() {
        System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
    }



}
