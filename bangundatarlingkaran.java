
public class bangundatarlingkaran {
    static double luas;
    static double keliling;

    static double hitungluas(double radius){
        luas = Math.PI*radius;
        return luas;
    }
    static double hitungkeliling(double radius){
        keliling = 2.0* Math.PI* radius;
        return keliling;
    }
}