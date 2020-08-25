package challenge.gbm;

public class ChallengeUtility {

    public static int getFactorial(int number) throws Exception {
        //verify if number is grater than 0
        if(number > 0){
            int factorial;
            if(number==1){
                return 1;
            }
            //Recursion
            factorial = getFactorial(number - 1) * number;
            return factorial;
        }else {
           throw new Exception("Number can not be 0");
        }


    }

    public static boolean validateArray(char[] array,char... values){
       boolean elementValidated = false;
       for(char value : values){
           for(char arrayElement : array){
               if(value == arrayElement){
                   elementValidated = true;
                   break;
               }else {
                   elementValidated = false;
               }
           }
           if(elementValidated == false){
               return false;
           }
       }
        return elementValidated;
    }

    public static int sumElements(int[] elements){
        int sum = 0;
        for(int element : elements){
            sum +=element;
        }
        return sum;
    }

    public static int calculateModules(int numberOne,int numberTwo) throws Exception {
        int module=0;
        //numbers can not be 0
        if(numberOne > 0 && numberTwo >0){
            int division = numberOne / numberTwo;
            module = numberOne - (division * numberTwo);
        }else {
            throw  new Exception("Numbers can not be 0");
        }
        return module;
    }

    public static int getNumberOfDays(int month,int year) throws Exception {
        int numberOfDays = 0;

        switch (month) {
            case 1:
                numberOfDays = 31;
                break;
            case 2:
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    numberOfDays = 29;
                } else {
                    numberOfDays = 28;
                }
                break;
            case 3:
                numberOfDays = 31;
                break;
            case 4:
                numberOfDays = 30;
                break;
            case 5:
                numberOfDays = 31;
                break;
            case 6:
                numberOfDays = 30;
                break;
            case 7:
                numberOfDays = 31;
                break;
            case 8:
                numberOfDays = 31;
                break;
            case 9:
                numberOfDays = 30;
                break;
            case 10:
                numberOfDays = 31;
                break;
            case 11:
                numberOfDays = 30;
                break;
            case 12:
                numberOfDays = 31;
                break;
            default:
                throw new Exception("Month should be a value between 1 and 12");

        }
        return numberOfDays;
    }

}
