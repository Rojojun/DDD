package com.rojojun.ddd.processor;

import com.google.auto.service.AutoService;
import com.rojojun.ddd.common.annotation.DomainService;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Set;

@SupportedAnnotationTypes("com.rojojun.ddd.common.annotation.DomainService")
@SupportedSourceVersion(SourceVersion.RELEASE_11)
@AutoService(Processor.class)
public class DomainServiceAnnotationProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        for (TypeElement annotation : annotations) {
            for (Element element : roundEnv.getElementsAnnotatedWith(annotation)) {
                if (element.getKind() == ElementKind.CLASS) {
                    PackageElement packageElement = (PackageElement) element.getEnclosingElement();
                    String packageName = packageElement.getQualifiedName().toString();
                    if (!packageName.contains("Service")) {
                        processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR,
                                "Classes annotated with @SpecialService must be in a package containing 'Service'.", element);
                    }
                }
            }
        }
        return true;
    }
}
