package com.www.nd4jexample.example;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;


public class ReshapeOperationExample {

    public static void main(String[] args) {

        INDArray nd = Nd4j.create(new float[]{1, 2, 3, 4}, new int[]{2, 2});
        INDArray nd3 = Nd4j.create(new float[]{5, 6, 7, 8}, new int[]{2, 2});
        INDArray ndv;

        System.out.println(nd);

        //数组翻转
        ndv = nd.transpose();
        System.out.println("============================");
        System.out.println(ndv);

        INDArray nd2 = Nd4j.create(new float[]{1, 2, 3, 4, 5, 6, 7, 8}, new int[]{2, 4});
        System.out.println(nd2);
        ndv = nd2.transpose();
        System.out.println("============================");
        System.out.println(ndv);

        //数组翻转还原
        ndv = nd2.reshape(2, 4);
        System.out.println("============================");
        System.out.println(ndv);

        ndv = nd2.transpose();
        System.out.println("============================");
        System.out.println(ndv);

        //make the matrix one long line
        ndv = nd2.reshape(8);
        System.out.println(ndv);

        //make the long line to matrix
        nd2 = Nd4j.create(new float[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});
        ndv = nd2.reshape(3,4);
        System.out.println(ndv);


    }
}
