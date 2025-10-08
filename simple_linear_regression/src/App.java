
import java.util.Arrays;
import java.util.Scanner;


class LinearRegression {
    private double m;
    private double b;

    // FIX: The constructor is now empty, which is cleaner.
    // The 'fit' method is responsible for setting m and b.
    public LinearRegression() {}

    private double getSum(double[] data) {
        double sum = 0;
        for (double d : data) {
            sum += d;
        }
        return sum;
    }

    private double getMean(double[] data) {
        if (data.length == 0) {
            return 0;
        }
        return getSum(data) / data.length;
    }

    public void fit(double[] X_train, double[] y_train) {
        if (X_train.length != y_train.length) {
            throw new IllegalArgumentException("X_train and y_train should be of same length");
        }

        double mean_x = getMean(X_train);
        double mean_y = getMean(y_train);

        double numerator = 0;
        double denominator = 0;

        for (int i = 0; i < X_train.length; i++) {
            numerator += (X_train[i] - mean_x) * (y_train[i] - mean_y);
            denominator += (X_train[i] - mean_x) * (X_train[i] - mean_x);
        }

        this.m = numerator / denominator;
        this.b = mean_y - (this.m * mean_x);

        System.out.println("Model fitted successfully...");
    }

    public double[] predict(double[] X_test) {
        double[] prediction = new double[X_test.length];
        for (int i = 0; i < X_test.length; i++) {
            prediction[i] = this.m * X_test[i] + this.b;
        }
        return prediction;
    }

    public double getSlope() {
        return this.m;
    }

    public double getIntercept() {
        return this.b;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        double[] cgpa = {6.89, 5.12, 7.82, 7.42, 6.94, 7.89, 6.73, 6.75, 6.09, 8.31};
        double[] lpa = {3.26, 1.98, 3.25, 3.67, 3.57, 2.99, 2.60, 2.48, 2.31, 3.51};


        LinearRegression model = new LinearRegression();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Training the model...");
        model.fit(cgpa, lpa);


        // learned parameters
          System.out.printf("Model Parameters:\n");
        System.out.printf("Slope (m): %.4f\n", model.getSlope());
        System.out.printf("Intercept (b): %.4f\n\n", model.getIntercept());




         System.out.print("Enter a CGPA value to predict the LPA: ");
        double valueToPredict = scanner.nextDouble();
        double[] prediction = model.predict(new double[]{ valueToPredict });

        System.out.printf("Predicted LPA: %.2f\n\n" , prediction[0]);

    }
}
