public class SaveStudentOrder {
    public static void main(String[] args) {

        StudentOrder studentOrder = new StudentOrder();
        studentOrder.husbandFirstName = "Петя";
        studentOrder.husbandLastName = "Петров";
        studentOrder.wifeFirstName = "Маша";
        studentOrder.wifeLastName = "Петрова";

        long answer = saveStudentOrder(studentOrder);
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 100;
        return answer;
    }
}