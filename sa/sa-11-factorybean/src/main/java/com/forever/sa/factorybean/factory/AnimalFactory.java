package com.forever.sa.factorybean.factory;

import com.forever.sa.factorybean.model.Animal;
import com.forever.sa.factorybean.model.Cat;
import com.forever.sa.factorybean.model.Dog;
import lombok.Data;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-13.0:13
 */
@Data
public class AnimalFactory implements FactoryBean {

    private String childName;

    public AnimalFactory(String childName) {
        this.childName = childName;
    }

    /**
     * 创建的对象
     * @return
     * @throws Exception
     */
    @Override
    public Object getObject() throws Exception {
        if (childName.equals("dog")){
            return new Dog();
        }else if (childName.equals("cat")){
            return new Cat();
        }
        return null;
    }

    /**
     * 放入到spring容器中的类型
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return Animal.class;
    }

    /**
     * 单例还是多例
     * @return
     */
    @Override
    public boolean isSingleton() {
        return true;
    }
}
