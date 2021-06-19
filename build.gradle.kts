import extensions.*
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.5.1"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	kotlin("jvm") version "1.5.10"
	kotlin("plugin.spring") version "1.5.10"
}

group = Config.GROUP
version = Config.VERSION
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
}

dependencies {

	addBaseSpringBootDependencies()

	addKotlinDependencies()

	addDatabaseDependencies()

	addTestDependencies()

	addDevToolsDependencies()
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = Config.FREE_COMPILE_ARGS
		jvmTarget = Config.JVM_TARGET
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
