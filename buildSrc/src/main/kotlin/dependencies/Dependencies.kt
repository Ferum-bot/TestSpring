package dependencies

object Dependencies {

    /**
     * Spring boot data base dependencies.
     */
    const val MONGO_DB = "org.springframework.boot:spring-boot-starter-data-mongodb"
    const val JPA = "org.springframework.boot:spring-boot-starter-data-jpa"
    const val H2 = "com.h2database:h2"

    /**
     * Base spring boot dependencies.
     */
    const val WEB = "org.springframework.boot:spring-boot-starter-web"
    const val JACKSON = "com.fasterxml.jackson.module:jackson-module-kotlin"

    /**
     * Test spring boot dependencies.
     */
    const val TEST = "org.springframework.boot:spring-boot-starter-test"

    /**
     * Kotlin spring boot dependencies.
     */
    const val KOTLIN_REFLECT = "org.jetbrains.kotlin:kotlin-reflect"
    const val KOTLIN_JDK = "org.jetbrains.kotlin:kotlin-stdlib-jdk8"

    /**
     * Development spring boot tools.
     */
    const val DEV_TOOLS = "org.springframework.boot:spring-boot-devtools"
}