package com.saas.blog.user.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2
public class Swagger2 {
    //swagger2的配置文件，这里可以配置swagger2的一些基本的内容，比如扫描的包等等
    @Bean
    public Docket createRestApi() {
        List<Parameter> params = new ArrayList<>();
        params.add(new ParameterBuilder().name("Content-Type").description("内容类型")
                .modelRef(new ModelRef("string"))
                .defaultValue("application/json;charset=utf-8")
                .parameterType("header").required(true).build());
//        {
//            "userGuid": "6480756476603191298",
//                "enterpriseGuid": "6506431195651982337",
//                "enterpriseName": "打印企业1218",
//                "name": "tcw",
//                "tel": "17302856437",
//                "storeGuid": "6506453252643487745",
//                "storeName": "门店0227_3",
//                "account": "100001",
//                "storeNo": "4478046"
//        }
        params.add(new ParameterBuilder().name("userInfo").description("用户信息")
                .modelRef(new ModelRef("string"))
                .defaultValue("%7B%0A%09%22userGuid%22%3A%20%226480756476603191298%22%2C%0A%09%22" +
                        "enterpriseGuid%22%3A%20%226506431195651982337%22%2C%0A%09%22" +
                        "enterpriseName%22%3A%20%22%E6%89%93%E5%8D%B0%E4%BC%81%E4%B8%9A1218%22%2C%0A%09%22" +
                        "name%22%3A%20%22tcw%22%2C%0A%09%22" +
                        "tel%22%3A%20%2217302856437%22%2C%0A%09%22" +
                        "storeGuid%22%3A%20%226506453252643487745%22%2C%0A%09%22" +
                        "storeName%22%3A%20%22%E9%97%A8%E5%BA%970227_3%22%2C%0A%09%22" +
                        "account%22%3A%20%22100001%22%2C%0A%09%22" +
                        "storeNo%22%3A%20%224478046%22%0A%7D")
                .parameterType("header").required(false).build());
        return new Docket(DocumentationType.SWAGGER_2)
                .globalOperationParameters(params)
                .apiInfo(apiInfo())
                .select()
                //为当前包路径
                .apis(RequestHandlerSelectors.basePackage("com.saas.blog.user.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    //构建 api文档的详细信息函数,注意这里的注解引用的是哪个
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title("用户服务 API")
                //版本号
                .version("1.0")
                //描述
                .description("API 描述")
                .build();
    }
}
