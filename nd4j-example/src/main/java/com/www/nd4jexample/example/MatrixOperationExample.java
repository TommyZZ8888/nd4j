package com.www.nd4jexample.example;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;



public class MatrixOperationExample {

    public static void main(String[] args) {

        INDArray nd = Nd4j.create(new float[]{1, 2}, new int[]{2});
        INDArray nd5 = Nd4j.create(new float[]{1, 2}, new int[]{1,2});
        INDArray nd2 = Nd4j.create(new float[]{3, 4}, new int[]{2, 1});
        INDArray nd3 = Nd4j.create(new float[]{1, 2, 3, 4}, new int[]{2, 2});
        INDArray nd4 = Nd4j.create(new float[]{3, 4, 5, 6}, new int[]{2, 2});
        System.out.println(nd);

        //两个数组的乘积
        INDArray ndv = nd.mmul(nd2);
        System.out.println(ndv);

        ndv = nd.mmul(nd4);
        System.out.println("=====================");
        System.out.println(ndv);

        ndv = nd5.mmul(nd4);
        System.out.println("=====================");
        System.out.println(ndv);

        ndv = nd3.mmul(nd4);
        System.out.println("========================");
        System.out.println(ndv);

        ndv = nd4.mmul(nd3);
        System.out.println("========================");
        System.out.println(ndv);

        //Cannot execute matrix multiplication: [2, 1]x[2]: inputs are not matrices
//        ndv = nd2.mmul(nd);
//        System.out.println("========================");
//        System.out.println(ndv);
//

        //Cannot execute matrix multiplication: [2, 1]x[2, 2]: Column of left array 1 != rows of right
//        INDArray nd5 = Nd4j.create(new float[]{1,1,2,2},new int[]{2,2});
//        ndv = nd2.mmul(nd5);
//        System.out.println(ndv);
    }

}
