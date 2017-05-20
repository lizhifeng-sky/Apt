package com.example;

import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.Name;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.TypeMirror;

/**
 * Created by Administrator on 2017/5/20 0020.
 */
public class BindViewField {
    private VariableElement variableElement;
    private int mResId;

    public BindViewField(Element element) {
        if (element.getKind()!= ElementKind.FIELD){
            throw new IllegalArgumentException(
                    String.format("\"Only fields can be annotated with @%s\",\n" +
                    "                    BindView.class.getSimpleName())"));
        }
        variableElement = (VariableElement) element;
        LzfBindView bindView=variableElement.getAnnotation(LzfBindView.class);
        mResId=bindView.value();
        if (mResId<0){
            throw new IllegalArgumentException( String.format("value() in %s for field %s is not valid !", LzfBindView.class.getSimpleName(),
                    variableElement.getSimpleName()));
        }
    }
    /**
     * 获取变量名称
     *
     * @return
     */
    Name getFieldName() {
        return variableElement.getSimpleName();
    }

    /**
     * 获取变量id
     *
     * @return
     */
    int getResId() {
        return mResId;
    }

    /**
     * 获取变量类型
     *
     * @return
     */
    TypeMirror getFieldType() {
        return variableElement.asType();
    }
}
