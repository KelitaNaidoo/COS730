/*
This class centralises the decision logic for the final evaluation outcome.
It replaces scattered conditional logic by applying the decision table rules.
*/

import java.util.List;

public class DecisionTable 
{
    public String determineOutcome(List<Double> scoreList) 
	{
        System.out.println("Determining outcome...");

        double average = calculateAverage(scoreList);
        boolean consensus = checkConsensus(scoreList);

        System.out.println("Average = " + average);
        System.out.println("Consensus: " + consensus);

        if (average >= 75 && consensus) 
		{
            return "accepted";
        } else if (average < 50) 
		{
            return "rejected";
        } else {
            return "revision";
        }
    }

    private double calculateAverage(List<Double> scoreList) 
	{
        double total = 0;

        for (double score : scoreList) 
		{
            total += score;
        }

        return total / scoreList.size();
    }

    private boolean checkConsensus(List<Double> scoreList) 
	{
        double highest = scoreList.get(0);
        double lowest = scoreList.get(0);

        for (double score : scoreList) 
		{
            if (score > highest) 
			{
                highest = score;
            }

            if (score < lowest) 
			{
                lowest = score;
            }
        }
		
        return (highest - lowest) <= 15;
    }
}