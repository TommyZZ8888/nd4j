package com.www.nd4jexample.example;

import org.apache.commons.io.IOUtils;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

import java.io.ByteArrayInputStream;

import static org.nd4j.linalg.ops.transforms.Transforms.*;


/**
 * @author DELL
 */
public class FunctionsExample {

    public static void main(String[] args) {


        INDArray nd = Nd4j.create(new float[]{1, 2, 3, 4, 5, 6}, new int[]{2, 3});
        INDArray ndv;

        // sigmoid = 1/(1+e^-x)
        //预测模型逻辑回归 使数据正常化，激活深度学习网络中的人工神经元 ==激活函数
        ndv = sigmoid(nd);
        System.out.println(ndv);

        //绝对值
        ndv = abs(nd);
        System.out.println("========================");
        System.out.println(ndv);

        //转换数据的双曲函数 ==激活函数的一种
        ndv = tanh(nd);
        System.out.println("========================");
        System.out.println(ndv);

        //haedTanh函数，将值限制在[-1,1]之间，输入在这之间，输出等于输入；小于-1输出-1，大于1输出1
        ndv = hardTanh(nd);
        System.out.println("========================");
        System.out.println(ndv);

        //e=2.7183 exp()==e的x次方
        ndv = exp(nd);
        System.out.println("========================");
        System.out.println(ndv);

        //返回开方数
        ndv = sqrt(nd);
        System.out.println("========================");
        System.out.println(ndv);
    }
}
