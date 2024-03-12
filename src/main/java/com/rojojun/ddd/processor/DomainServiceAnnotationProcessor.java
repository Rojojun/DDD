package com.rojojun.ddd.processor;

import com.google.auto.service.AutoService;
import com.rojojun.ddd.common.annotation.DomainService;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Set;

@SupportedAnnotationTypes("com.rojojun.ddd.common.annotation.DomainService")
@SupportedSourceVersion(SourceVersion.RELEASE_11)
@AutoService(Processor.class)
public class DomainServiceAnnotationProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        for (Element element : roundEnv.getElementsAnnotatedWith(DomainService.class)) {
            String packageName = processingEnv.getElementUtils().getPackageOf(element).getQualifiedName().toString();
            if (!packageName.contains(".domain.")) {
                processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR,
                        "@DomainService 어노테이션은 'domain' 패키지에만 허용됩니다.", element);
            }
        }
        return true;
    }
}
