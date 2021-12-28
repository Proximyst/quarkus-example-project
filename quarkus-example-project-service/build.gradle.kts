plugins {
    java
    alias(libs.plugins.quarkus)
    alias(libs.plugins.indra)
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(projects.quarkusExampleProjectApi)
    implementation(platform(libs.quarkus.universe.bom))
    testImplementation(libs.quarkus.junit5)
    testImplementation(libs.restassured)

    compileOnly(libs.immutables)
    annotationProcessor(libs.immutables)
}

indra {
    javaVersions().target(17)
}
