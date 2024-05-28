/*
Overloading:

Occurs when two or more methods in the same class have the same name but different parameters (different type, number, or order of parameters).
Provides multiple ways to call a method.
*/

class MathUtils {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
