package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {


    public String fizzBuzz(Integer number)
    {

        StringBuilder result = new StringBuilder();


        result.append(fizz(number));

        result.append(buzz(number));

        result.append(deluxe(number));
        result.append(result.length()==0?number:"");

        return result.toString().replaceAll("  "," ").trim();
    }

    public String fizz(Integer number){
        return (number%3==0||number.toString().contains("3"))?"fizz ":"";
    }

    public String buzz(Integer number){
        return (number%5==0||number.toString().contains("5"))?"buzz ":"";
    }



    public String deluxe(Integer number){
        return (fizz(number).length()>0||buzz(number).length()>0)?(number%2==1?"fake ":"")+"deluxe":"";
    }


}



