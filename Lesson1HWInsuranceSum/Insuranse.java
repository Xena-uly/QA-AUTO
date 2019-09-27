public class Insurance {
    public static void main(String[] args) {
    String name = "Ivan";
    int age = 70;
    int sumInsur = getInsuredSum(name, age);
    System.out.println(name + "! The sum of your insurance = " + sumInsur + "$");
    }
    public static int getInsuredSum(String name, int age) {
        int sum = 0;
        if (0 <= age && age < 13){
            sum = 10;
        } else if (13 <= age && age < 20) {
            sum = 20;
        } else if (20 <= age && age < 40) {
            sum = 30;
        } else if (40 <= age && age < 60) {
            sum = 40;
        } else {
            System.out.println("Sorry, your age is not eligible for insurance.");
        }
        return sum;
    }
}
