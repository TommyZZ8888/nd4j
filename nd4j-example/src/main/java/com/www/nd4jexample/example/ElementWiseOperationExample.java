package com.www.nd4jexample.example;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;



 
public class ElementWiseOperationExample {

    public static void main(String[] args) {

        INDArray nd = Nd4j.create(new float[]{1, 2, 3, 4}, new int[]{2,2});
        INDArray nd2 = Nd4j.create(new float[]{5, 6}, new int[]{2, 1});
        INDArray nd3 = Nd4j.create(new float[]{5, 6}, new int[]{2});
        INDArray nd4 = Nd4j.create(new float[]{5, 6, 7, 8}, new int[]{2, 2});
        System.out.println(nd);

        INDArray ndv = nd.add(1);
        System.out.println("=============================");
        System.out.println(ndv);

        ndv = nd.sub(1);
        System.out.println("=============================");
        System.out.println(ndv);

        ndv = nd.mul(2);
        System.out.println("=============================");
        System.out.println(ndv);

        ndv = nd.div(2);
        System.out.println("=============================");
        System.out.println(ndv);

        //add column vector to matrix
        ndv = nd.addColumnVector(nd2);
        System.out.println("=============================");
        System.out.println(ndv);

        //add row vector to matrix
        ndv = nd.addRowVector(nd3);
        System.out.println("=============================");
        System.out.println(ndv);

        //multiply two matrices of equal dimensions elementwise.
        ndv = nd.mul(nd4);
        System.out.println("=============================");
        System.out.println(ndv);
    }
}
