package com.test.design.抽象工厂模式;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by admin on 2017/5/22.
 */
public class math {


    public static void main(String[] args) {


    }

//    private static BigDecimal add(final long xs, int scale1, final long ys, int scale2) {
//        long sdiff = (long) scale1 - scale2;// 计算相加的两个数字的标度差异
//        if (sdiff == 0) {// 如果是相同的标度，直接进行运算
//            return add(xs, ys, scale1);
//        } else if (sdiff < 0) {//如果前一个数字的标度小于后一个
//            int raise = checkScale(xs,-sdiff);//检测标度差异
//            long scaledX = longMultiplyPowerTen(xs, raise);//换算成最大标度的值
//            if (scaledX != INFLATED) {// 非小
//                return add(scaledX, ys, scale2);// 按照较大标度的值进行运算
//            } else {// 最小的话
//                BigInteger bigsum = bigMultiplyPowerTen(xs,raise).add(ys);
//                return ((xs^ys)>=0) ? // same sign test
//                        new BigDecimal(bigsum, INFLATED, scale2, 0)
//                        : valueOf(bigsum, scale2, 0);
//            }
//        } else {//如果前一个数字的标度大于后一个
//            int raise = checkScale(ys,sdiff);
//            long scaledY = longMultiplyPowerTen(ys, raise);
//            if (scaledY != INFLATED) {
//                return add(xs, scaledY, scale1);//同理
//            } else {
//                BigInteger bigsum = bigMultiplyPowerTen(ys,raise).add(xs);
//                return ((xs^ys)>=0) ?
//                        new BigDecimal(bigsum, INFLATED, scale1, 0)
//                        : valueOf(bigsum, scale1, 0);
//            }
//        }
//    }
}
