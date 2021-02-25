package com.kctech.assesment4;

public class Hill {
    public static int compute(int[] input)
    {
        int upperRange = 0;
        int i=1;
        int[] workingArray = input.clone();
        int c;
        boolean valid;
        while (i < input.length) {
            workingArray[0]=input[0]-upperRange;
            workingArray[i] = input[i] - upperRange;
            c= -upperRange;
            valid = true;
            while(workingArray[i]<=workingArray[i-1]) {
                if (c>upperRange) {
                    upperRange++;
                    valid = false;
                    break;
                }
                workingArray[i] = input[i] + c;
                c++;
            }
            if (valid) {
                i++;
            } else {
                i=1;
            }
        }

        return upperRange;
    }

    public static void main(String[] args) {
        int[] a= {5,4,1,2,1};
        System.out.print(Hill.compute(a));

    }
}
