package com.test.design.抽象工厂模式;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by admin on 2017/4/23.
 */
public class Main {


    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("2.21211");
        BigDecimal b = new BigDecimal("1.01201");
        BigDecimal c = new BigDecimal("11");
//        int i = b.intValue();
//
//        System.out.println(b.precision());
//
//        System.out.println(a.add(b));
//        System.out.println(c.precision());

        System.out.println(a.divide(b,2,BigDecimal.ROUND_CEILING));//


    }
//    private static BigDecimal divide(long dividend, int dividendScale, long divisor, int divisorScale, int scale, int roundingMode) {
//        if (checkScale(dividend,(long)scale + divisorScale) > dividendScale) {// 如果指定的标度+除数的标度>被除数的标度
//            int newScale = scale + divisorScale; // 新的标度为二者之和
//            int raise = newScale - dividendScale;// 新增的标度数
//            if(raise<LONG_TEN_POWERS_TABLE.length) {//
//                long xs = dividend;// 赋值
//                if ((xs = longMultiplyPowerTen(xs, raise)) != INFLATED) {
//                    return divideAndRound(xs, divisor, scale, roundingMode, scale);
//                }
//                BigDecimal q = multiplyDivideAndRound(LONG_TEN_POWERS_TABLE[raise], dividend, divisor, scale, roundingMode, scale);
//                if(q!=null) {
//                    return q;
//                }
//            }
//            BigInteger scaledDividend = bigMultiplyPowerTen(dividend, raise);
//            return divideAndRound(scaledDividend, divisor, scale, roundingMode, scale);
//        } else {
//            int newScale = checkScale(divisor,(long)dividendScale - scale);
//            int raise = newScale - divisorScale;
//            if(raise<LONG_TEN_POWERS_TABLE.length) {
//                long ys = divisor;
//                if ((ys = longMultiplyPowerTen(ys, raise)) != INFLATED) {
//                    return divideAndRound(dividend, ys, scale, roundingMode, scale);
//                }
//            }
//            BigInteger scaledDivisor = bigMultiplyPowerTen(divisor, raise);
//            return divideAndRound(BigInteger.valueOf(dividend), scaledDivisor, scale, roundingMode, scale);
//        }


//    private static BigDecimal divideAndRound(long ldividend, long ldivisor, int scale, int roundingMode,
//                                             int preferredScale) {
//
//        int qsign; // quotient sign
//        long q = ldividend / ldivisor; // store quotient in long
//        if (roundingMode == ROUND_DOWN && scale == preferredScale) // 直接返回
//            return valueOf(q, scale);
//        long r = ldividend % ldivisor; // store remainder in long 取余
//        qsign = ((ldividend < 0) == (ldivisor < 0)) ? 1 : -1;// 做标记
//        if (r != 0) { // 有余数
//            boolean increment = needIncrement(ldivisor, roundingMode, qsign, q, r);
//            return valueOf((increment ? q + qsign : q), scale);
//        } else {
//            if (preferredScale != scale)
//                return createAndStripZerosToMatchScale(q, scale, preferredScale);
//            else
//                return valueOf(q, scale);
//        }
//    }
    }
