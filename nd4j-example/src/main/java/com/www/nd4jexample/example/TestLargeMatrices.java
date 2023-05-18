package com.www.nd4jexample.example;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TestLargeMatrices {

    private static Logger log = LoggerFactory.getLogger(TestLargeMatrices.class);


    public static void main(String[] args) {
        INDArray n = Nd4j.linspace(1,10000000,10000000);
        System.out.println("MMUL" + n.mmul(n.transpose()));

    }

}
