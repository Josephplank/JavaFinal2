import java.util.Arrays;

public class RainfallLauncher {

static double sumRain(double[] array){
	double sum = 0;
	for(int i = 0; i < array.length; i++){
		sum += array[i];
		}
	return sum;
	}

// Create a function that returns the average monthly rainFall for the year.
static double averageRain(double[] array){
	double average = 0;
	average = sumRain(array)/array.length;
	return average;
}

// Create a function that returns the month with the most rain.
static double mostRain(double[] array){
	double most = 0;
	for (int i = 0; i < array.length; i++){
		if(array[i] > most){
			most = array[i];
		}
	}
	return most;
}

// Create a function that returns the month with the least rain.
static double leastRain(double[] array){
	double least = array[0];
	for(int i = 0; i < array.length; i++){
		if(array[i] < least){
			least = array[i];
		}
	}
	return least;
}}