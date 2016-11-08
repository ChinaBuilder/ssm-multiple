
package com.it.dubbo.demo;

import org.springframework.stereotype.Service;

/**
 * 此处提供接口
 */
@Service
public interface DemoService {

	String sayHello(String name);

}