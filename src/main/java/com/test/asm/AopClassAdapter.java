package com.test.asm;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/**
 * Created by admin on 2017/6/13.
 * 用来处理哪些方法需要进行修改
 */
public class AopClassAdapter extends ClassVisitor implements Opcodes {


    public AopClassAdapter(int i, ClassVisitor classVisitor) {
        super(i, classVisitor);
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
        MethodVisitor mv = super.visitMethod(access, name, desc, signature, exceptions);
        // 对test开头的方法进行特殊处理
        if (name.startsWith("test")) {
            mv = new AopMethodVisitor(this.api, mv);
        }
        return mv;
    }
}
