package com.test.springbootcxf.rest;

import com.test.springbootcxf.entity.Role;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lzy
 * @create 2018-04-09 下午4:23
 */
@RestController
@RequestMapping("/rest/services")
public class RestServiceController {
    private static final Logger LOGGER = LoggerFactory.getLogger(RestServiceController.class);
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/home")
    public String home(String name) {
        LOGGER.info("call rest interface.");
        return "Hello World!" + name;
    }

    @RequestMapping("/role/list")
    public Role getCounter() {
        Role role = new Role();
        role.setId(counter.incrementAndGet());
        role.setName("test");
        role.setNote("test note");
        return role;
    }

    @RequestMapping("/role/creste")
    public Role getCounter(@RequestParam(value = "name") String name, @RequestParam(value = "note", defaultValue = "note") String note) {
        Role role = new Role();
        role.setId(counter.incrementAndGet());
        role.setName(name);
        role.setNote(note);
        return role;
    }
}
