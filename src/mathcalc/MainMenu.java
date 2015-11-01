/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathcalc;

import java.util.Scanner;

/**
 *
 * @author S1D3W1ND3R
 */
public class MainMenu {

    /**
     *
     */
    public static Scanner scanIn = new Scanner(System.in);

    /**
     * Greets the user and prompts them for the format.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        start();
    }

    /**
     *
     */
    public static void start() {
        byte choice = 0;
        System.out.println("In what form is the quadratic equation?");
        System.out.printf("\t1. Standard (y=ax^2+bx+c)\n");
        System.out.printf("\t2. Vertex (y=a(x+h)^2+k\n");
        System.out.print("Please enter 1 or 2:");
        while (choice != 1 || choice != 2) {
            choice = scanIn.nextByte();
            if (choice == 1) {
                getStandard();
            } else if (choice == 2) {
                getVertex();
            } else {
                System.out.print("Please enter a valid choice: ");
            }
        }
    }

    /**
     *
     */
    public static void getStandard() {
        double dblA, dblB, dblC;
        System.out.print("Please enter a, b, and c in order "
                + "and separated by a space: ");
        dblA = scanIn.nextDouble();
        dblB = scanIn.nextDouble();
        dblC = scanIn.nextDouble();

        QuadStd quadStd = new QuadStd(dblA, dblB, dblC);

        //vertex
        System.out.printf("The vertex is (%.2f, %.2f)\n",
                quadStd.getVtxH(), quadStd.getVtxK());

        //y-intercept
        System.out.printf("The y-intercept is (0.00, %.2f)\n",
                quadStd.getyIntercept());

        //x-intercepts
        System.out.printf("The two x-intercepts are x = %.2f and x = %.2f\n",
                quadStd.getxInt1(), quadStd.getxInt2());

        reRun();

    }

    /**
     *
     */
    public static void getVertex() {
        double dblA, dblH, dblK;

        System.out.print("Please enter a, h, and k in order "
                + "and separated by a space: ");
        dblA = scanIn.nextDouble();
        dblH = scanIn.nextDouble();
        dblK = scanIn.nextDouble();

        QuadVtx quadVtx = new QuadVtx(dblA, dblH, dblK);

        //vertex
        System.out.printf("The vertex is (%.3f, %.3f)\n",
                quadVtx.getVtxH(), quadVtx.getVtxK());

        //y-intercept
        System.out.printf("The y-intercept is (0.00, %.3f)\n", quadVtx.getyIntercept());

        //x-intercepts
        System.out.printf("The two x-intercepts are x = %.3f and x = %.3f",
                quadVtx.getxInt1(), quadVtx.getxInt2());

        reRun();
    }

    /**
     *
     */
    public static void reRun() {
        String run = "a";
        System.out.print("Run again? (y/n) ");
        run = scanIn.next();
        switch (run) {
            case "y":
            case "Y":
                start();
                break;
            case "n":
            case "N":
                System.exit(0);
            default:
                System.out.print("Please enter y/Y or n/N: ");
                break;
        }
    }
}
