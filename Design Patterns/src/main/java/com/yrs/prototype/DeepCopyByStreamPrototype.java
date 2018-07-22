package com.yrs.prototype;

import java.io.*;
import java.util.ArrayList;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 9:43 2018/7/18
 * @Modified By:
 */
public class DeepCopyByStreamPrototype implements Serializable {

    private ArrayList<String> arrayList = new ArrayList<String>();

    public DeepCopyByStreamPrototype deepCopy() throws IOException, ClassNotFoundException {
        //将对象写入流中
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        //将对象从流中取出来
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (DeepCopyByStreamPrototype) ois.readObject();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DeepCopyByStreamPrototype prototype = new DeepCopyByStreamPrototype();
        prototype.arrayList.add("yrs");
        DeepCopyByStreamPrototype copyPrototype = prototype.deepCopy();
        System.out.println(copyPrototype);
    }

}
