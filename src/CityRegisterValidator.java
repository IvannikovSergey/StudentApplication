public class CityRegisterValidator {

    String hostName;
    AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
        AnswerCityRegister answerCityRegister = new AnswerCityRegister();
        System.out.println("CityRegister is running " + hostName);
        answerCityRegister.success = false;
        return answerCityRegister;
    }
}
