package com.kotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@EnableSwagger2
@SpringBootApplication
open class Application {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
			 System.setProperty("spring.config.location", "/data/nimbus/los2lms/config/application.properties");
            SpringApplication.run(Application::class.java, *args)
        }
    }

    @Bean
    open fun productApi(): Docket =
        Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.nac")).paths(
            PathSelectors.any()
        ).build().apiInfo(this.metaInfo())

    open fun metaInfo(): ApiInfo = ApiInfoBuilder().title("Nimbus - Api Documentation")
        .description("Nimbus services")
        .version("1.0.0")
        .build()

}
