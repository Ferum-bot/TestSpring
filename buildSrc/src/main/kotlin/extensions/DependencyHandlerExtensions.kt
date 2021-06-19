package extensions

import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.dsl.DependencyHandler
import dependencies.Dependencies

fun DependencyHandler.implementation(dependencyNotation: String): Dependency? =
    add("implementation", dependencyNotation)

fun DependencyHandler.implementation(dependencyNotation: Any): Dependency? =
    add("implementation", dependencyNotation)

fun DependencyHandler.runtimeOnly(dependencyNotation: String): Dependency? =
    add("runtimeOnly", dependencyNotation)

fun DependencyHandler.runtimeOnly(dependencyNotation: Any): Dependency? =
    add("runtimeOnly", dependencyNotation)

fun DependencyHandler.developmentOnly(dependencyNotation: String): Dependency? =
    add("developmentOnly", dependencyNotation)

fun DependencyHandler.developmentOnly(dependencyNotation: Any): Dependency? =
    add("developmentOnly", dependencyNotation)

fun DependencyHandler.api(dependencyNotation: String): Dependency? =
    add("api", dependencyNotation)

fun DependencyHandler.kapt(dependencyNotation: String): Dependency? =
    add("kapt", dependencyNotation)

fun DependencyHandler.testImplementation(dependencyNotation: String): Dependency? =
    add("testImplementation", dependencyNotation)

fun DependencyHandler.addDatabaseDependencies() {
    implementation(Dependencies.MONGO_DB)
    implementation(Dependencies.JPA)
    runtimeOnly(Dependencies.H2)
}

fun DependencyHandler.addBaseSpringBootDependencies() {
    implementation(Dependencies.WEB)
    implementation(Dependencies.JACKSON)
}

fun DependencyHandler.addTestDependencies() {
    testImplementation(Dependencies.TEST)
}

fun DependencyHandler.addKotlinDependencies() {
    implementation(Dependencies.KOTLIN_REFLECT)
    implementation(Dependencies.KOTLIN_JDK)
}

fun DependencyHandler.addDevToolsDependencies() {
    developmentOnly(Dependencies.DEV_TOOLS)
}