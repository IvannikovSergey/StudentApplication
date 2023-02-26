public class StudentOrderValidator {

    public static void main(String[] args) {
        checkAll();
    }


    static void checkAll() {
        StudentOrder studentOrder = readStudentOrder();
        AnswerCityRegister cityAnswer = checkCityRegister(studentOrder);
        AnswerWedding weddingAnswer = checkWedding(studentOrder);
        AnswerChildren childrenAnswer = checkChildren(studentOrder);
        AnswerStudent studentAnswer = checkStudent(studentOrder);
        sendMail(studentOrder);
    }

    static StudentOrder readStudentOrder() {
        return new StudentOrder();
    }

    static AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
        return new AnswerCityRegister();
    }

    static AnswerWedding checkWedding(StudentOrder studentOrder) {
        return new AnswerWedding();
    }

    static AnswerChildren checkChildren(StudentOrder studentOrder) {
        return new AnswerChildren();
    }

    static AnswerStudent checkStudent(StudentOrder studentOrder) {
        return new AnswerStudent();
    }

    static void sendMail(StudentOrder studentOrder) {
    }

}
