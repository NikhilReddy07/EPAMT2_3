package interest;

public class InterestCalculator {
	
	//rate is annual rate & time is number of years
	
	double simpleInterest(double principal, double rate, double time)
	{
		return ((principal*rate*time)/100);
	}
	
	double compoundInterest(double principal, double rate, double time)
	{
		return (principal*(Math.pow((1 + rate/100),time)));
	}
}
