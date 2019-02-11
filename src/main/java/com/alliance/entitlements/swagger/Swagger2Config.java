package com.alliance.entitlements.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@ComponentScan(basePackages = { "com.alliance.entitlements.*.controller.*" }) // 配置controller路径
public class Swagger2Config {

	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
//				.paths(Predicates.or(
//						// 这里添加你需要展示的接口
//						PathSelectors.ant("/api/v1/entitlement/**"), PathSelectors.ant("/xxx/**"), PathSelectors.ant("/qqq/**"),
//						PathSelectors.ant("/eee/**")))
				.paths(PathSelectors.any())
				.apis(RequestHandlerSelectors.basePackage("com.alliance.entitlements"))
				.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("EMS API").description("RESTful APIs").contact("hongyi.a.song@accenture.com").version("1.0")
				.build();
	}
}
