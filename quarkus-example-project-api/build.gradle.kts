plugins {
    `java-library`
    alias(libs.plugins.quarkus)
    alias(libs.plugins.indra)
}

repositories {
    mavenCentral()
}

dependencies {
    api(platform(libs.quarkus.universe.bom))
    api(libs.quarkus.arc)
    api(libs.quarkus.resteasy)
    api(libs.quarkus.resteasy.jackson)

    api(libs.checker.qual)
    compileOnly(libs.immutables)
    annotationProcessor(libs.immutables)
}

indra {
    javaVersions().target(8)
}
