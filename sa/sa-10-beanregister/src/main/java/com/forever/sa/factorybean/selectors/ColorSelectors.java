package com.forever.sa.factorybean.selectors;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author: Forever丶诺
 * @createTime: 2018-6-12.23:23
 */
@Slf4j
public class ColorSelectors implements ImportSelector {

    /**
     * @param importingClassMetadata
     * @return
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println(importingClassMetadata);
        String packageName = "com.forever.sa.beanregister.model.";
        return     new String[] {packageName+"Red",packageName+"Black"};
    }
}
