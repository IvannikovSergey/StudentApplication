public class StudentOrderValidator {

    public static void main(String[] args) {
        checkAll();
    }


    static void checkAll() {


        while (true) {
            StudentOrder studentOrder = readStudentOrder();
            if (studentOrder == null) {
                break;
            }

            AnswerCityRegister cityAnswer = checkCityRegister(studentOrder);
            if (!cityAnswer.success) {
                continue;
            }
            AnswerWedding weddingAnswer = checkWedding(studentOrder);
            AnswerChildren childrenAnswer = checkChildren(studentOrder);
            AnswerStudent studentAnswer = checkStudent(studentOrder);
            sendMail(studentOrder);
        }
    }

    static StudentOrder readStudentOrder() {
        return new StudentOrder();
    }

    static AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
        AnswerCityRegister answerCityRegister = new AnswerCityRegister();
        System.out.println("CityRegister is running");
        answerCityRegister.success = false;
        return answerCityRegister;
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
