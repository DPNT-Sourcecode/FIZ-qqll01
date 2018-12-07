package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {
//
//    - If the number is a multiple of three then you should write "fizz"
//            - If the number is a multiple of five then you should write "buzz"
//            - If the number is a multiple of both three and five then you should write "fizz buzz"
//            - If the number is not a multiple of five or three then write the number, example 1

    public String fizzBuzz(Integer number)
    {

        StringBuilder result = new StringBuilder();


        result.append(fizz(number));
        result.append(result.length()>0?" ":"");

        result.append(buzz(number));
        result.append(result.length()>0?" ":"");

        result.append(deluxe(number));
        result.append(result.length()==0?number:"");

        return result.toString().trim();
    }

    public String fizz(Integer number){
        return (number%3==0||number.toString().contains("3"))?"fizz":"";
    }

    public String buzz(Integer number){
        return (number%5==0||number.toString().contains("5"))?"buzz":"";
    }

    public String deluxe(Integer number){
        return (number>10&&number.toString().matches("(.)\\1*"))?"deluxe":"";
    }


}



