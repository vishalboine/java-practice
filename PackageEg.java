// import tools.Calc;
// import tools.advCalc;    accessing specific files from tools folder

import tools.*;     //using * will have access to files inside that folder. Not to all folders inside folder. Only to files.

public class PackageEg {

    private int privateVar = 20;        // private var can only be accessed within only same class irrespective of package.
    public static void main(String[] args) {
        CalcPackage c = new CalcPackage();
        AdvCalcPackage ac = new AdvCalcPackage();
        PackageEg2 c2 = new PackageEg2();
        System.out.println(c.num1);
        System.out.println(c2.marks);
        c.showCalc();
        ac.showAdvCalc();
    }
}
